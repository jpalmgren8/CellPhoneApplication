package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

        System.out.println("What is the serial number?: ");
        int serialNumber = sc.nextInt();
        sc.nextLine();


        System.out.println("What model is the phone?: ");
        String model = sc.nextLine();


        System.out.println("Who is the carrier?: ");
        String carrier = sc.nextLine();


        System.out.println("What is the phone number?: ");
        String phoneNumber = sc.nextLine();


        System.out.println("Who is the owner of the phone?: ");
        String phoneOwner = sc.nextLine();

        CellPhone phoneUser = new CellPhone(serialNumber, model, carrier, phoneNumber, phoneOwner);

        phoneUser.setSerialNumber();
        phoneUser.setModel();
        phoneUser.setCarrier();
        phoneUser.setPhoneNumber();
        phoneUser.setPhoneOwner();

        System.out.println("=====[Cell Phone Information]=====");
        System.out.println("Serial Number: " + phoneUser.getSerialNumber());
        System.out.println("Model: " + phoneUser.getModel());
        System.out.println("Carrier: " + phoneUser.getCarrier());
        System.out.println("Phone Number: " + phoneUser.getPhoneNumber());
        System.out.println("Owner: " + phoneUser.getPhoneOwner());
        System.out.println("==================================");

    }
}
