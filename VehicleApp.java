/*
* Ifra Inam
 * ICS4UE
 * Mr. Diakoloukas
 * 2023-08-08
 * Purpose of Program: To allow users to input specific data about 3 different vehicles as well as general data about all 3 vehicles, and output data related to it 
 */
package vehicleapp;

import java.util.Scanner; // allows for user input 

// class that contains all required variables/fields and methods
final class Vehicle {
    
    // declaration of all variables 
    private int passengerNum, passengerFare, fuelEfficiency;  
    private static int gasPrice, distance; 
    private static final int PROFIT = 400; 
    
    // constructor that creates instances of the Vehicle class
    Vehicle(int passengerNum, int passengerFare, int fuelEfficiency) {    
        this.setPassengerNum(passengerNum);
        this.setPassengerFare(passengerFare); 
        this.setFuelEfficiency(fuelEfficiency);  
    }
    
    // getter for passengerNum
    public int getPassengerNum() {
        return passengerNum; 
    }
    
    // setter for passengerNum
    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;  
    }
    
    // getter for passengerFare
     public int getPassengerFare() {
        return passengerFare; 
    }
    
    // setter for passengerFare
    public void setPassengerFare(int passengerFare) {
        this.passengerFare = passengerFare;  
    }
    
    // getter for fuelEfficiency
     public int getFuelEfficiency() {
        return fuelEfficiency; 
    }
    
    // setter for fuelEfficiency
    public void setFuelEfficiency(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;  
    }
    
    // getter for PROFIT
    public int getPROFIT() {
        return PROFIT; 
    }
    
    // getter for gasPrice
    public int getGasPrice() {
        return gasPrice; 
    }
    
    // setter for gasPrice
    public static void setGasPrice(int gasPrice) {
        Vehicle.gasPrice = gasPrice; 
    }
    
    // getter for distance
    public int getDistance() {
        return distance; 
    }
    
    // setter for distance
    public static void setDistance(int distance) {
        Vehicle.distance = distance; 
    }
    
    // method that calculates the revenue of a vehicle by multiplying the number of passengers by the fare of each passenger
    public int revenue() {
        int revenue = passengerNum * passengerFare; 
        return revenue; 
    }
    
    // method that calculates the total cost of gas by dividing the amount of km per litre of gas from the distance travelled and multiplying it by the price of gas per litre  
    public int totalCost(int distance) {
        int totalCost = distance / fuelEfficiency * gasPrice; 
        return totalCost; 
    }
    
    // method that calculates profit by subtracting the total cost of gas from the revenue 
    public int calculateProfit() {
        int calculateProfit = revenue() - totalCost(getDistance()); 
        return calculateProfit;
    }
   
    // method that returns true or false depending on if the trip was profitable or not by checking if the profit of a vehicle is higher than the static constant PROFIT of 400
    public boolean isProfitable() {
            return calculateProfit() > PROFIT;
    }
    
    // method that determines which vehicle has the highest profit 
    public static String compareTo(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3) { 
        // finds the higher profit between vehicle 1 and 2 by using the max method from the math class 
        int compare1and2 = Math.max(vehicle1.calculateProfit(), vehicle2.calculateProfit());
        // finds the higher profit between vehicle 3 and the vehicle that had the higher profit from compare1and2
        int compareAll = Math.max(vehicle3.calculateProfit(), compare1and2);
        // finds which profit the variable compareAll stores 
        if(compareAll == vehicle1.calculateProfit()) {
            return "Vehicle 1 is more profitable than vehicle 2 and vehicle 3.";
        }
        else if(compareAll == vehicle2.calculateProfit()) {
            return "Vehicle 2 is more profitable than vehicle 1 and vehicle 3.";
        } 
        else {
        return "Vehicle 3 is more profitable than vehicle 1 and vehicle 2.";
        }    
    }
    
    // method that is used to display the total revenue, total cost of gas, total profit, and whether the trip was profitable 
    @Override
    public String toString() {
        return "Total Revenue: " + revenue() + "\nTotal Cost: " + totalCost(getDistance()) + "\nTotal Profit: " + calculateProfit() + "\nIs the trip profitable: " + isProfitable();
    }
    
}

// class that prompts the user for the static fields and instance variables 
public class VehicleApp {
    
    public static void main(String[] args) {
        
        Scanner object = new Scanner(System.in);
        
        // asks user for input for the static field gasPrice
        System.out.print("Enter the gas price: ");
        int gasPrice = object.nextInt(); 
        Vehicle.setGasPrice(gasPrice);
        
        // asks user for input for the static field distance 
        System.out.print("Enter the distance travelled: "); 
        int distance = object.nextInt(); 
        Vehicle.setDistance(distance); 
        
        // asks the user for the data for vehicle 1 
        System.out.print("\nVehicle 1: ");
        System.out.print("\nEnter the number of passengers: ");
        int passengerNum = object.nextInt(); 
        System.out.print("Enter the fare of each passenger: ");
        int passengerFare = object.nextInt();
        System.out.print("Enter the amount of km per litre of gas: ");         
        int fuelEfficiency = object.nextInt(); 
        // initializes instance variables for vehicle 1
        Vehicle vehicle1 = new Vehicle(passengerNum, passengerFare, fuelEfficiency);
        
        // asks the user for the data for vehicle 2 
        System.out.print("\nVehicle 2: ");
        System.out.print("\nEnter the number of passengers: ");
        passengerNum = object.nextInt(); 
        System.out.print("Enter the fare of each passenger: ");
        passengerFare = object.nextInt();
        System.out.print("Enter the amount of km per litre of gas: ");         
        fuelEfficiency = object.nextInt(); 
        // initializes instance variables for vehicle 2
        Vehicle vehicle2 = new Vehicle(passengerNum, passengerFare, fuelEfficiency); 
        
        // asks the user for the data for vehicle 3
        System.out.print("\nVehicle 3: ");
        System.out.print("\nEnter the number of passengers: ");
        passengerNum = object.nextInt(); 
        System.out.print("Enter the fare of each passenger: ");
        passengerFare = object.nextInt();
        System.out.print("Enter the amount of km per litre of gas: ");         
        fuelEfficiency = object.nextInt();
        // initializes instance variables for vehicle 3
        Vehicle vehicle3 = new Vehicle(passengerNum, passengerFare, fuelEfficiency);
        
        // outputs the toString method for each vehicle 
        System.out.println("\nVehicle 1: \n" + vehicle1.toString());
        System.out.println("\nVehicle 2: \n" + vehicle2.toString());
        System.out.println("\nVehicle 3: \n" + vehicle3.toString());
        // outputs which vehcile is the most profitable using the compareTo method 
        System.out.println("\nWho is the most profitable?\n" + Vehicle.compareTo(vehicle1, vehicle2, vehicle3));
    }
    
}
