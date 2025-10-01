package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String phoneOwner;

public CellPhone () {
    this.serialNumber = 0;
    this.model = "";
    this.carrier = "";
    this.phoneNumber = "";
    this.phoneOwner = "";
}
public Integer getSerialNumber() {
    return this.serialNumber;
}
public String getModel() {
    return this.model;
}
public String getCarrier() {
    return this.carrier;
}
public String getPhoneNumber() {
    return this.phoneNumber;
}
public String getPhoneOwner() {
    return this.phoneOwner;
}

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneOwner(String phoneOwner) {
        this.phoneOwner = phoneOwner;
    }
}


