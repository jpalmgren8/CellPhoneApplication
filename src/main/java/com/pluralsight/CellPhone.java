package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String phoneOwner;

public CellPhone (Integer serialNumber, String model, String carrier, String phoneNumber, String phoneOwner) {
    this.serialNumber = serialNumber;
    this.model = model;
    this.carrier = carrier;
    this.phoneNumber = phoneNumber;
    this.phoneOwner = phoneOwner;
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

public void setSerialNumber() {
    this.serialNumber = serialNumber;
}
public void setModel() {
    this.model = model;
}
public void setCarrier() {
    this.carrier = carrier;
}
public void setPhoneNumber() {
    this.phoneNumber = phoneNumber;
}
public void setPhoneOwner() {
    this.phoneOwner = phoneOwner;
}

}


