package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

            CellPhone phoneUser = new CellPhone();

            Scanner sc = new Scanner(System.in);

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


        System.out.println("=====[Cell Phone Information]=====");
        System.out.println("Serial Number: " + phoneUser.getSerialNumber());
        System.out.println("Model: " + phoneUser.getModel());
        System.out.println("Carrier: " + phoneUser.getCarrier());
        System.out.println("Phone Number: " + phoneUser.getPhoneNumber());
        System.out.println("Owner: " + phoneUser.getPhoneOwner());
        System.out.println("==================================");

    }
}
