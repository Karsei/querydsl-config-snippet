package kr.pe.karsei.sample.querydsl.sample;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SAMPLE")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SampleJpaEntity {
    @Id
    @GeneratedValue
    @Column(name = "SEQNO")
    private Long seqNo;

    @Column(name = "NAME")
    private String name;
}
