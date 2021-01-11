package kz.quarkus.service;

import kz.quarkus.models.SampleEntity;
import kz.quarkus.repository.SampleRepository;
import org.hibernate.engine.spi.Status;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.time.LocalDate;

@ApplicationScoped
public class SampleService {

    @Inject
    SampleRepository repository;

    @Transactional
    public SampleEntity createSample (String name) {

        SampleEntity entity = new SampleEntity();
        entity.setDate(LocalDate.now());
        entity.setStatus(Status.SAVING);
        entity.setName(name);

        repository.persist(entity);

        return entity;

    }
}
