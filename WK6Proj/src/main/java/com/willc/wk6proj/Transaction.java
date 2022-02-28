/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.willc.wk6proj;
import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 *
 * @author Claude J Will
 */

public class Transaction {
     // declare required variables
    
    public final ArrayList<LineItem> lineItems;
    private int customerID;
    private String customerName;
    DecimalFormat dFormat = new DecimalFormat("#.##");
    // constructor with parameters
    public Transaction(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        // create arraylist to hold line items
        this.lineItems = new ArrayList<LineItem>();
    }
    // public GET method to retrieve the CustomerId
    public int getCustomerId(){
        return customerID;
    }
    // get method for customer name
    public String getCustomerName(){
        return customerName;
    }
    // set method for customer id
    public void setCustomerId(int cId){
        this.customerID = cId;
    }
    // set method for customer name
    public void setCustomerName(String n){
        this.customerName = n;
    }
    // method for the purpose of adding line item to transaction
    public void addLineItem(String itemName, int quantity, double price){
        // create and add lineItem to lineItems arraylist
        lineItems.add(new LineItem(itemName, quantity, price));
    }
    // method for updating a line item in the transaction
    public void updateItem(String itemName, int quantity, double price){
        boolean isFound = false;
        LineItem lineItem = null;
        // Find the line item by name
        for(int i = 0; i<lineItems.size();i++){
            lineItem = lineItems.get(i);
            if(lineItem.getName().equalsIgnoreCase(itemName)){
                isFound = true;
                break;
            }
        }
        // Check if line item found or not, if found update quantity
        if(isFound){
            lineItem.setQuantity(quantity);
        } else {
            System.out.println("Line item not found with given item name!");
        }
    }
    // get the totalPrice of the transaction
    public double getTotalPrice(){
        double totalPrice = 0.0;
        for(int i = 0; i < lineItems.size(); i++){
            totalPrice += lineItems.get(i).getTotalPrice();
        }
        return totalPrice;
    }

    // get line item by its name
    public String getLineItem(String s){
        boolean isFound = false;
        LineItem lineItem = null;
        int i;
        // search for line item by itemName passed in as s
        for(i = 0; i<lineItems.size();i++){
            lineItem = lineItems.get(i);
            if(lineItem.getName().equalsIgnoreCase(s)){
                isFound = true;
                break;
            }
        }

        // check if line item has been found
        if(isFound){
            return lineItem.toString();
        } else {
            return "Line item not found with given item name!";
        }
    }
    // toString method to return transaction description
    public String toString(){
        String descriptionOfTransaction;

        // get description of line item
        String descriptionOfLineItems = "";
        for(int i = 0; i < lineItems.size();i++){
            descriptionOfLineItems += lineItems.get(i).toString() + "\n";
        }

        descriptionOfTransaction = "Customer Id : "+customerID+"\nCustomer Name : "+customerName+"\n"+descriptionOfLineItems+"Transaction Total : \t\t\t\t\t$"+dFormat.format(getTotalPrice());
        return descriptionOfTransaction;
    }
}
