/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelancinggoodstransportation;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author donaa
 */
public class FreeLancingGoodsTransportation {
     public static void main(String[] args) throws IOException {
     
        Scanner input0 = new Scanner(System.in);

        File file = new File("users.txt");

        if (!file.exists()) {

            file.createNewFile();

        }

        boolean loggedIn = false;

        while (!loggedIn) {

            System.out.println("Enter '1' to Login or '2' to Register:");

            int option = input0.nextInt();

            input0.nextLine();

            switch (option) {

                case 1:

                    loggedIn = login(file, input0);

                    break;

                case 2:

                    register(file, input0);

                    break;

                default:

                    System.out.println("Invalid option. Please try again.");

            }

        } 
    
     
     Scanner input = new Scanner(System.in);
       User u=new User ();
        System.out.println("Choose the service you want:\n"
                + "*For Booking enter 1\n "
                + "*For Trackig enter 2\n"
                + "*For Paying enter 3\n"
                + "*     4) exit        *\n");
        int option1 = input.nextInt();
        File file1 = new File("Bookinginfo.txt");
        PrintWriter output1 = new PrintWriter(new FileWriter(file1, true));
        Scanner input1 = new Scanner(file1);
        do{
        switch (option1) {

            case 1:
                System.out.println("Enter CommercialRegistrationNo (company)\n or \n"
                        + "id No (individual)\n");
                String id = input.next();
                if (id.charAt(0) == '0') {
                    Company c = new Company();
              
                   c.setCommercialRegistrationNo(id);

                    output1.println("CommercialRegistrationNo:"+c.getCommercialRegistrationNo());
                } else if (id.charAt(0) == '1') {

                    individual i = new individual();
                    i.setIndividual_id(id);
                    output1.println("Individual ID NO:"+i.getIndividual_id());
                }
                else{
                        System.out.println("Wrong starting :\n"
                                + "For company the CommercialRegistrationNo start with 0\n"
                                + "for individual start with 1\n");
                            }
                }
                System.out.println("enter the date ");
                 String date = input.nextLine();
                    input.next();
                  u.setAppointment_date(date);
              
                System.out.println("enter the day ");
                 String day = input.nextLine();
                    input.next();
                u.setAppointment_day(day);
                System.out.println("schedule your shipment:\n"
                        + "1]00:00 to 06:00\n"
                        + "2]06:00 to 12:00\n"
                        + "3]12:00 to 18:00\n"
                        + "4]18:00 to 00:00\n");
                int option2 = input.nextInt();
                switch (option2) {

                    case 1:
                        u.setAppointment_time("00:00 to 06:00");
                        break;
                    case 2:
                        u.setAppointment_time("06:00 to 12:00");
                        break;
                    case 3:
                        u.setAppointment_time("12:00 to 18:00");
                        break;
                    case 4:
                        u.setAppointment_time("18:00 to 00:00");
                        break;

                }
                System.out.println("To ensure quality delivery , please answer these questions:\n");
                Transport_feature_info t = new Transport_feature_info();

                System.out.println("Dose the shipment require air conditioning?\n");
                String choice = input.nextLine();
                t.setCondition(choice);
                   input.next();
                   System.out.print(t.getcondition());
                System.out.println("How many hours do you need the vehicle?\n ");
                  String h = input.nextLine();
                  t.setHours(h);
                     input.next();
                    System.out.print(t.getHours());

                  System.out.println("What date do you want the shipment to arrive?\n");
                  String d = input.nextLine();
                  t.setReserved_date(d);
                        input.next();
                    System.out.print(t.getReserved_date());

                System.out.println("Choose the type of vehicle\n"
                        + "1 vehicle A )\n"
                        + "id :223344\n"
                        + "capacity: between 500 kg and 2.5 tons.\n"
                        + "2 vehicle B )\n"
                        + "id:990044\n"
                        + "capacity: between 4.5 and 5.5 tons.\n"
                        + "3 vehicle C )\n"
                        + "id:445566\n"
                        + "capacity: between 7.5 and 9 tons.\n");
                       int option3 = input.nextInt();
                        
                       switch(option3){
                           case 1:
                                t.setVehicle_Name("vehicle A");
                                t.setcapacity(" between 500 kg and 2.5 tons");
                                t.setVehicle_ID("223344");
                             break;
                              case 2:
                                t.setVehicle_Name("vehicle B");
                                t.setcapacity(" between 4.5 and 5.5 tons");
                                t.setVehicle_ID("990044");
                             break;
                              case 3:
                                t.setVehicle_Name("vehicle C");
                                t.setcapacity(" between 7.5 and 9 tons");
                                t.setVehicle_ID("445566");
                             break;
                       }
                        
                        
                       System.out.println("Enter pick up address\n "
                               + "state:\n");
                       String s = input.nextLine();
                       
                       System.out.println("city:\n");
                       String c = input.nextLine();
                      
                       System.out.println("street:\n ");
                       String st = input.nextLine();

                       System.out.println("zip code:\n ");
                       String z = input.nextLine();
                       
                       Address a=new Address(st,c,s,z);
                       System.out.println("Enter destinition address\n"
                               + "state:\n");
                       String s1 = input.nextLine();

                       System.out.println("city:\n");
                       String c1 = input.nextLine();

                       System.out.println("street:\n");
                       String st1 = input.nextLine();

                       System.out.println("zip code:\n");
                       String z1 = input.nextLine();
                       
                      Address a1=new Address(st,c,s,z);
    
              
       
            output1.println(u.toString());
            output1.println(t.toString());
            output1.println(a.toString());
            output1.println(a1.toString());


            
           System.out.println("Choose the service you want:\n"
                + "*For Booking enter 1\n "
                + "*For Trackig enter 2\n"
                + "*For Paying enter 3\n"
                + "*     4) exit        *\n");
             option1 = input.nextInt();
             
            break;
    
        }while(option1== 1||option1== 2||option1==3);

    input.close();
    output1.close();
     
     }
     public static boolean login(File file, Scanner input) throws FileNotFoundException {

        System.out.println("Enter your username:");

        String username = input.nextLine();

        System.out.println("Enter your password:");

        String password = input.nextLine();

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();

            String[] parts = line.split(",");

            if (parts[0].equals(username) && parts[1].equals(password)) {

                System.out.println("Login Successful!");

                scanner.close();

                return true;

            }

        }

        System.out.println("Invalid username or password. Please try again.");

        scanner.close();

        return false;

    }
      public static void register(File file, Scanner input) throws IOException {

        System.out.println("Enter a username:");

        String username = input.nextLine();

        System.out.println("Enter a password:");

        String password = input.nextLine();

        PrintWriter writer = new PrintWriter(new FileWriter(file, true));

        writer.append(username + "," + password + "\n");

        writer.close();

        System.out.println("Registration successful!");

    }
    
}
