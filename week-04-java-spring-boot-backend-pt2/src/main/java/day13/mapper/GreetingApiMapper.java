package day13.mapper;

import day13.model.GreetingClientResponseDTO;
import day13.model.GreetingServerResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GreetingApiMapper {

    @Mapping(source = "greeting", target = "greeting")
    @Mapping(source = "language", target = "language")
    @Mapping(source = "region", target = "region")
    @Mapping(source = "type", target = "type")
    GreetingClientResponseDTO apiResponseToClientResponse(GreetingServerResponseDTO greetingApiResponseDTO);

}
