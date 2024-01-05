package com.afterlife.aplikasikatar.enums;

public enum RT {

    RT_01("01"),
    RT_02("02"),
    RT_03("03"),
    RT_04("04"),
    RT_05("05"),
    RT_06("06"),
    RT_07("07"),
    RT_08("08");

    private  String labelRt;
    
    private RT(String labelRt) {
        this.labelRt = labelRt;
    }
    
    public String getDisplayLabelRt() {
        return labelRt;
    }
}
