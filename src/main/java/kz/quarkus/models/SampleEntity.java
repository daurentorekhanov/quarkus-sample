package kz.quarkus.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.spi.Status;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class SampleEntity extends PanacheEntity {
    private String name;
    private LocalDate date;
    private Status status;

}
