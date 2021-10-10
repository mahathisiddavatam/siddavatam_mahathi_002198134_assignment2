/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Varakumar
 */
public class CarList {
    
    private ArrayList<Car> carlist;
    
    public CarList(){
        
        this.carlist = new ArrayList<Car>();
        
    }

    public ArrayList<Car> getCarlist() {
        return carlist;
    }

    public void setCarlist(ArrayList<Car> carlist) {
        this.carlist = carlist;
    }
    
    public Car addNewCar(){
        
        Car car = new Car();
        
        carlist.add(car);
        
        return car;
    }
    
}
