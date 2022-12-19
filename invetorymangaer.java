package com.ims.actor;

public class Admin {
    int id;
    String Name;
    String BuildingNumber;
    String StreetName;
    String City;
    int Pincode;

    void checkProfileDashboard(){
        System.out.println("Please Select an Option.");
        System.out.println("Press 1 for viewing Profile details..");
    }

    String getName(){
        return this.Name;
    }


}
