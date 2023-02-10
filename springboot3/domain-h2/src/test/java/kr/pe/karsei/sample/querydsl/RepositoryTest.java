package kr.pe.karsei.sample.querydsl;

import kr.pe.karsei.sample.querydsl.configuration.QuerydslConfiguration;
import kr.pe.karsei.sample.querydsl.sample.SampleJpaEntity;
import kr.pe.karsei.sample.querydsl.sample.SampleRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import(QuerydslConfiguration.class)
public class RepositoryTest {
    @Autowired
    private SampleRepository repository;

    @BeforeEach
    void setUp() {
        repository.save(new SampleJpaEntity(null, "홍길동"));
    }

    @Test
    void testIfDataCanBeRetrieved() {
        // given

        // when
        List<SampleJpaEntity> list = repository.findAll();

        // then
        assertThat(list).isNotNull();
        assertThat(list).isNotEmpty();
        assertThat(list.size()).isEqualTo(1);
        assertThat(list.get(0).getSeqNo()).isPositive();
        assertThat(list.get(0).getName()).isEqualTo("홍길동");
    }
}