package org.accenture.day12.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.accenture.day12.mapper.GreetingMapperManual;
import org.accenture.day12.model.Greeting;
import org.accenture.day12.model.GreetingResponseDTO;
import org.accenture.day12.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.accenture.day12.util.ApplicationConstants.GREETING_FILE_NAME;

@Slf4j
@Service
public class GreetingService {
    private final GreetingRepository greetingRepository;
    //private final GreetingMapper greetingMapper;
    private final GreetingMapperManual greetingMapper;
    @Autowired
    private ObjectMapper objectMapper;

    @PostConstruct
    public void init() {
        log.info("Populating InMemory DB...");
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(GREETING_FILE_NAME)) {
            if (is == null) {
                log.error("Could not find {}", GREETING_FILE_NAME);
                return;
            }
            List<Greeting> greetings = objectMapper.readValue(is, new TypeReference<>() {
            });
            greetings.forEach(greeting -> {
                log.info("Loaded greeting: {}", greeting);
                greeting.setUpdatedAt(Instant.now());
                greetingRepository.save(greeting);
            });

        } catch (Exception e) {
            log.error("Failed to load {}", GREETING_FILE_NAME, e);
        }
    }

    public GreetingService(GreetingRepository greetingRepository, GreetingMapperManual greetingMapper) {
        this.greetingRepository = greetingRepository;
        this.greetingMapper = greetingMapper;
    }

    public Optional<GreetingResponseDTO> getGreetingById(Integer id) {
        return greetingRepository.findById(id)
                .map(greetingMapper::toDto);
    }

    public List<GreetingResponseDTO> findAllGreetings() {
        return greetingRepository.findAll()
                .stream()
                .map(greetingMapper::toDto)
                .collect(Collectors.toList());
    }

}

