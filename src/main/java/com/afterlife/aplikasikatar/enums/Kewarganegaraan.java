package com.afterlife.aplikasikatar.enums;

public enum Kewarganegaraan {
    WNI("Warga Negara Indonesia"),
    WNA("Warga Negara Asing");

    private String description;

    Kewarganegaraan(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
