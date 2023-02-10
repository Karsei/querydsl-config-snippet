package kr.pe.karsei.sample.querydsl.sample;

import java.util.List;

public interface SampleRepositorySupport {
    List<SampleJpaEntity> findAll();
}
