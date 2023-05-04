/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.paymentt;

import java.util.*; //NEW FILE/CLASS


 public class Paymentt {
     private double amount;
     
     public Paymentt() { //constructor
         amount = 0.0;
       
     }

     public Paymentt(double paymentAmount) { //initializes payment amount
         amount = paymentAmount;
     }

     public void setPayment(double paymentAmount) {
         amount = paymentAmount;
     }

     public double getPayment() {
         return amount;
     }

     public void paymentDetails() {
         System.out.println("The payment amount is " + amount);
     }
     

 }
 class CreditCardPayment extends Paymentt {
     private String date, name, ccn;

     public CreditCardPayment(double amount, String date, String name, String ccn) {
         super(amount);
         this.date = date;
         this.name = name;
         this.ccn = ccn;
     }

     public void paymentDetails() { //printing
         System.out.println("Name on card: " + this.getName());
         System.out.println("Expiration date: " + this.getDate());
         System.out.println("Credit card number: " + this.getCcn());
         System.out.println("The payment by credit card amount is " + getPayment());

     }

     public String getCcn() {
         return ccn;
     }

     public void setCcn(String ccn) {
         this.ccn = ccn;
     }

     public String getDate() {
         return date;
     }

     public void setDate(String date) {
         this.date = date;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

 class CashPayment extends Paymentt {

     public CashPayment(double paymentAmount) {
         super(paymentAmount);
     }

     public void paymentDetails() {
         System.out.println("The payment cash amount is " + this.getPayment());
     }
      public String toString() {
   return "payment is done" ;
}
 }

