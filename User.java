/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelancinggoodstransportation;

/**
 *
 * @author donaa
 */
public class User {
  
    private String user_pass;
    private String user_name;
    private String address;
    private String Appointment_day;
    private String Appointment_time;
    private String Appointment_date;
    public User( String pass,String name,String address, String A_day, String A_time, String A_date){
   
    user_pass=pass;
    user_name=name;
    address =address;
    Appointment_day= A_day;
    Appointment_date=A_date;
    Appointment_time=A_time;
    }
    
   
     
    public void setpass(String p){
    user_pass=p;
    }
    public String getUserPass(){
    
    return user_pass;
    }
    
     public void setname(String n){
    user_name=n;
    }
    public String getUsername(){
    
    return user_name;
    }
     public void setAddress(String a){
    address=a;
    }
    public String getUserAddress(){
    
    return address;
    }
     public void setAppointment_day(String d){
    Appointment_day =d;
    }
    public String getAppointment_day(){
    
    return Appointment_day ;
    }
     public void setAppointment_date(String d){
    Appointment_date=d;
    }
    public String getAppointment_date(){
    
    return Appointment_date;
    }
     public void setAppointment_time(String t){
    Appointment_time=t;
    }
    public String getAppointment_time(){
    
    return Appointment_time ;
    }
    public String toString(){

         return "";

}
    
}
