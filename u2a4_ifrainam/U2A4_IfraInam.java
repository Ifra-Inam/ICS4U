/*
 * Ifra Inam
 * ICS4UE
 * Mr. Diakoloukas
 * 2023-08-13
 * Purpose of Program: To allow users to search for an item in the inventory, add items into the inventory, and save items to the inventory 
 */
package u2a4_ifrainam;

// necessary imports
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// class that contains the all the required variables and methods
class Item {
    
    String sku, name, category; 
    int quantity, minimumQuantity; 
    double vendorPrice, markupPercentage, regularPrice, currentDiscount, currentPrice; 
    
    // constructor that creates instances of the Item class 
    Item(String sku, String name, String category, int quantity, int minimumQuantity, double vendorPrice, double markupPercentage, double regularPrice, double currentDiscount, double currentPrice) {
        this.sku = sku; 
        this.name = name; 
        this.category = category; 
        this.quantity = quantity; 
        this.minimumQuantity = minimumQuantity; 
        this.vendorPrice = vendorPrice; 
        this.markupPercentage = markupPercentage; 
        this.regularPrice = regularPrice; 
        this.currentDiscount = currentDiscount;
        this.currentPrice = currentPrice; 
    }
    
    // getter for sku
    public String getSKU() {
        return sku; 
    }
    // setter for sku
    public void setSKU(String sku) {
        this.sku = sku; 
    } 
    // getter for name
    public String getName() {
        return name; 
    }
    // setter for name
    public void setName(String name) {
        this.name = name; 
    }
    // getter for category    
    public String getCategory() {
        return category; 
    }
    // setter for category 
    public void setCategory(String category) {
        this.category = category; 
    }
    // getter for quantity 
    public int getQuantity() {
        return quantity; 
    }
    // setter for quantity 
    public void setQuantity(int quantity) {
        this.quantity = quantity; 
    }
    // getter for minimumQuantity
    public int getMinimumQuantity() {
        return minimumQuantity; 
    }
    // setter for minimumQuantity
    public void setMinimumQuantity(int minimumQuantity) {
       this.minimumQuantity = minimumQuantity;     
    }
    // getter for vendorPrice
    public double getVendorPrice() {
        return vendorPrice; 
    }
    // setter for vendorPrice
    public void setVendorPrice(double vendorPrice) {
        this.vendorPrice = vendorPrice; 
    }
    // getter for markupPercentage
    public double getMarkupPercentage() {
        return markupPercentage; 
    }
    // setter for markupPercentage
    public void setMarkupPercentage(double markupPercetange) {
        this.markupPercentage = markupPercetange; 
    }
    // getter for regularPrice
    public double getRegularPrice() {
        return regularPrice; 
    }
    // setter for regularPrice
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice; 
    }
    // getter for currentDiscount
    public double getCurrentDiscount() {
        return currentDiscount; 
    }
    // setter for currentDiscount
    public void setCurrentDiscount(double currentDiscount) {
        this.currentDiscount = currentDiscount; 
    }
    // getter for currentPrice
    public double getCurrentPrice() {
        return currentPrice; 
    }
    // setter for currentPrice
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice; 
    }
    
    // toString() method that returns a string formatted the exact same way as a line from the inventory file
    @Override
    public String toString() {
        return getSKU() + "," + getName() + "," + getCategory() + "," + getQuantity() + "," + getMinimumQuantity() + "," + getVendorPrice() + "," + getMarkupPercentage() + "," + getRegularPrice() + "," + getCurrentDiscount() + "," + getCurrentPrice(); 
    }   
}

public class U2A4_IfraInam {
    
    public static void main(String[] args) throws IOException {
    
    ArrayList<Item> itemList = new ArrayList<>(); // arraylist used to store each line of the inventoy as objects 
    
    int fruit_sku_num = 0; // used to keep track of the number of fruits in the inventory
    int vegetable_sku_num = 0; // used to keep track of the number of vegetables in the inventory 
    int meat_sku_num = 0; // used to keep track of the number of meats in the inventory
    int decimalPlaces = 2; // used to round any calculations to 2 decimal places
    
    
    try {
        // creates a BufferedReader object called reader 
    try (BufferedReader reader = new BufferedReader(new FileReader("src\\u2a4_ifrainam\\inventory (3).txt"))) {
        String line;
        while((line = reader.readLine()) != null) { // while loop to read the inventory file 
            
            // splits each line of the file in the presence of a comma and stores each section into a list  
            String[] argument = line.split(",");  
            // each index of the list is used as arugments to create an item object
            Item item = new Item(argument[0],argument[1],argument[2],Integer.parseInt(argument[3]), Integer.parseInt(argument[4]), Double.parseDouble(argument[5]), Double.parseDouble(argument[6]), Double.parseDouble(argument[7]), Double.parseDouble(argument[8]), Double.parseDouble(argument[9]));      
            itemList.add(item); // each item object is added to the itemList  
            
            // when the itemList reaches a vegetable, fruit_sku_num is used to keep track of the number for the last occurence of fruits
            if (argument[0].equals("VEG-0001")) {
                String last_fruit_sku = itemList.get(itemList.size()-2).getSKU(); // gets the sku of the last fruit in the list
                String[] last_fruit_sku_list = last_fruit_sku.split("-"); // splits the sku into 2 sections and stores the sections into a list
                fruit_sku_num = Integer.parseInt(last_fruit_sku_list[1]); // the number section of the list is parsed into an integer 
            }
            // when the itemList reaches a meat, vegetable_sku_num is used to keep track of the number for the last occurence of vegetables
            if (argument[0].equals("MEA-0001")) {
                String last_vegetable_sku = itemList.get(itemList.size()-2).getSKU(); // gets the sku of the last vegetable in the list
                String[] last_vegetable_sku_list = last_vegetable_sku.split("-"); // splits the sku into 2 sections and stores the sections into a list
                vegetable_sku_num = Integer.parseInt(last_vegetable_sku_list[1]); // the number section of the list is parsed into an integer      
            }
        }
            
            String last_meat_sku = itemList.get(itemList.size()-1).getSKU(); // gets the sku of the last item in the list, which is a meat
            String[] last_meat_sku_list = last_meat_sku.split("-"); // splits the sku into 2 sections and stores the sections into a list
            meat_sku_num = Integer.parseInt(last_meat_sku_list[1]); // the number part of the list is parsed into an integer
            
            reader.close(); // closes the file 
            
        } 
        } 
        catch (FileNotFoundException ex) { // catches any file not found exceptions
            Logger.getLogger(U2A4_IfraInam.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    boolean go = true; // the variable's status determines whether the application continues or stops
    
    while (go){
        
        Scanner scanner = new Scanner(System.in); // allows for user input
        
        System.out.println("Please enter either 1, 2, 3, or 4 to make your selection. \n1. Search Inventory \n2. Add to Inventory \n3. Save \n4. Exit"); // prints a menu where a user can choose between 4 options
        String choice = scanner.nextLine(); // gets the users input 
        switch (choice) {
            // when the user decides to seach the inventory:
            case "1" -> { 
                System.out.println("Would you like to search the inventory via SKU or name?"); // asks the user whether they want to search by SKU or name
                String search = scanner.nextLine().trim(); 
                // if the user wants to search by name: 
                if (search.equalsIgnoreCase("name")) { 
                    System.out.println("Enter the name of the item."); // asks the user for the name of the item
                    String searchName = scanner.nextLine(); 
                    // iterates through the list and checks if the user's input matches any name in the objects of the list
                    for (int i = 0; i < itemList.size(); i++) {
                        boolean contains = (itemList.get(i).getName().contains(searchName)); 
                        if (contains == true) { // if an object does contain the name the user inputted, all the details of the item are outputted 
                            System.out.println("\nDetails of " + searchName + ": "); 
                            System.out.println("SKU: " + itemList.get(i).getSKU());
                            System.out.println("Name: " + itemList.get(i).getName());
                            System.out.println("Category: " + itemList.get(i).getCategory());
                            System.out.println("Quantity: " + itemList.get(i).getQuantity());
                            System.out.println("Minimum Quantity: " + itemList.get(i).getMinimumQuantity());
                            System.out.println("Vendor Price: $" + itemList.get(i).getVendorPrice());
                            System.out.println("Markup Percentage: " + itemList.get(i).getMarkupPercentage() + "%");
                            System.out.println("Regular Price: $" + itemList.get(i).getRegularPrice());
                            System.out.println("Current Discount: " + itemList.get(i).getCurrentDiscount() + "%" );
                            System.out.println("Current Price: $" + itemList.get(i).getCurrentPrice() + "\n");
                            break;
                        }
                        else if (i == itemList.size()-1) { // if the loop has iterated to the end of the list and no name matches the user's input, a message is outted to notify the user 
                            System.out.println("This item is not present in the inventory.");
                            break; 
                        }
                    }
                }
                // if the user wants to search by SKU:
                else if (search.equalsIgnoreCase("SKU")) { 
                    System.out.println("Enter the SKU of the item."); // asks the user for the SKU of the item
                    String searchSKU = scanner.nextLine(); 
                    // iterates through the list and checks if the user's input matches any SKU in the objects of the list
                    for (int i = 0; i < itemList.size(); i++) {
                        boolean contains = (itemList.get(i).getSKU().contains(searchSKU)); 
                        if (contains == true) { // if an object does contain the SKU the user inputted, all the details of the item are outputted 
                            System.out.println("\nDetails of " + searchSKU + ": "); 
                            System.out.println("SKU: " + itemList.get(i).getSKU());
                            System.out.println("Name: " + itemList.get(i).getName());
                            System.out.println("Category: " + itemList.get(i).getCategory());
                            System.out.println("Quantity: " + itemList.get(i).getQuantity());
                            System.out.println("Minimum Quantity: " + itemList.get(i).getMinimumQuantity());
                            System.out.println("Vendor Price: $" + itemList.get(i).getVendorPrice());
                            System.out.println("Markup Percentage: " + itemList.get(i).getMarkupPercentage() + "%");
                            System.out.println("Regular Price: $" + itemList.get(i).getRegularPrice());
                            System.out.println("Current Discount: " + itemList.get(i).getCurrentDiscount() + "%" );
                            System.out.println("Current Price: $" + itemList.get(i).getCurrentPrice() + "\n");
                            break;
                        }
                        else if (i == itemList.size()-1) { // if the loop has iterated to the end of the list and no SKU matches the user's input, a message is outted to notify the user 
                            System.out.println("\nThis item is not present in the inventory.\n");
                            break; 
                        }
                    }
                }      
            }
            // when the user decides to add to the inventory:
            case "2" -> { 
                // initializes the required variables to null or 0 
                String category = null;
                int quantity = 0, minimumQuantity = 0;
                double vendorPrice = 0.0, markupPercentage = 0.0, regularPrice_round = 0.0, currentDiscount = 0.0, currentPrice_round = 0.0;         
                
                // asks the user for the name of the item
                System.out.println("Enter the name of the item."); 
                String name = scanner.nextLine().trim(); 
                // if the name is longer than 20 characters, a message is outputted to notify them
                if (name.length() > 20) {
                    System.out.println("The name must not exceed 20 characters."); 
                    break;
                }
            
                try {
                
                // asks the user to choose the category of the object
                System.out.println("Select the category for the item. \n1. Fruit \n2. Vegetable \n3. Meat");
                int userSelection = scanner.nextInt();
                switch (userSelection) {
                    case 1 -> category = "FRUIT"; // if the user enters 1, the category is fruit
                    case 2 -> category = "VEGETABLE"; // if the user enters 2, the category is vegetable
                    case 3 -> category = "MEAT"; // if the user enters 3, the category is meat
                    default -> {}
                }
            
                // asks the user for the quantity of the item
                System.out.println("Enter the quantity of " + name + " currently available in the inventory."); 
                quantity = scanner.nextInt(); 
            
                // asks the user for the minimum quantity of the item
                System.out.println("Enter the minimum amount of " + name + " that should be in the inventory.");
                minimumQuantity = scanner.nextInt(); 
            
                // asks the user for the vendor price of the item
                System.out.println("Enter the vendor price of " + name + "."); 
                vendorPrice = scanner.nextDouble(); 
            
                // asks the user for the markup percentage of the item
                System.out.println("Enter the markup percentage of " + name + "."); 
                markupPercentage = scanner.nextDouble(); 
                
                // asks the user for the current discount percentage of the item
                System.out.println("Enter the current discount percentage of " + name + ".");
                currentDiscount = scanner.nextDouble(); 
            
                // calculates the regular price of the item
                double regularPrice = vendorPrice / (100/markupPercentage) + vendorPrice; 
                regularPrice_round = decimalRounding(regularPrice, decimalPlaces);
                //regularPrice_round = Math.round(regularPrice * 100) / 100; 
                
                // calculates the current price of the item
                double currentPrice = regularPrice - (regularPrice * (currentDiscount/100));
                currentPrice_round = decimalRounding(currentPrice, decimalPlaces);
         
                } 
                catch (Exception e) { // checks if the user has entered an invalid input such as a string and notifies them of the error
                    System.out.println("Invalid Input."); 
                }
                
                // if the category is fruit:
                if ("FRUIT".equals(category)) {
                    fruit_sku_num++; // increments the fruit counter so that it is at the last fruit item in the list
                    String format = String.format("%04d",fruit_sku_num); // used to format the number part of the sku to have 4 digits
                    String fruit_sku = "FRU-" + format; // creates the sku for a fruit item
                    // creates a fruit object of the Item class
                    Item userItem = new Item(fruit_sku, name, category, quantity, minimumQuantity, vendorPrice, markupPercentage, regularPrice_round, currentDiscount, currentPrice_round);
                    itemList.add(fruit_sku_num-1, userItem); // adds the item to the correct part of the itemList
                }  
                // if the category is vegetable:
                else if ("VEGETABLE".equals(category)) {
                    vegetable_sku_num++; // increments the vegetable counter so that it is at the last vegetable item in the list
                    String format = String.format("%04d",vegetable_sku_num); // used to format the number part of the sku to have 4 digits
                    String veg_sku = "VEG-" + format; // creates the sku for a vegetable item
                    // creates a vegetable object of the Item class
                    Item userItem = new Item(veg_sku, name, category, quantity, minimumQuantity, vendorPrice, markupPercentage, regularPrice_round, currentDiscount, currentPrice_round);
                    itemList.add(fruit_sku_num+vegetable_sku_num-1, userItem); // adds the item to the correct part of the itemList
                }
                // if the category is meat:
                else if ("MEAT".equals(category)) {
                    meat_sku_num++; // increments the meat counter so that it is at the last meat item in the list
                    String format = String.format("%04d",meat_sku_num); // used to format the number part of the sku to have 4 digits
                    String meat_sku = "MEA-" + format; // creates the sku for a meat item
                    // creates a meat object of the Item class
                    Item userItem = new Item(meat_sku, name, category, quantity, minimumQuantity, vendorPrice, markupPercentage, regularPrice_round, currentDiscount, currentPrice_round);
                    itemList.add(userItem); // adds the item to the correct part of the itemList
                }   
                    
            }
            // when the user wants to save the items to the inventory 
            case "3" -> {
                System.out.println("Saved to Inventory."); // outputs a message to notify them that the items have been saved to the inventory
                // deletes the contents of the inventory file
                try (FileWriter writer = new FileWriter("src\\u2a4_ifrainam\\inventory (3).txt")) {
                    writer.write("");
                    writer.close(); // closes the file 
                    // rewrites the itemList into the empty file using a for loop
                    try (BufferedWriter rewriter = new BufferedWriter(new FileWriter("src\\u2a4_ifrainam\\inventory (3).txt"))) {
                        for (int i = 0; i < itemList.size(); i++) {
                            rewriter.write(itemList.get(i) + "\n");
                        }
                    rewriter.close(); // closes the file so that the arraylist is written into the file
                    }
                }
            }  
            // when the user wants to exit: 
            case "4" -> {
                go = false;
            }     
        }        
    }
    
    }
    
    // method used to round any calculations made to 2 decimal places (for a cleaner look)
    public static double decimalRounding(double number, int decimalPlaces) {
        double multiplier = Math.pow(10, decimalPlaces);
        return Math.round(number * multiplier) / multiplier;
    }
    
}
