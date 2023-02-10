package kr.pe.karsei.sample.querydsl.sample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleJpaEntity, Long>, SampleRepositorySupport {
}