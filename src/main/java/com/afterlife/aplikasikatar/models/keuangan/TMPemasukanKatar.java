package com.afterlife.aplikasikatar.models.keuangan;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tm_pemasukan_katar")
public class TMPemasukanKatar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
