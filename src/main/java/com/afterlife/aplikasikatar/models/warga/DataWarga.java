package com.afterlife.aplikasikatar.models.warga;

import com.afterlife.aplikasikatar.enums.*;
import lombok.Data;

import javax.persistence.*;

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
