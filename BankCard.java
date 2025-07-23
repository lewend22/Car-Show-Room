
package com.mycompany.carshowroom;

import java.util.Scanner;
public class BankCard extends BankSystem {
        protected double withDraw ;
        protected int deposid ;
        protected String transcationID = "202578" ;
        static int c = 0 ;

    public BankCard(double withDraw, int deposid) {
        this.withDraw = withDraw;
        this.deposid = deposid;
    }

    public BankCard(String accountNumber, String password, String fullName, String idNumber, String dateOfBirth, String creationDay, String endDate, String jobOfAccountHolder, float salary, double amount) {
        super(accountNumber, password, fullName, idNumber, dateOfBirth, creationDay, endDate, jobOfAccountHolder, salary, amount);
    }
    
    public BankCard(double withDraw, int deposid, String accountNumber, String password, String fullName, String idNumber, String dateOfBirth, String creationDay, String endDate, String jobOfAccountHolder, float salary, double amount) {
        super(accountNumber, password, fullName, idNumber, dateOfBirth, creationDay, endDate, jobOfAccountHolder, salary, amount);
        this.withDraw = withDraw;
        this.deposid = deposid;
    }

    public String getTranscationID() {
        String num ;
        c++;
        return transcationID + c;
    }

    
    public double getWithDraw() {
        return withDraw;
    }

    public void setWithDraw(double withDraw) {
        this.withDraw = withDraw;
    }

    public int getDeposid() {
        return deposid;
    }

    public void setDeposid(int deposid) {
        this.deposid = deposid;
    }
    @Override
        public double getAmount() {
        return this.amount = super.getAmount() + deposid ;
    }
       public void deposid(){
           Scanner in = new Scanner(System.in);
           System.out.println("Please enter how much do you want to dopsid :");
           deposid = in.nextInt();
           System.out.println(amount + deposid +" : ");
           System.out.println("[PROCESSING..........]");
           System.out.println("your Balance : "+getAmount());
        }
    public void withDraw(){
         Scanner in = new Scanner(System.in);
         int count = 2 ; 
         System.out.println("Please enter how much do you want to withdraw : ");
         withDraw = in.nextDouble() ;
         while(count > 0){
        if(withDraw <= this.amount){
            amount =  this.amount - withDraw ;
            System.out.println("Withdraw has completed successfuly");
            System.out.println("Your remaining balance : "+amount);
            break;
        }else{
               System.out.println("Insufficient balance");
               System.out.println("");
               System.out.println("Please enter a valid number ");
               withDraw = in.nextDouble() ;
               count-- ;
            }
             System.out.println("");
         }
    }
    public void Transaction(long CarPrice){
            if(CarPrice < amount){
                    System.out.println("Car price : "+CarPrice + "  -- your balance : "+amount+"$");
                    System.out.println("[Processing..............]");
                    this.amount = amount - CarPrice ;
                    System.out.println("Purchase has been successfully completed");
                    System.out.println("Company name : Mercedes Benz ");
                    System.out.println("Transcation ID : "+getTranscationID()+" -- Local Date 2025/7/20");
                    System.out.println("Your Balance : "+amount+"$");
                    System.out.println("---------------");
                    System.out.println("We'll be happy to assist you anytime when you're ready to pick up your car\nSincerely, Car Show Room.\n--------------\n Kind regards,\n" +
                                                                                                                                             "Car Showroom Team\n" +
                                                                                                                            "📍 123 Auto Street, Berlin, Germany\n" +
                                                                                                                                             "📞 +49 123 456 7890\n" +
                                                                                                                                           "📧 info@carshowroom.de\n" +
                                                                                                                                                "🌐 www.carshowroom.de ");
            }else
                System.out.println("Transcation Failed : Insufficient Balance.");
    }
        
}
    