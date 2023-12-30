/*
 * Ifra Inam
 * ICS4UE
 * Mr. Diakoloukas
 * 2023-08-10
 * Purpose of Program: To allow users to create a floor with different shaped tiles and calculate the total area and cost   
 */
package u2a3_ifrainam;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;

// creates a "blueprint" for all the subclasses
abstract class Shape { 
    // declaration of variables 
    protected double unitPrice; 
    protected double[] dimensionsList; 
    // getter for unitPrice --> will be implemented into every subclass
    public abstract double getUnitPrice();
    // setter for unitPrice --> will be implemented into every subclass
    public abstract void setUnitPrice(double unitPrice);
    // getter for area --> will be implemented into every subclass
    public abstract double getArea();
    // getter for dimensionsList --> will be implemented into every subclass
    public abstract double[] getDimensionsList();   
    @Override
    public abstract String toString();       
}

// class for clearing the console 
class Clear {
    void keyPress(int VK_CONTROL) {
    }

    void keyRelease(int VK_CONTROL) {
    }
}

// subclass Rectangle of the superclass Shape
class Rectangle extends Shape {
    // getter for unitPrice
    @Override
    public double getUnitPrice() {
        return unitPrice;
    }
    // setter for unitPrice
    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    // getter for area
    @Override
    public double getArea() {
        double area = dimensionsList[0] * dimensionsList[1]; // area is calculated by multiplying the length and width inputted by the user stored in the dimensionsList array  
        return area; 
    } 
    // getter for dimensionsList
    @Override
    public double[] getDimensionsList() {
        return dimensionsList; 
    }
    // holds the details of the specific rectangle tile
    @Override
    public String toString() {
        return "Shape: Rectangle \nPrice per square unit: $" + getUnitPrice() + "\nLength: " + dimensionsList[0] + "\nWidth: " + dimensionsList[1] + "\nArea: " + getArea(); 
    }
}

// subclass Parallelogram of the superclass Shape
class Parallelogram extends Shape {
    // getter for unitPrice
    @Override
    public double getUnitPrice() {
       return unitPrice; 
    }
    // setter for unitPrice
    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice; 
    }
    // getter for area
    @Override
    public double getArea() {
        double area = dimensionsList[0] * dimensionsList[1]; // area is calculated by multiplying the base and height inputted by the user stored in the dimensionsList array 
        return area; 
    }
    // getter for dimensionsList
    @Override
    public double[] getDimensionsList() {
        return dimensionsList; 
    }
    // holds the details of the specific parallelogram tile
    @Override
    public String toString() {
    return "Shape: Parallelogram \nPrice per square unit: $" + getUnitPrice() + "\nBase: " + dimensionsList[0] + "\nHeight: " + dimensionsList[1] + "\nArea: " + getArea(); 
    }
}

// subclass Triangle of the superclass Shape
class Triangle extends Shape {
    // getter for unitPrice
    @Override
    public double getUnitPrice() {
        return unitPrice; 
    }
    // setter for unitPrice
    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice; 
    }
    // getter for area
    @Override
    public double getArea() {
        double area = dimensionsList[0] * dimensionsList[1] / 2; // area is calculated by multiplying the base and height inputted by the user stored in the dimensionsList array and divided by 2
        return area;
    }
    // getter for dimensionsList
    @Override
    public double[] getDimensionsList() {
        return dimensionsList;
    } 
    // holds the details of the specific triangle tile
    @Override 
    public String toString() {
    return "Shape: Triangle \nPrice per square unit: $" + getUnitPrice() + "\nBase: " + dimensionsList[0] + "\nHeight: " + dimensionsList[1] + "\nArea: " + getArea(); 
    }
}

// subclass Circle of the superclass Shape
class Circle extends Shape {
    @Override
    public double getUnitPrice() {
        return unitPrice; 
    }
    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice; 
    }
    // getter for area
    @Override
    public double getArea() {
        double area = Math.PI*(dimensionsList[0] * dimensionsList[0]); // area is caculated using the formula Pi r^2, where r is the radius entered by the user and stored in dimensionsList  
        return area;
    }
    // getter for dimensionsList
    @Override
    public double[] getDimensionsList() {
        return dimensionsList; 
    }
    // holds the details of the specific circle tile
    @Override
    public String toString() {
    return "Shape: Circle \nPrice per square unit: $" + getUnitPrice() + "\nRadius: " + dimensionsList[0] + "\nArea: " + getArea(); 
    } 
}

// subclass Donut of the superclass Shape
class Donut extends Shape {
    // getter for unitPrice
    @Override
    public double getUnitPrice() {
        return unitPrice; 
    }
    // setter for unitPrice
    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice; 
    }
    // getter for area 
    @Override
    public double getArea() {
        double area = Math.PI*((dimensionsList[0] * dimensionsList[0]) - (dimensionsList[1] * dimensionsList[1])); // area is calculated using the formula Pi(r1^2 - r2^2), where r1 and r2 are inputted by the user and stored into the dimensionsList array
        return area; 
    }
    // getter for dimensionsList
    @Override
    public double[] getDimensionsList() {
        return dimensionsList; 
    }
    // holds the details of the specific donut tile
    @Override
    public String toString() {
    return "Shape: Donut \nPrice per square unit: $" + getUnitPrice() + "\nOuter Radius: " + dimensionsList[0] + "\nInner Radius: " + dimensionsList[1] + "\nArea: " + getArea(); 
    }
}

// subclass Trapezoid of the superclass Shape
class Trapezoid extends Shape {
    // getter for unitPrice
    @Override
    public double getUnitPrice() {
        return unitPrice; 
    }
    // setter for unitPrice
    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice; 
    }
    // getter for area
    @Override
    public double getArea() {
        double area = (dimensionsList[0] + dimensionsList[1]) / 2 * dimensionsList[2]; // area is calculated using the formula ((a+b)/2)h, where a, b, and h are inputted by the user and stored into the dimensionsList array
        return area; 
    }
    // getter for dimensionsList
    @Override
    public double[] getDimensionsList() {
        return dimensionsList; 
    }
    // holds the details of the specific trapezoid tile 
    @Override
    public String toString() {
    return "Shape: Trapezoid \nPrice per square unit: $" + getUnitPrice() + "\nBase 1: " + dimensionsList[0] + "\nBase 2: " + dimensionsList[1] + "\nHeight: " + dimensionsList[2] + "\nArea: " + getArea(); 
    }
}

// subclass Hexagon of the superclass Shape
class Hexagon extends Shape {
    // getter for unitPrice
    @Override
    public double getUnitPrice() {
        return unitPrice; 
    }
    // setter for unitPrice
    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice; 
    }
    // getter for area
    @Override
    public double getArea() {
        double area = (Math.sqrt(3)*3) / 2 * (dimensionsList[0] * dimensionsList[0]); // area is calculated using the formula ((3 x square root of 3) / 2)a^2, where a is the base length entered by the user and stored in the dimensionsList array
        return area;
    }
    // getter for dimensionsList
    @Override
    public double[] getDimensionsList() {
        return dimensionsList; 
    }
    // holds the details of a specific hexagon tile 
    @Override 
    public String toString() {
        return "Shape: Hexagon \nPrice per square unit: $" + getUnitPrice() + "\nSide Length: " + dimensionsList[0] + "\nArea: " + getArea(); 
    }
}

public class TileCalculator {

    public static void main(String[] args) {
        
    ArrayList<Shape> tiles = new ArrayList<>(); // arraylist is used to store all the tiles the user creates 
        
    System.out.println("Tile Price Caculator\n"); 
        
    boolean go = true; // the variable's status determines whether the application continues or stops
    while(go) {
        Scanner object = new Scanner(System.in); // allows for user input
        // displays the menu bar and allows user to choose between seven options 
        System.out.println("Choose an option from 1 to 7 \n1. Create a shape \n2. Delete an existing shape \n3. Display the list of each shape \n4. Calculate the total cost of the floor \n5. Calculate the total area of the floor \n6. Clear the list of shapes \n7. Clear the console \n8. Exit");
        String choice = object.nextLine(); 
        switch (choice) {
            // when the user decides to create a shape, they are asked to choose a shape 
            case "1" -> {
                System.out.println("\nChoose a shape: Rectangle, Parallelogram, Triangle, Circle, Donut, Trapezoid, Hexagon");
                String shape = object.nextLine().trim();    
                // if the user wants to create a rectangle: 
                if (shape.equalsIgnoreCase("Rectangle")) {
                    System.out.print("Enter the price per square unit: "); // asks the user to enter the price for the tile
                    double unitPrice = object.nextDouble(); // gets their input 
                    Rectangle rect = new Rectangle(); // creates an instance of the Rectangle class
                    rect.setUnitPrice(unitPrice); // stores their input into setUnitPrice of the Rectangle class 
                    System.out.print("Enter the length: "); // asks the user to enter the length of the rectangle
                    double length = object.nextDouble(); // gets their input
                    System.out.print("Enter the width: "); // asks the user to enter the width of the rectangle
                    double width = object.nextDouble(); // gets their input
                    rect.dimensionsList = new double[2]; // initializes the dimensionsList array, allowing it to hold 2 values 
                    rect.dimensionsList[0] = length; // the user's length input is added to the array at the 0th index
                    rect.dimensionsList[1] = width;// the user's width input is added to the array at the 1st index
                    tiles.add(rect); // rectangle object is added to the list
                    System.out.println("\nThe shape has been created.\n"); // notifies the user that they have sucessfully created a shape
                }
                // if the user wants to create a parallelogram: 
                else if (shape.equalsIgnoreCase("Parallelogram")) {
                    System.out.print("Enter the price per square unit: "); // asks the user to enter the price for the tile
                    double unitPrice = object.nextDouble(); // gets their input 
                    Parallelogram parallel = new Parallelogram(); // creates an instance of the Parallelogram class
                    parallel.setUnitPrice(unitPrice); // stores their input into setUnitPrice of the Parallelogram class 
                    System.out.print("Enter the base: "); // asks the user to enter the base of the parallelogram
                    double base = object.nextDouble(); // gets their input
                    System.out.print("Enter the height: "); // asks the user to enter the height of the parallelogram
                    double height = object.nextDouble(); // get their input
                    parallel.dimensionsList = new double[2]; // initializes the dimensionsList array, allowing it to hold 2 values 
                    parallel.dimensionsList[0] = base; // the user's basse input is added to the array at the 0th index
                    parallel.dimensionsList[1] = height; // the user's height input is added to the array at the 1st index
                    tiles.add(parallel); // parallelogram object is added to the list
                    System.out.println("\nThe shape has been created.\n"); // notifies the user that they have sucessfully created a shape
                }
                // if the user wants to create a triangle: 
                else if (shape.equalsIgnoreCase("Triangle")) {
                    System.out.print("Enter the price per square unit: "); // asks the user to enter the price for the tile
                    double unitPrice = object.nextDouble(); // gets user input
                    Triangle tri = new Triangle(); // creates an instance of the Triangle class
                    tri.setUnitPrice(unitPrice); // stores their input into setUnitPrice of the Triangle class 
                    System.out.print("Enter the base: "); // asks the user to enter the base of the triangle
                    double base = object.nextDouble(); // gets their input 
                    System.out.print("Enter the height: "); // asks the user to enter the height of the triangle
                    double height = object.nextDouble(); // gets user input 
                    tri.dimensionsList = new double[2]; // initializes the dimensionsList array, allowing it to hold 2 values
                    tri.dimensionsList[0] = base; // the user's basse input is added to the array at the 0th index
                    tri.dimensionsList[1] = height; // the user's height input is added to the array at the 1st index
                    tiles.add(tri); // triangle object is added to the list 
                    System.out.println("\nThe shape has been created.\n"); // notifies the user that they have sucessfully created a shape
                }
                // if the user wants to create a circle:
                else if (shape.equalsIgnoreCase("Circle")) {
                    System.out.print("Enter the price per square unit: "); // asks the user to enter the price for the tile
                    double unitPrice = object.nextDouble(); // gets user input
                    Circle cir = new Circle(); // creates an intance of the Circle class
                    cir.setUnitPrice(unitPrice); // stores their input into setUnitPrice of the Circle class 
                    System.out.print("Enter the radius: "); // asks the user to enter the radius of the circle
                    double radius = object.nextDouble(); // gets their input
                    cir.dimensionsList = new double[1]; // initializes the dimensionsList array, allowing it to hold 1 value
                    cir.dimensionsList[0] = radius; // the user's radius input is added to the array at the 0th index
                    tiles.add(cir); // circle object is added to the list
                    System.out.println("\nThe shape has been created.\n"); // notifies the user that they have sucessfully created a shape
                }
                // if the user wants to create a donut:
                else if (shape.equalsIgnoreCase("Donut")) { 
                    System.out.print("Enter the price per square unit: "); // asks the user to enter the price for the tile
                    double unitPrice = object.nextDouble(); // gets user input
                    Donut don = new Donut(); // creates an instance of the Donut class
                    don.setUnitPrice(unitPrice); // stores their input into setUnitPrice of the Donut class 
                    System.out.print("Enter the radius of the outer circle: "); // asks the user to enter the outer radius of the donut
                    double radius1 = object.nextDouble(); // gets user input
                    System.out.print("Enter the radius of the inner circle: "); // asks the user to enter the inner radius of the donut
                    double radius2 = object.nextDouble(); // gets user input
                    don.dimensionsList = new double[2]; // initializes the dimensionsList array, allowing it to hold 2 values
                    don.dimensionsList[0] = radius1; // the user's outer radius input is added to the array at the 0th index
                    don.dimensionsList[1] = radius2; // the user's inner radius input is added to the array at the 1st index
                    tiles.add(don); // donut object is added to the list
                    System.out.println("\nThe shape has been created.\n"); // notifies the user that they have sucessfully created a shape
                }
                // if the user wants to create a trapezoid:
                else if (shape.equalsIgnoreCase("Trapezoid")) {
                    System.out.print("Enter the price per square unit: "); // asks the user to enter the price for the tile
                    double unitPrice = object.nextDouble(); // gets user input
                    Trapezoid trap = new Trapezoid(); // creates an instance of the Trapezoid class
                    trap.setUnitPrice(unitPrice); // stores their input into setUnitPrice of the Trapezoid class 
                    System.out.print("Enter the base 1: "); // asks the user to enter the first base of the trapezoid
                    double base1 = object.nextDouble(); // gets user input
                    System.out.print("Enter the base 2: "); // asks the user to enter the second base of the trapezoid
                    double base2 = object.nextDouble(); // gets user input
                    System.out.print("Enter the height: "); // asks the user to enter the height of the trapezoid
                    double height = object.nextDouble(); // gets user input
                    trap.dimensionsList = new double[3]; // initializes the dimensionsList array, allowing it to hold 3 values
                    trap.dimensionsList[0] = base1; // the user's base 1 input is added to the array at the 0th index
                    trap.dimensionsList[1] = base2; // the user's base 2 input is added to the array at the 1st index
                    trap.dimensionsList[2] = height; // the user's height input is added to the array at the 2nd index
                    tiles.add(trap); // trapezoid object is added to the list
                    System.out.println("\nThe shape has been created.\n"); // notifies the user that they have sucessfully created a shape
                }
                // if the user wants to create a hexagon: 
                else if (shape.equalsIgnoreCase("Hexagon")) {
                    System.out.print("Enter the price per square unit: "); // asks the user to enter the price for the tile
                    double unitPrice = object.nextDouble(); // gets user input
                    Hexagon hex = new Hexagon(); // creates an instance of the Hexagon class
                    hex.setUnitPrice(unitPrice); // stores their input into setUnitPrice of the Hexagon class 
                    System.out.print("Enter the side length: "); // asks the user to enter the side length of the hexagon
                    double side = object.nextDouble(); // gets user input
                    hex.dimensionsList = new double[1]; // initializes the dimensionsList array, allowing it to hold 1 value
                    hex.dimensionsList[0] = side; // the user's side length input is added to the array at the 0th index
                    tiles.add(hex); // hexagon object is added to the list
                    System.out.println("\nThe shape has been created.\n"); // notifies the user that they have sucessfully created a shape
                }
            }
            // when the user wants to delete a shape:
            case "2" -> {
                // checks if the tiles arraylist is empty
                if (tiles.isEmpty()) { 
                    System.out.println("\nThe list is empty. There is nothing to delete.\n"); // if the user wants to remove a shape when the list is empty, a message is outputted to notify them 
                }
                // outputs the current list and asks them to enter the index where the shape they want to remove is in 
                else { System.out.println("\nThis is the current List. Enter the index of the shape you would like to delete.\n");
                    for (int i = 0; i < tiles.size(); i++) {
                        System.out.println(i+". \n"+tiles.get(i) + "\n"); // prints the index to make it easier for users to know which index a shape is in without needing to count
                    }
                    int index = object.nextInt();
                    if (index < tiles.size()) { // if their input is a valid index, the tile is removed from the list
                        tiles.remove(index);
                        System.out.println("\nThe shape has been deleted.\n"); // notifies them that they have successfully deleted a shape
                    }
                    else {
                        System.out.println("\nInvalid index.\n"); // if their input is out of bounds and is not a valid index, a message is outputted to notify them
                    }
                } 
            }
            // when the user wants to see the list of the all the exisiting shapes and their details: 
            case "3" -> {
                System.out.println("\nCurrent List: \n");
                if (tiles.isEmpty()) { // if the list is empty, it tells them that
                    System.out.println("The list is empty.\n");
                }
                else { // if not, the list is displayed 
                    for (int i = 0; i < tiles.size(); i++) {
                        System.out.println(i+". \n"+tiles.get(i) + "\n");
                    }
                }
            }
            // when the user wants to calculate the total price of the floor: 
            case "4" -> {
                double cost = 0; // a cost value is initially set to 0 
                for (int i = 0; i < tiles.size(); i++) { // a for loop is used to get the prices of each tile in the list
                    cost += tiles.get(i).getUnitPrice() * tiles.get(i).getArea(); // all the prices are added to the cost variable (producing a total cost)
                }      
                System.out.println("\nTotal Cost: $" + cost + "\n"); // displays the total cost 
            }
            // when the user wants to calculate the total area of the floor:
            case "5" -> {
                double totalArea = 0; // a totalArea value is initially set to 0
                for (int i = 0; i < tiles.size(); i++) { // a for loop is used to get the areas of each tile in the list
                    totalArea += tiles.get(i).getArea(); // all the areas are added to the totalArea variable (producing a total area)
                }       
                System.out.println("\nTotal Area: " + totalArea + "\n"); // displays the total area 
            }
            // when the user wants to clear the list:
            case "6" -> {
                tiles.clear(); // clear() method is used to clear the list
                // displays the empty list
                System.out.println("\nList has been cleared: ");
                System.out.println(tiles + "\n");
            }
            // when the user wants to clear the console
            case "7" -> {
                System.out.println("\nPress control-L to clear the console.\n"); // tells the user what to do in order to clear the console
                consoleClear(); // calls the consoleClear method to clear the console 
                return; // stops the loop 
            }
            // when the user wants to exit: 
            case "8" -> {
                go = false; // the status of go changes to false and the while loop stops
            }
            default -> {
            }
        }    
    }
    
    } 
    
    // method used to clear the console
    public static void consoleClear() {
           //try catch any error
        try {
            //create object of Clear class
            Clear clear = new Clear();
            //control-L to clear the screen
            //press the keys
            clear.keyPress(KeyEvent.VK_CONTROL);
            clear.keyPress(KeyEvent.VK_L);
            //release the key
            clear.keyRelease(KeyEvent.VK_CONTROL);
            clear.keyRelease(KeyEvent.VK_L);
        }
        catch (Exception e) {
        }
    }
    
}
