/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginn;

import java.io.File;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author hp
 */public class Logistics {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws Exception {

    File file = new File("database.txt");
    PrintWriter output = new PrintWriter(new FileWriter(file, true));
    Scanner input = new Scanner(file);
    Scanner keyboard = new Scanner(System.in);
    Customers customer = new Customers();

    System.out.println("1. Login");
    System.out.println("2. Register");
    //System.out.println("3. quite");

    int option = keyboard.nextInt();

    do{
        System.out.println("1. Login");
    System.out.println("2. Register");

     option = keyboard.nextInt();
    switch (option) {
        case 1:
            System.out.println("LOGIN PAGE");
            System.out.println("Username: ");
            String inpUser = keyboard.next();

            if (input.next().equals(inpUser)) {
                System.out.println("Password: ");
                String inpPass = keyboard.next();
                if (input.next().equals(inpPass)) {
                    System.out.println("Login Succesful!");
                } else {
                    System.out.println("Password is incorrect.");
                }
            } else {
                System.out.println("Username is incorrect.");
            }
            break;

        case 2:
            System.out.println("REGISTRATION PAGE");
            System.out.println("Username: ");
            String username = keyboard.next();
            customer.setUsername(username);


            System.out.println("Password: ");
            String password = keyboard.next();
            customer.setPassword(password);

            System.out.println("You've successfully registered! You may login now.");

            output.println(customer.getUsername());
            output.println(customer.getPassword());

            output.close();
            break;
          case 3:
            if(option!=1||option!=2){
               System.out.println("1 OR 2 PLEASE");  
            }
        //default: System.out.println("1 OR 2 PLEASE");  
    }}
    while(option== 1||option== 2);
    

        
        
    
    keyboard.close();
    input.close();
}}