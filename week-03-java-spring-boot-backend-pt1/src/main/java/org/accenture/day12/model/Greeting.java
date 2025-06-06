package org.accenture.day12.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;


@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {
    @Id
    @GeneratedValue
    private Integer id;

    private String greeting;

    private String language;

    private String region;

    private String type;

    private Instant createdAt;

    private Instant updatedAt;

}