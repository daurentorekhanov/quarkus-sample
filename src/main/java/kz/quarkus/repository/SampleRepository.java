package kz.quarkus.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import kz.quarkus.models.SampleEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SampleRepository implements PanacheRepository<SampleEntity> {
}
