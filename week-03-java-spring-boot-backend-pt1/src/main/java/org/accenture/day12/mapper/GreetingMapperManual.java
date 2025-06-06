package org.accenture.day12.mapper;

import org.accenture.day12.model.Greeting;
import org.accenture.day12.model.GreetingResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class GreetingMapperManual {
    public GreetingResponseDTO toDto(Greeting greeting) {
        if (greeting == null) {
            return null;
        }
        GreetingResponseDTO dto = new GreetingResponseDTO();
        dto.setGreeting(greeting.getGreeting());
        dto.setLanguage(greeting.getLanguage());
        dto.setRegion(greeting.getRegion());
        dto.setType(greeting.getType());
        return dto;
    }
}
