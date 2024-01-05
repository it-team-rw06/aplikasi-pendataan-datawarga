package com.afterlife.aplikasikatar.models.informasi;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tm_perencanaan_katar")
public class TMPerencanaanKatar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
