package day13.service;

import day13.configuration.ApiProperties;
import day13.mapper.GreetingApiMapper;
import day13.model.GreetingClientResponseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;

@Service
public class GreetingAggregatorService {
    private final RestTemplate restTemplate;
    private final ApiProperties apiProperties;
    private final GreetingApiMapper greetingApiMapper;

    public GreetingAggregatorService(RestTemplate restTemplate, ApiProperties apiProperties, GreetingApiMapper greetingApiMapper) {
        this.restTemplate = restTemplate;
        this.apiProperties = apiProperties;
        this.greetingApiMapper = greetingApiMapper;
    }

    // TODO Group greetings by region (Map<String, List<GreetingClientResponseDTO>>)
    public Map<String, List<GreetingClientResponseDTO>> getGroupByRegion() {
        return null;
    }

    // TODO Group greetings by type (Map<String, List<GreetingClientResponseDTO>>)
    public Map<String, List<GreetingClientResponseDTO>> getGroupByType() {
        return null;
    }

    // TODO Count group greetings by type (Map<String, Long>)
    public Map<String, Long> getCountGroupByType() {
        return null;
    }

    // TODO Count group greetings by region (Map<String, Integer>)
    public Map<String, Integer> getCountGroupByRegion() {
        return null;
    }

    // TODO Get greetings list that start with each character (Map<Character, List<String>>)
    public Map<Character, List<String>> getGreetingsPerCharacter() {
        return null;
    }

    // TODO List all region spoken per languages (Map<String, Set<String>>)
    public Map<String, Set<String>> getRegionsPerLanguage() {
        return null;
    }

    // TODO Group greetings first by region, then by type within each region Map<String, Map<String, List<GreetingClientResponseDTO>>>
    public Map<String, Map<String, List<GreetingClientResponseDTO>>> getGreetingsByRegionThenByType() {
        return null;
    }

    // TODO Group greetings by region, then by type within each region, then count by every first character of greeting, Map<String, Map<String, Map<Character, Integer>>>
    public Map<String, Map<String, Map<Character, Integer>>> getCountFirstCharacterByRegionThenByType() {
        return null;
    }

    // TODO Group greetings by region → type → first letter, and collect the actual greeting texts (String) per group
    // Result: Map<String, Map<String, Map<Character, List<String>>>>
    public Map<String, Map<String, Map<Character, List<String>>>> getGreetingListByRegionThenByTypeThenByFirstCharacter() {
        return null;
    }


    // TODO Refactor by using higher-order function
    private <K, V> Map<K, V> groupGreetings(
            Function<GreetingClientResponseDTO, K> classifier,
            Collector<GreetingClientResponseDTO, ?, V> collector
    ) {
        return null;
    }

}
