
package com.mycompany.carshowroom;

public class Person {
        protected String firstName ;
        protected String lastName ;
        protected String birthOfDate ;
        protected String maritalStatus ;
        protected String id ;  
        protected String insuranceNumber ;
        protected String Email ;
        protected String phoneNumber ; 
        
    public Person () {} ;  

    public Person(String firstName, String lastName, String birthOfDate, String maritalStatus, String id, String insuranceNumber, String Email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
        this.maritalStatus = maritalStatus;
        this.id = id;
        this.insuranceNumber = insuranceNumber;
        this.Email = Email;
        this.phoneNumber = phoneNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
        
          
}
