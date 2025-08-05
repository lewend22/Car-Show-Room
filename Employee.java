package com.mycompany.carshowroom;

import java.util.Scanner;


public class Employee extends Person {
       protected String employeeID ;
       protected String password ; 
       protected String jobTitel ;
       protected float workingHours ; 
       protected float hourlyPay ;
       protected String request ;
       
    public Employee(){}  
    
    public Employee(String employeeID, String password, String jobTitel, float workingHours, float hourlyPay, String firstName, String lastName, String birthOfDate, String maritalStatus, String id, String insuranceNumber, String Email, String phoneNumber) {
        super(firstName, lastName, birthOfDate, maritalStatus, id, insuranceNumber, Email, phoneNumber);
        this.employeeID = employeeID;
        this.password = password;
        this.jobTitel = jobTitel;
        this.workingHours = workingHours;
        this.hourlyPay = hourlyPay;
    }

    public Employee(String employeeID, String password, String jobTitel, float workingHours, float hourlyPay, String request, String firstName, String lastName, String birthOfDate, String maritalStatus, String id, String insuranceNumber, String Email, String phoneNumber) {
        super(firstName, lastName, birthOfDate, maritalStatus, id, insuranceNumber, Email, phoneNumber);
        this.employeeID = employeeID;
        this.password = password;
        this.jobTitel = jobTitel;
        this.workingHours = workingHours;
        this.hourlyPay = hourlyPay;
        this.request = request;
    }
        
    
    public Employee(String employeeID, String password) {
        this.employeeID = employeeID;
        this.password = password;
    }

    public String getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobTitel() {
        return jobTitel;
    }

    public void setJobTitel(String jobTitel) {
        this.jobTitel = jobTitel;
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(float workingHours) {
        this.workingHours = workingHours;
    }
    
    public float getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(float hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }
    
    
    
    public void login(){
        Scanner in = new Scanner(System.in);
        System.out.println("Here you can update your personal information:\n" +"\n" +"-Mobile number\n" +"\n" +"-Email address\n" +"\n" +"-Marital status\n" +"\n" +"-Send a quick request to the company\n" +"\n" +"-View your personal data registered with the company\n" 
                                         +"\n" +"-You can view your full salary and net salary after tax deductions\n" +"\n" +"-You can change your company password as well\n" +"\n" +"\n" +"All you have to do is follow the steps in front of you.\n");
        System.out.println("press any key to continue");  
        String press = in.next();
         int c = 2 ;
        while(c > 0){

            System.out.println("Welcome "+firstName+" "+lastName);
            System.out.println("-----------------------------------------------");
            System.out.println("Edit your Phone Number press  \"1\" ");
            System.out.println("Edit your E-Mail Adress press \"2\" ");
            System.out.println("Edit your maritalStatus press \"3\" ");
            System.out.println("---------");
            System.out.println("Send a Quick Request to the company press \"4\" ");
            System.out.println("---------");
            System.out.println("Info in Company press \"5\" ");
            System.out.println("---------");
            System.out.println("If you want to see your Gross salary and Net salary press \"6\" ");
            System.out.println("---------");
            System.out.println("Change password press \"7\"(leter and numbers )");
            System.out.println("-----------------------------------------------");
            System.out.print(" : ");
            int p = in.nextInt();
          
            if(p > 0 && p < 7){
                switch(p){
                    case 1 : 
                        ChangePhoneNumber();
                    break ;
                    
                    case 2 :
                        changeEmail();
                    break;   
                    
                    case 3 :
                        ChangeMaritalStatus();
                    break; 
                    
                    case 4 :
                        System.out.println("");
                        String s ;
                        setRequest(s = in.next());
                        System.out.println("Mr : "+firstName+" "+lastName);
                        System.out.println(getRequest());
                        System.out.println("To....[Car Show Room]");
                        System.out.println("");
                        System.out.println("{{ Requet has been Sent }}");
                    break;
                    
                    case 5 :
                        diaplay();
                    break;
                    
                    case 6 :
                        Salary();
                    break;
                    
                    case 7 :
                        changePassword();
                    break;
                }
                break ;
            }else{
                System.out.println("Enter a valid choice");
                p = in.nextInt();
            }
        }
    }

    public void ChangePhoneNumber(){
        Scanner in = new Scanner(System.in);
             System.out.println("Enter your new Phone Number : ");
                String phone = in.next();
                    int z = 2 ;
                    while(z > 0){
                        if(phone.length() == 10){
                            setPhoneNumber(phone);
                            System.out.println("Updated successfully");
                                break; 
                        }else{
                            System.out.println("Enter your new Phone Number : ");
                            phone = in.next();
                                z--;
                         }
                            }    
    }
    public void changeEmail(){
        Scanner in = new Scanner (System.in);
            System.out.println("Enter your new E-Mail Adress : ");
                 String mail = in.next();
                 setEmail(mail);
                 System.out.println("Updated successfully");
    }
    public void ChangeMaritalStatus(){
        Scanner in = new Scanner (System.in);
            System.out.println("Current Marital Status : "+maritalStatus);
            System.out.println("----------------------");
            System.out.println("Single press \"1\" ");
            System.out.println("Married press \"2\" ");
            System.out.println("Widowed press \"3\" ");
            System.out.println("Divorced press \"4\" ");
            System.out.println("Separated press \"5\" ");
            System.out.println("-----------------------");
            System.out.println("Chose a Status : ");
                  int m = in.nextShort();
                  switch(m){
                      case 1 :
                          setMaritalStatus("Single");
                          System.out.println("Marital Status : "+getMaritalStatus());
                          break;
                      case 2 : 
                          setMaritalStatus("Married");
                          System.out.println("Marital Status : "+getMaritalStatus());
                          break;
                      case 3 : 
                          setMaritalStatus("Widowed");
                          System.out.println("Marital Status : "+getMaritalStatus());
                          break;
                      case 4 :
                          setMaritalStatus("Divorced");
                          System.out.println("Marital Status : "+getMaritalStatus());
                          break;
                      case 5 :
                            setMaritalStatus("separated");
                          System.out.println("Marital Status : "+getMaritalStatus());
                          break;
                      default :
                          System.out.println("Invalid choice");
                  
                  }
                    
               
                      }
    public void changePassword(){
        Scanner in = new Scanner(System.in);
          String w , e ;
            System.out.println("Enter new Password : ");
                w = in.next();
            System.out.println("Confirm Password");   
                e = in.next();
                int i = 2 ;
                while(i > 0){
                if(w.equals(e)){
                     setPassword(w);
                     System.out.println("Your Password has been changed successfully");
                     break;
                }else{
                    System.out.println("Entered passwords are different. Please Try Again");         
                    System.out.println("Enter new Password : ");
                          w = in.next();
                   System.out.println("Confirm Password");   
                          e = in.next();
                    i-- ; 
                }
                }
    }

    public void diaplay(){
        System.out.println("Personal Informations");
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name  : "+lastName);
        System.out.println("Marital Status :"+maritalStatus);
        System.out.println("Birth Of Date : "+birthOfDate);
        System.out.println("Personal ID : "+id);
        System.out.println("Insurance Number : "+insuranceNumber);
        System.out.println("E-Mail : "+Email);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("--");
        System.out.println("Job Informations");
        System.out.println("Employee ID : "+employeeID);
        System.out.println("Job Titel : "+jobTitel);
        System.out.println("Working Hours : "+workingHours);
        System.out.println("Hourly Pay : "+hourlyPay+"$");
        System.out.println("------------------------------------------");
    }
    public void Salary(){
        System.out.println("working Hour : "+workingHours);
        System.out.println("Hourly Pay : "+hourlyPay+"$");
        System.out.println("------------------------");
        System.out.println("Your Gross Salary this mounth : "+(workingHours*hourlyPay)+"$");
        System.out.println("your Marital Status : "+maritalStatus);
        double n = workingHours * hourlyPay ; 
         double netSalary ;
        switch(maritalStatus){
            case "Single" : 
            case "separated" : 
            case "Divorced" : 
            case "Widowed" :
                System.out.println("Income Tax : 38%");
                System.out.println("Your Net Salary : "+(netSalary = n-(n*(38.0/100.0)))+"$");
                break;
            case "Married" :   
                netSalary = n-(n*(30/100));
                System.out.println("Income Tax : 30%");
                System.out.println("Your Net Salary : "+netSalary+"$");
                break;
        }  
    }
    public void ManageControl(){
        Scanner in = new Scanner(System.in);
     int c = 2 ;
        while(c > 0){
            
            System.out.println("-----------------------------------------------");
            System.out.println("Edit Phone Number press  \"1\" ");
            System.out.println("Edit E-Mail Adress press \"2\" ");
            System.out.println("Edit MaritalStatus press \"3\" ");
            System.out.println("---------");
            System.out.println("Edit Working Hour Press \"4\" ");
            System.out.println("---------");
            System.out.println("Edit Hourly Pay press \"5\" ");
            System.out.println("---------");
            System.out.println("Edit Jobtitel press \"6\" ");
            System.out.println("---------");
            System.out.println("Edit First Name press \"7\" ");
            System.out.println("---------");
            System.out.println("Edit Last Name press \"8\" ");
            System.out.println("---------");
            System.out.println("Edit Birth Of Date press \"9\" ");
            System.out.println("---------");
            System.out.println("Edit ID press \"10\" ");
            System.out.println("---------");
            System.out.println("Edit Insurance Number press \"11\" ");
            System.out.println("---------");
            System.out.println("Edit Employee ID press \"12\" ");
            System.out.println("---------");
            System.out.println("Edit Password press \"13\"(leter and numbers )");
            System.out.println("-----------------------------------------------");
            System.out.print(" : ");
            int p = in.nextInt();
          
            if(p > 0 && p < 14){
                switch(p){
                    case 1 : 
                        ChangePhoneNumber();
                    break ;
                    
                    case 2 :
                        changeEmail();
                    break;   
                    
                    case 3 :
                        ChangeMaritalStatus();
                    break; 
                    
                    case 4 :
                        System.out.println("Current : "+getWorkingHours());
                        System.out.println("Enter the new Working Hour : ");
                        float WorkingHour = in.nextFloat();
                        setWorkingHours(WorkingHour);
                        System.out.println("Working Hour : "+getWorkingHours());
                    break;
                    
                    case 5 :
                        System.out.println("Current : "+getHourlyPay());
                        System.out.println("Enter the new Hourly Pay : ");
                        float editHourlyPay = in.nextFloat();
                        setHourlyPay(editHourlyPay);
                        System.out.println("Hourly Pay : "+getHourlyPay());
                    break;
                    
                    case 6 : 
                        System.out.println("Current : "+getJobTitel());
                        System.out.println("Enter the new Job Title : ");
                        String JobTitel = in.next();
                        setJobTitel(JobTitel);
                        System.out.println("Job Titel : "+getJobTitel());
                    break; 
                    
                    case 7 : 
                        System.out.println("Current : "+getFirstName());
                        System.out.println("Enter the new First Name : ");
                        String FirstName = in.next();
                        setFirstName(FirstName);
                        System.out.println("First Name : ");
                    break;
                    
                    case 8 : 
                        System.out.println("Current : "+getLastName());
                        System.out.println("Enter the new Last name : ");
                        String LastName= in.next();
                        setLastName(LastName);
                        System.out.println("First Name : "+getLastName());
                    break;
                    case 9 : 
                        System.out.println("Current : "+getBirthOfDate());
                        System.out.println("Enter the new Birth of Date : ");
                        String BirthOfDate = in.next();
                        setBirthOfDate(BirthOfDate);
                        System.out.println("Birth Of Date : "+getBirthOfDate());
                    break;
                    
                    case 10 :
                        System.out.println("Current : "+getId());
                        System.out.println("Enter the new ID : ");
                        String ID = in.next();
                        setId(ID);
                        System.out.println("ID Number : "+getId());
                    break;
                    
                    case 11 : 
                        System.out.println("Current : "+getInsuranceNumber());
                        System.out.println("Enter the new Insurance : ");
                        String Insurance = in.next();
                        setInsuranceNumber(Insurance);
                        System.out.println("Insurance Number : ");
                    case 12 :
                        System.out.println("Current : "+getEmployeeID());
                        System.out.println("Enter the new Employee ID : ");
                        String EmployeeID = in.next();
                        setEmployeeID(EmployeeID);
                        System.out.println("Employee ID : "+getEmployeeID());
                    break;
                    
                    case 13 :
                        changePassword();
                    break;
                }
                break ;
            }else{
                System.out.println("Enter a valid choice");
                p = in.nextInt();
            }
        }    
    }    
}
