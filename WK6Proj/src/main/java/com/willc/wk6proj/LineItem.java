/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.willc.wk6proj;
import java.text.DecimalFormat;
/**
 *
 * @author Claude J Will
 */
public class LineItem {
    // Declare Required Variables
    private String itemName;
    private int quantity;
    private double price;
    DecimalFormat df = new DecimalFormat("#.##");
    // constructor with proper parameters
    public LineItem(String itemName, int quantity, double price){
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
    // ACCESSORS
    // GET itemName
    public String getName(){
        return itemName;
    }
    // GET quantity
    public int getQuantity(){
        return quantity;
    }
    // GET item price
    public double getPrice(){
        return price;
    }
    
    // mutators
    // set the quantity for an item
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    // SET the price for an item
    public void setPrice(double price){
        this.price = price;
    }

    // the getTotalPrice() method calculates the total price for a line item
    // by multiplying the quantity by the price
    public double getTotalPrice(){
        return quantity * price;
    }

    // toString() method is used to concatenate the name of the item, the quantity purchased
    // the price and the total price on a single line
    @Override
    public String toString(){
        String lineDescription;
        lineDescription = (getName()+"\t\tqty "+quantity+ " @$"+df.format(price)+"\t\t$"+df.format(getTotalPrice()));
        return lineDescription;
    }
}
