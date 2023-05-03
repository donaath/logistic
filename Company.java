/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelancinggoodstransportation;

/**
 *
 * @author donaa
 **/
class Company extends User{
   private int CommercialRegistrationNo;
    public Company(int id, String pass, String name, String address, String A_day, String A_time, String A_date,int CommercialRegistrationNo) {
        super( pass, name, address, A_day, A_time, A_date);
        this.CommercialRegistrationNo= CommercialRegistrationNo;
    }
   public void setCommercialRegistrationNo(int c){
   CommercialRegistrationNo=c;
   
   }
   public int getCommercialRegistrationNo(){
   
   return CommercialRegistrationNo ;
   }

    
    
}
