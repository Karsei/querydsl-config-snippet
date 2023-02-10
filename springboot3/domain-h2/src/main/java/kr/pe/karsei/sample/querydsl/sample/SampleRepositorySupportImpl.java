package kr.pe.karsei.sample.querydsl.sample;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static kr.pe.karsei.sample.querydsl.sample.QSampleJpaEntity.sampleJpaEntity;

@RequiredArgsConstructor
public class SampleRepositorySupportImpl implements SampleRepositorySupport {
    private final JPAQueryFactory queryFactory;

    public List<SampleJpaEntity> findAll() {
        return queryFactory
                .selectFrom(sampleJpaEntity)
                .fetch();
    }
}
