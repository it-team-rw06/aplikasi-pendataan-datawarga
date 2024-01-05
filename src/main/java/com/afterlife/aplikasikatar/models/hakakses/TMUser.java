package com.afterlife.aplikasikatar.models.hakakses;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tm_user")
public class TMUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
