package com.minh1952.springboot.start.strartSpringBoot;

public class User {
    // Dependency Injection là việc các Object nên phụ thuộc vào các Abstract class
    private Vehicle vehicle;

   public User(Vehicle vehicle){
       this.vehicle = vehicle; //Injection thông qua Constructor
   }


   // Show Vehicle using
   public void showVehicle(){
       this.vehicle.useVehicle();
   }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
