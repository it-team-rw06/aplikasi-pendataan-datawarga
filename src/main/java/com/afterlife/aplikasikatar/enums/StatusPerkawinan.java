package com.afterlife.aplikasikatar.enums;

public enum StatusPerkawinan {
    
    BELUM_KAWIN("Belum Kawin"),
    KAWIN("Kawin"),
    CERAI_HIDUP("Cerai Hidup"),
    CERAI_MATI("Cerai Mati"),
    JANDA("Janda"),
    DUDA("Duda");

    private String description;

    StatusPerkawinan(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
