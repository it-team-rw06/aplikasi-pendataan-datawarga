package com.afterlife.aplikasikatar.models.keuangan;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tm_pengeluaran_katar")
public class TMPengeluaranKatar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
