package com.afterlife.aplikasikatar.models.sektorbisnis;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tm_pengusaha")
public class TMPengusaha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
