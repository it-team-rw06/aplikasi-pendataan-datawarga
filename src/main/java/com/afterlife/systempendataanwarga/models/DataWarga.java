package com.afterlife.systempendataanwarga.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.afterlife.systempendataanwarga.enums.Agama;
import com.afterlife.systempendataanwarga.enums.JK;
import com.afterlife.systempendataanwarga.enums.Kecamatan;
import com.afterlife.systempendataanwarga.enums.Kelurahan;
import com.afterlife.systempendataanwarga.enums.Kewarganegaraan;
import com.afterlife.systempendataanwarga.enums.Kota;
import com.afterlife.systempendataanwarga.enums.Pekerjaan;
import com.afterlife.systempendataanwarga.enums.RT;
import com.afterlife.systempendataanwarga.enums.RW;
import com.afterlife.systempendataanwarga.enums.StatusPerkawinan;

import lombok.Data;

@Entity
@Data
public class DataWarga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, name="no_kk")
    private String noKk;
    @Column(length = 100, name="no_ktp")
    private String noKtp;
    @Column(length = 100, name="alamat")
    private String alamat;
    @Enumerated(value = EnumType.STRING)
    private RT rt;
    @Enumerated(value = EnumType.STRING)
    private RW rw;
    @Enumerated(value = EnumType.STRING)
    private Kecamatan kecamatan;
    @Enumerated(value = EnumType.STRING)
    private Kelurahan kelurahan;
    @Enumerated(value = EnumType.STRING)
    private Kota kota;
    @Enumerated(value = EnumType.STRING)
    private StatusPerkawinan statusPerkawinan;
    @Enumerated(value = EnumType.STRING)
    private Kewarganegaraan kewarganegaraan;
    @Enumerated(value = EnumType.STRING)
    private JK jk;
    @Column(length = 100, name="tanggal_lahir")
    private String tanggalLahir;
    @Enumerated(value = EnumType.STRING)
    private Agama agama;
    @Enumerated(value = EnumType.STRING)
    private Pekerjaan  pekerjaan;
    @Column(length = 100, name="tempat_tinggal_terkini")
    private String tempatTinggalTerkini;
}
