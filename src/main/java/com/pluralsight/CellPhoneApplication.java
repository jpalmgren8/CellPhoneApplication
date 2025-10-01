package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CellPhone phoneUser = new CellPhone();

        CellPhone phoneUserTwo = new CellPhone();

        CellPhone phoneUserThree = new CellPhone(8901201, "Android", "Johnny Frowns");

        phoneUserTwo.setSerialNumber(12384211);
        phoneUserTwo.setModel("Iphone");
        phoneUserTwo.setCarrier("Verizon");
        phoneUserTwo.setPhoneNumber("4126559191");
        phoneUserTwo.setPhoneOwner("Billy Smiles");

        System.out.println("What is the serial number?: ");
        int serialNumber = sc.nextInt();
        phoneUser.setSerialNumber(serialNumber);
        sc.nextLine();


        System.out.println("What model is the phone?: ");
        String model = sc.nextLine();
        phoneUser.setModel(model);


        System.out.println("Who is the carrier?: ");
        String carrier = sc.nextLine();
        phoneUser.setCarrier(carrier);


        System.out.println("What is the phone number?: ");
        String phoneNumber = sc.nextLine();
        phoneUser.setPhoneNumber(phoneNumber);


        System.out.println("Who is the owner of the phone?: ");
        String phoneOwner = sc.nextLine();
        phoneUser.setPhoneOwner(phoneOwner);

        display(phoneUser);
        display(phoneUserTwo);
        display(phoneUserThree);

        phoneUser.dial("4125771122");
    }

    public static  void display(CellPhone phone) {
        System.out.println("=====[Cell Phone Information]=====");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getPhoneOwner());
        System.out.println("===================================");
    }

}
