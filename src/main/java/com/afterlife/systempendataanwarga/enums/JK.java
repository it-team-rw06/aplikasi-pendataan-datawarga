package com.afterlife.systempendataanwarga.enums;

public enum JK {
    
    PRIA("Pria"),
    WANITA("Wanita");

    private String description;

    JK(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
