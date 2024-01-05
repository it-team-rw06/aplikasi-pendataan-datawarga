package com.afterlife.aplikasikatar.models.informasi;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tm_struktur_katar")
public class TMStrukturKatar {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
