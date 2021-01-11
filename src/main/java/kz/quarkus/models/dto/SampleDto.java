package kz.quarkus.models.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.spi.Status;

import java.time.LocalDate;

@Getter
@Setter
public class SampleDto {
    private String name;
    private LocalDate date;
    private Status status;
}
