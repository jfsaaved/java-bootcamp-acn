package day13.controller;

import day13.model.GreetingClientResponseDTO;
import day13.service.GreetingAggregatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/aggregator")
public class GreetingAggregatorController {
    private final GreetingAggregatorService greetingAggregatorService;

    public GreetingAggregatorController(GreetingAggregatorService greetingAggregatorService) {
        this.greetingAggregatorService = greetingAggregatorService;
    }

    @RequestMapping(value = "/groupbyregion", method = RequestMethod.GET)
    public Map<String, List<GreetingClientResponseDTO>> groupByRegion() {
        return greetingAggregatorService.getGroupByRegion();
    }

    @RequestMapping(value = "/groupbytype", method = RequestMethod.GET)
    public Map<String, List<GreetingClientResponseDTO>> groupByType() {
        return greetingAggregatorService.getGroupByType();
    }

    @RequestMapping(value = "/groupbytype/count", method = RequestMethod.GET)
    public Map<String, Long> countGroupByType() {
        return greetingAggregatorService.getCountGroupByType();
    }

    @RequestMapping(value = "/groupbyregion/count", method = RequestMethod.GET)
    public Map<String, Integer> countGroupByRegion() {
        return greetingAggregatorService.getCountGroupByRegion();
    }

    @RequestMapping(value = "/greetingspercharacter", method = RequestMethod.GET)
    public Map<Character, List<String>> greetingsPerCharacter() {
        return greetingAggregatorService.getGreetingsPerCharacter();
    }

    @RequestMapping(value = "/regionsperlanguage", method = RequestMethod.GET)
    public Map<String, Set<String>> languagesPerRegion() {
        return greetingAggregatorService.getRegionsPerLanguage();
    }

    @RequestMapping(value = "/groupbyregionthentype", method = RequestMethod.GET)
    public Map<String, Map<String, List<GreetingClientResponseDTO>>> getGroupByRegionThenType() {
        return greetingAggregatorService.getGreetingsByRegionThenByType();
    }

    @RequestMapping(value = "/countcharacterbyregionthentype", method = RequestMethod.GET)
    public Map<String, Map<String, Map<Character, Integer>>> countFirstCharacterByRegionThenByType() {
        return greetingAggregatorService.getCountFirstCharacterByRegionThenByType();
    }

    @RequestMapping(value = "/lastendpoint", method = RequestMethod.GET)
    public Map<String, Map<String, Map<Character, List<String>>>> greetingListByRegionThenByTypeThenByFirstCharacter() {
        return greetingAggregatorService.getGreetingListByRegionThenByTypeThenByFirstCharacter();
    }
}
