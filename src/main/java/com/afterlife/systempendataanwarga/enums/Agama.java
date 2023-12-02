package com.afterlife.systempendataanwarga.enums;

public enum Agama {

    ISLAM("Islam"),
    KRISTEN_PROTESTAN("Kristen Protestan"),
    KRISTEN_KATOLIK("Kristen Katolik"),
    HINDU("Hindu"),
    BUDHA("Budha"),
    KONGHUCU("Konghucu"),
    LAINNYA("Lainnya");

    private String description;

    Agama(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
