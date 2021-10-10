/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Varakumar
 */
public class Car {
    
    boolean availability;
    String manufacturer;
    int year;
    int min_seats;
    int max_seats;
    String serial_no;
    String model_no;
    String city;
    boolean maintain_expiry;
    Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMin_seats() {
        return min_seats;
    }

    public void setMin_seats(int min_seats) {
        this.min_seats = min_seats;
    }

    public int getMax_seats() {
        return max_seats;
    }

    public void setMax_seats(int max_seats) {
        this.max_seats = max_seats;
    }

    public String getSerial_no() {
        return serial_no;
    }

    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    public String getModel_no() {
        return model_no;
    }

    public void setModel_no(String model_no) {
        this.model_no = model_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMaintain_expiry() {
        return maintain_expiry;
    }

    public void setMaintain_expiry(boolean maintain_expiry) {
        this.maintain_expiry = maintain_expiry;
    }

    
    
    
       
    
            
    
    
}
