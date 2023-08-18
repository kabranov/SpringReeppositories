package com.example.accessingdatarest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ParkSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String parkNumber;
    private String location;
    private String price;
    public String getParkNumber() {
        return parkNumber;
    }

    // parkNumber setter
    public void setParkNumber(String parkNumber) {
        this.parkNumber = parkNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }
}
