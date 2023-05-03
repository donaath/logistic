/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelancinggoodstransportation;


public class Package {
  
    int Package_ID;
    String Package_Type;
    double Weight;
    String Distenation;
    String Arrival;
    String Num_ToD;
    
    public Package(int Package_ID,String Package_Type, double Weight, String Distenation, String Arrival, String Num_ToD){
        
        this.Package_ID=Package_ID;
        this.Package_Type=Package_Type;
        this.Weight=Weight;
        this.Distenation=Distenation;
        this.Arrival=Arrival;
        this.Num_ToD=Num_ToD;
        
    }

    public int getPackage_ID() {
        return Package_ID;
    }

    public String getPackage_Type() {
        return Package_Type;
    }

    public double getWeight() {
        return Weight;
    }

    public String getDistenation() {
        return Distenation;
    }

    public String getArrival() {
        return Arrival;
    }

    public String getNum_ToD() {
        return Num_ToD;
    }

    public void setPackage_ID(int Package_ID) {
        this.Package_ID = Package_ID;
    }

    public void setPackage_Type(String Package_Type) {
        this.Package_Type = Package_Type;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public void setDistenation(String Distenation) {
        this.Distenation = Distenation;
    }

    public void setArrival(String Arrival) {
        this.Arrival = Arrival;
    }

    public void setNum_ToD(String Num_ToD) {
        this.Num_ToD = Num_ToD;
    }
    
    
    public String toString(){
        return "";
    }
}

