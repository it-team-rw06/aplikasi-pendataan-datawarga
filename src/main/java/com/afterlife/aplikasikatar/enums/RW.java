package com.afterlife.aplikasikatar.enums;

public enum RW {
    
    RW_01("01"),
    RW_02("02"),
    RW_03("03"),
    RW_04("04"),
    RW_05("05"),
    RW_06("06"),
    RW_07("07"),
    RW_08("08");

    private  String labelRw;
    
    private RW(String labelRw) {
        this.labelRw = labelRw;
    }
    
    public String getDisplayLabelRw() {
        return labelRw;
    }
}
