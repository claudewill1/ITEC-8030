/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.willc.wk6proj;

/**
 *
 * @author Claude J Will
 */
public class TransactionTest {
    public static void main(String[] args){
        // Create Transaction Object
        Transaction transaction = new Transaction(1234567, "Bob William");

        // Add line items
        transaction.addLineItem("Colgate Toothpaste", 2, 2.99);
        transaction.addLineItem("Bounty Paper Towels", 1, 1.49);
        // adding a \t escape character after tissue is the only way to make the qty price and total line up with the other items
        // in this instance with what has been given to this point in the book
        transaction.addLineItem("Kleenex Tissue\t", 1, 2.49);

        // print transaction description using the toString() previously defined in the Transaction class
        System.out.println(transaction.toString());

        //Update line item
        transaction.updateItem("Colgate Toothpaste", 3, 2.50);
        // print details of the updated transaction
        System.out.println("\n-------Updated Transaction details-------");
        System.out.println(transaction.toString());
    }
}
