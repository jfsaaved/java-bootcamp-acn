package day14.service;

import day13.configuration.ApiProperties;
import day13.mapper.GreetingApiMapper;
import day13.model.GreetingClientResponseDTO;
import day13.model.GreetingServerResponseDTO;
import day13.service.GreetingAggregatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GreetingAggregatorServiceTest {
    @Mock
    private RestTemplate restTemplate;
    @Mock
    private ApiProperties apiProperties;
    @Mock
    private GreetingApiMapper greetingApiMapper;
    @InjectMocks
    private GreetingAggregatorService greetingAggregatorService;
    private GreetingServerResponseDTO[] mockServerData;
    private GreetingClientResponseDTO mockClientDTO;

    @BeforeEach
    void setUp() {
        GreetingServerResponseDTO serverDTO = new GreetingServerResponseDTO();
        serverDTO.setGreeting("Hello");
        serverDTO.setRegion("AU");
        serverDTO.setType("Casual");
        serverDTO.setLanguage("en");

        mockClientDTO = new GreetingClientResponseDTO();
        mockClientDTO.setGreeting("Hello");
        mockClientDTO.setRegion("AU");
        mockClientDTO.setType("Casual");
        mockClientDTO.setLanguage("en");

        mockServerData = new GreetingServerResponseDTO[]{serverDTO};

        when(apiProperties.getGreetingsApiUrl()).thenReturn("http://fake-api/greetings");
        when(restTemplate.getForEntity(anyString(), eq(GreetingServerResponseDTO[].class)))
                .thenReturn(new ResponseEntity<>(mockServerData, HttpStatus.OK));
        when(greetingApiMapper.apiResponseToClientResponse(serverDTO)).thenReturn(mockClientDTO);
    }

    // TODO Complete Unit Tests for all methods in day13 - GreetingAggregatorService class
}
