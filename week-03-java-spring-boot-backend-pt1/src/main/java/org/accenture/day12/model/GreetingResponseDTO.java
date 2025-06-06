package org.accenture.day12.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GreetingResponseDTO {
    private String greeting;

    private String language;

    private String region;

    private String type;
}