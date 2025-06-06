package org.accenture.day12.mapper;

import org.accenture.day12.model.Greeting;
import org.accenture.day12.model.GreetingResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GreetingMapper {
    GreetingResponseDTO toDto(Greeting greeting);

}
