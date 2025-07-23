package com.mycompany.carshowroom;


import java.util.Scanner;
import java.util.Arrays; 
public class CarShowRoom {
    public static Car []c = { 
          new Car("M.B.W,M5","New",2023,555," 280km/h ", 12 ,"2022/12/11","kj45C00FQ2","LN2023",30000),
          new Car("M.B.W,M4","Used",2020,200000,"260km/h ", 8 ,"2020/01/31","kj45g270P1","AY2961",15000),
          new Car("Mercedes Benz,G.wagen","New",2025,00000,"320km/h ", 12 ,"2025/01/31","Ln98g010P4","DL0000",500000),
          new Car("KIA,Sorento","Used",2016,50000,"240km/h ",6 ,"2015/05/31","AX00g324P9","LK0905",16000),
          new Car("SABA,P20","REFURBISHED",2015,70000,"180km/h ", 6 ,"2015/09/23","SE34M915P5","YX3279",10000)
          };
    
      static void printCarCompany(){
           int f = 1 ;
           for(int i = 0 ;i < c.length  ;i++){
               System.out.println(f+" : "+c[i].getCarCompany()+".");
               f++;
           }
           System.out.println("");
      }     
      static void PrintCarInfo(){
         for(int i = 0 ; i <c.length ;i++){
            c[i].Car_display();
          }   
          } 
      static void PrintCarInfo(int n){
          Scanner in = new Scanner(System.in);
            if(n < c.length){
                c[n].Car_display();
            }else{
                System.out.println("enter a valid choice");
            }
          }

      public static  BankCard Visa [] =  {
          new  BankCard("20251" , "lo11223344lo" , "lond khalaf" ,   "00023498564" , "2003/12/17" , "2025/1/9" , "2028/1/9" , "Lager" , 2200 , 10000),
          new  BankCard("20252" , "9288292ppwq1" , "shivan khalaf" , "00076379156" , "1999/9/17" , "2018/1/8" , "2026/1/9" , "Logistik" , 4500 , 900000),
          new  BankCard("20253" , "lm823728281l" , "ceger berho" ,   "00096378215" , "2000/4/10" , "2020/3/31" , "2026/1/9" , "Photographer" , 4350 , 60000),
          new  BankCard("20254" , "9olosdspspsw" , "Keem najari" ,   "00038910276" , "2000/6/3" , "2019/11/13" , "2027/1/9" , "Socialist" , 3200 , 17000),
          new  BankCard("20255" , "pspsps923993" , "Avend khalaf" ,  "00045697236" , "2000/7/1" , "2024/4/10" , "2026/1/9" ,  "General Practitioner" , 5500 , 35000),
          };
          
      static void CustomersService(){
          Scanner in = new Scanner(System.in);
               System.out.println("1. Here you can see all the cars available in the company.\n" +"2. From all world-famous brands and at great prices.\n" +"3. Just press any key to continue.");
               String press = in.next();
               printCarCompany();
               System.out.println("IF you want to See more information about any Car . Enter car number : ");
               int q = in.nextInt();
               PrintCarInfo(q);
               long price = c[q-1].carPrice ;
               System.out.println("If you want to buy this car click \"y\" And To exit press any Key .");
               char choice = in.next().charAt(0);
               if(choice == 'y'){
                        boolean loggin = false ; 
                            while(!loggin){
                                  System.out.println("Enter your Account Number : ");
                                     String x = in.next();
                                  System.out.println("Enter your Account password : ");
                                     String y = in.next();      
                        for(BankCard check : Visa){
                                  if(check.getAccountNumber().equals(x)&&check.getPassword().equals(y)){
                                      
                                      check.loggin();
                                      System.out.println("Please wait . . .");
                                      
                                      check.Transaction(price);
                                      loggin = true ; 
                                     break;
                                   }
                                   }
                                  if(!loggin){
                                    System.out.println("Enter a valid account number or valiv password");
                                   }     
                                  }
               }else
                   System.out.println("For more information visit our Company");

      }
    public static Employee employee[]={
          new Employee("20257180","321123lh22","Mechanic",160,30,"Maikel","Joy","1990/7/1","Married","00021487312","GF20902920U","Maikel22mc@gmail.com","015216759588"),
          new Employee("20257181","77gg11mnbv","Mechanic",160,20,"Andere","zxoka","1998/12/3","Singel","00023567059","GF30909291U","Andere32@gmail.com","015892292193"),
          new Employee("20257182","rr2321132n","Receptionist",160,22,"scharlotte","Alma","1995/4/13","Single","000293278292","GF872947283U","Mayaalma1@gmail.com","015289126479"),
          new Employee("20257183","lowe22usss","Website Administrator",160,30,"Kaka","Gabriel","1999/9/19","Single","00098392022","GF96371289U","Kakakaka21@gmail.com","015278692044"),
          new Employee("20257184","dr12167832","Driver",160,22,"Ahmed","khalil","2001/9/11","Divorced","00092388239","GF931245678U","ahmedkhalil01@gmail.com","015091392022"),
          new Employee("20257185","ppowdw2222","Manager",160,45,"Temophy","pazxa","1980/1/29","Separated","00056698741","GF098229923U","temo2209@gmail.com","015998445224"),
      };    
    static void DisplayAllInfo(){
        Scanner in = new Scanner(System.in);
            System.out.println("Welcome to the Update Section - here you can modify and manage all information");
            System.out.println("Press any key to continue and view the company employees.");
            String press = in.next();
            
        for(int i = 0 ;i < employee.length ;i++){
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
            System.out.println("[The Employee "+(i+1)+"] :");
            employee[i].diaplay();
        }
        System.out.println("If want to show all cars information press\"1\" to continue press any key : ");
        String Cars = in.next().toLowerCase();
        if(Cars.equals("1")){
                for(int i = 0 ;i < c.length ;i++){
                    System.out.println("------------------------------------------");
                    System.out.println("------------------------------------------");
                    System.out.println("[Car "+(i+1)+"] :");
                    c[i].Car_display();
        }
        }
        System.out.println("To Edit employee and Cars information press \"yes\" ");
        System.out.println("To remove any employee enter \"delete employee\"\nTo remove any car enter \"delete car\" .");
        String choice = in.next().toLowerCase();
        if(choice.equals("yes")||choice.equals("delete employee")||choice.equals("delete car")){
        switch(choice){
            case "yes" :
                System.out.println("Edit Cars infomation enter \"car\" ");
                System.out.println("Edit Employee infomation enter \"employee\" ");
                String inputChoice = in.next().toLowerCase();
                if(inputChoice.equals("employee")||inputChoice.equals("car")){
                     switch(inputChoice){
                         case "employee" :
                                System.out.println("Enter the Employee number you want to modify :");
                                int Press = in.nextInt();
                                employee[Press-1].ManageControl();
                            break;
                            
                         case "car":
                                System.out.println("Enter the Car number you want to modify :");
                                int inputPress = in.nextInt();
                                 c[inputPress-1].carManage();
                            break;    
                     }break;
                }else{
                    System.out.println("Invalid Choice");  
                }

            break;
            
            case "delete employee" :
                System.out.println("Enter the employee number you want to remove it :");
                int index = in.nextInt();
                System.out.println("");
                employee[index-1].diaplay();
                System.out.println("");
                employee[index-1] = null ;
                System.out.println("Employee deleted Successfully");
                break;
            case "delete car" :  
                System.out.println("Enter the car number you want to remove it :");
                int Index = in.nextInt();
                System.out.println("");
                c[Index-1].Car_display();
                System.out.println("");
                c[Index-1] = null ;
                System.out.println("car deleted Successfully");
                break;
            default :
                System.out.println("Enter a valid choice");
        }     
          
        }else{
            System.out.println("Enter a valid choice");
            choice = in.next();
   }
    }
    public static void EmployeeService(){
        Scanner in = new Scanner (System.in);
        boolean found = false ;
        while(!found){
        System.out.println("Employee ID : ");
        String ID = in.next();
        System.out.println("Password : ");
        String Password = in.next();
            for(Employee emp :employee){
                if(emp.getEmployeeID().equals(ID) && emp.getPassword().equals(Password)){
                    emp.login();
                    found = true ; 
                    break ;
                }
            }
                if(!found){
                    System.out.println("Enter a valid ID or valid Password and try again");
                }
        }       
}
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
         Car c = new Car(){};  
         String Password = "yxcv!§$%/mmn2?123987";  
         char []correctPass = Password.toCharArray();
         
        System.out.println("Welcome To Car Show Room");
        System.out.println("How Can We Help You");
        System.out.println("Customers Service click \"1\" ");
        System.out.println("If you want to List your Car click \"2\" ");
        System.out.println("Employee Service click \"3\" ");
        int input = 0 ;
        while(input < 2 ){
        String choice = in.next();
         char inputPass[] =choice.toCharArray();
        if(choice.equals("1")||choice.equals("2")||choice.equals("3")){
        switch(choice){
           case "1":
               CustomersService();
               break; 
           case "2" : 
               c.showYourCar();
               break;
           case "3" : 
               EmployeeService();
               break;
               }
        }else if(Arrays.equals(inputPass, correctPass)){
               DisplayAllInfo();
        }     
        else
            System.out.println("Enter a valid choice");
        }
        System.out.println("Welcome To Car Show Room");
        System.out.println("How Can We Help You");
        System.out.println("Customers Service click \"1\" ");
        System.out.println("If you want to List your Car click \"2\" ");
        System.out.println("Employee Service click \"3\" ");
       }
}  