package com.pluralsight;



// CellPhone class with private 5 private variables
public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String phoneOwner;

// First constructor for the class. All default values for the user to input in main
public CellPhone () {
    this.serialNumber = 0;
    this.model = "";
    this.carrier = "";
    this.phoneNumber = "";
    this.phoneOwner = "";
}

// Overloaded constructor for making objects involving phones that are not
// activated yet. Carrier and number are not assigned to the phone

public CellPhone (Integer serialNumber, String model, String phoneOwner) {
    this.serialNumber = serialNumber;
    this.model = model;
    this.carrier = "Cell phone not activated with carrier";
    this.phoneNumber = "Number not assigned to carrier yet";
    this.phoneOwner = phoneOwner;
}

// Dial method, prints out who is calling the inputted number
public void dial(String phoneNumber) {
    System.out.println(getPhoneOwner() + "'s phone is calling " + phoneNumber);
}

// Gets for the cell phone class
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

// Sets for the cell phone class
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


