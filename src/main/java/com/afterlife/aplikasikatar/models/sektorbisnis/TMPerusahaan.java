package com.afterlife.aplikasikatar.models.sektorbisnis;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tm_perusahaan")
public class TMPerusahaan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
