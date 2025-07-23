
package com.mycompany.carshowroom;

import java.util.Scanner;


public class BankSystem {
        
    private String accountNumber , password;
    public String fullName , idNumber , dateOfBirth , creationDay , endDate , jobOfAccountHolder; 
    private float salary;
    public double amount;
public BankSystem(){}

public BankSystem(String accountNumber, String password) {
        this.accountNumber = accountNumber;
        this.password = password;
    
    }
public BankSystem(String accountNumber, String password, String fullName, String idNumber, String dateOfBirth, String creationDay, String endDate, String jobOfAccountHolder, float salary, double amount) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
        this.creationDay = creationDay;
        this.endDate = endDate;
        this.jobOfAccountHolder = jobOfAccountHolder;
        this.salary = salary;
        this.amount = amount;
    }

public void display(){
    System.out.println("------------------------------------------");
    System.out.println("Full Name : "+fullName);
    System.out.println("Id Number : "+idNumber);
    System.out.println("Date of Birth : "+dateOfBirth);
    System.out.println("Creation Day : "+creationDay);
    System.out.println("endDate : "+endDate);
    System.out.println("-------------------------------------------");
    System.out.println("Your Account Number : "+accountNumber);
    System.out.println("Your salary : "+salary);
    System.out.println("Your Job : "+jobOfAccountHolder);
    System.out.println("your Amount : "+amount);
    System.out.println("-------------------------------------------");
    
}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCreationDay() {
        return creationDay;
    }

    public void setCreationDay(String creationDay) {
        this.creationDay = creationDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobOfAccountHolder() {
        return jobOfAccountHolder;
    }

    public void setJobOfAccountHolder(String jobOfAccountHolder) {
        this.jobOfAccountHolder = jobOfAccountHolder;
    }
        
public void loggin(){
            System.out.println("Logged In");
            display();
            
        }
    
}
