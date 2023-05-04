/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freelancinggoodstransportation;
public class Trasport {
    String transport_Ntime;
    String transport_destenation;
    String transport_arrival;



 
  public String getNtime() {
    return transport_Ntime;
  }
 public String gettidestnation() {
    return transport_destenation;
  }

 public String getarrival() {
    return transport_arrival;
  }
 public String toString() {
   return "the time:" + this.transport_Ntime + ",, "
                + "the destenation:" + this.transport_destenation + ",, " + "arrival:"
                + this.transport_arrival + ",, " ;
}
}
