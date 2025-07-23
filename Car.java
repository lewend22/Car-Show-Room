
package com.mycompany.carshowroom;

import java.util.Scanner;


public class Car{
     protected String carCompany ;
     protected String carCondition ; 
     protected int carModel ; 
     protected double Odometer ; 
     protected String maxSpeed ; 
     protected int cylinder ;
     protected String dateOfManufacture ; 
     protected String vinNumber ;
     protected String plateNumber ;
     public long carPrice ;
     

      public Car() {}
      
     public Car(String carCompany, String carCondition, int carModel, double Odometer, String maxSpeed, int cylinder, String dateOfManufacture, String vinNumber, String plateNumber, long carPrice) {
        this.carCompany = carCompany;
        this.carCondition = carCondition;
        this.carModel = carModel;
        this.Odometer = Odometer;
        this.maxSpeed = maxSpeed;
        this.cylinder = cylinder;
        this.dateOfManufacture = dateOfManufacture;
        this.vinNumber = vinNumber;
        this.plateNumber = plateNumber;
        this.carPrice = carPrice;
        }

    public String getCarCondition() {
        return carCondition;
    }

    public void setCarCondition(String carCondition) {
        this.carCondition = carCondition;
    }

    public int getCarModel() {
        return carModel;
    }

    public void setCarModel(int carModel) {
        this.carModel = carModel;
    }

    public double getOdometer() {
        return Odometer;
    }

    public void setOdometer(double Odometer) {
        this.Odometer = Odometer;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(long carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }
    
    public long getCarPreis() {
        return carPrice;
    }

    public void setCarPreis(long carPrice) {
        this.carPrice = carPrice;
    }
        
    public void OurCars(Car c[]){
            for(int i = 0 ;i >c.length;i++){
            System.out.println("Car Company : "+carCompany+(i+1));
            }
        }
          
        public void Car_display(){
            System.out.println("------------------------------------------------");
            System.out.println("Car Company : ["+carCompany+"]");
            System.out.println("Car Condition : ["+carCondition+"]");
            System.out.println("Car Model : ["+carModel+"]");
            System.out.println("Odometer : ["+Odometer+"Km"+"]");
            System.out.println("Max Speed : ["+maxSpeed+"k/h"+"]");
            System.out.println("Cylinder : ["+cylinder+"]");
            System.out.println("Date Of Manufacture : ["+dateOfManufacture+"]");
            System.out.println("Vin Number : ["+vinNumber+"]");
            System.out.println("Plate Number : ["+plateNumber+"]");
            System.out.println("Preis of the Car : ["+carPrice+"$"+"]");
            System.out.println("------------------------------------------------");
       }

        public void showYourCar() {
            Scanner in = new Scanner(System.in);
            System.out.println("To sell your car, we will ask you to fillout some information\nIt will only a few miutes of your time.\n");
            System.out.println("Car Company : ");
            this.carCompany = in.next();
            int count = 2 ;
            while(count > 0){
            System.out.println("Car Condition : \"NEW\" \"USED\" \"REFURBISHED\" ");
            this.carCondition = in.next();
            if(carCondition.equalsIgnoreCase("NEW") || carCondition.equalsIgnoreCase("USED") || carCondition.equalsIgnoreCase("REFURBISHED")){
            System.out.println("CHECK IT.........ACCEPTED.");
                break;
            }else{
            System.out.println("Please Enter a valid condition.");  
            } 
            }
            
            while(count > 0){
            System.out.println("Car Model : ");
            this.carModel = in.nextInt();
            if(carModel >= 2015 && carModel <= 2025){
                System.out.println("CHECK IT.........ACCEPTED.");
                break ;
            }else if(carModel > 2025) {
                System.out.println("please enter a valid model");
              
            }else if(carModel >1950 && carModel < 2015){
                System.out.println("Sorry we Don't accept this model .");    
                System.exit(0);
            }
            }
            
            while(count > 0){
            System.out.println("Odometer : ");
            this.Odometer = in.nextDouble();
            if(Odometer > 400000){
                System.out.println("Sorry we don't accept that ");
                System.exit(0);
            }else if(Odometer < 0){
                System.out.println("Please enter a valid Odometer");
            }else{
                System.out.println("CHECK IT.........ACCEPTED.");
                break ;
            }
            }
            
            System.out.println("Max Speed : ");
            this.maxSpeed = in.next();
         
            while(count > 0){
            System.out.println("Cylinder : ");
            this.cylinder = in.nextInt() ;
            if(cylinder >= 4 && cylinder <= 12){
                System.out.println("CHECK IT.........ACCEPTED.");
                break ;
            }else if(cylinder > 0 && cylinder < 4){
                System.out.println("Sorry we don't accept that.");
                System.exit(0);
            }else
                System.out.println("Please enter a valid cylinder");
            }
            
            System.out.println("Date Of Manufacture : ");
            this.dateOfManufacture = in.next();
         
            while(count > 0){
            System.out.println("Vin Number : ");
            this.vinNumber = in.next() ;
            if(vinNumber.length() == 10){
                System.out.println("CHECK IT.........ACCEPTED.");
                break;
            }else{
                System.out.println("Please enter a valid VIN Number.");
            }
            }
            
            while(count > 0 ){
            System.out.println("Plate Number : ");
            this.plateNumber = in.next() ;
            if(plateNumber.length()== 6){
                System.out.println("CHECK IT.........ACCEPTED.");
                break;
            }else 
                System.out.println("Please enter a valid Plate Number");
            }
            
            System.out.println("Preis of the Car : ");
            this.carPrice = in.nextLong();
            
            System.out.println("Are you sure you want to list your car for sale y or press any key if you want to Cancel it : ");
            char c ;
            c =in.next().charAt(0);
            switch(c){
                case 'y' :   
                    Car_display();
                    break;
                default :
                    System.out.println("Good bye");
            }       
            
            } 
 //String carCompany, String carCondition, int carModel, double Odometer, 
//String maxSpeed, int cylinder, String dateOfManufacture, String vinNumber, String plateNumber, long carPrice
    public void carManage(){    
    Scanner in = new Scanner(System.in);
        int choice = 2 ;
        while(choice > 0){
            
            System.out.println("-----------------------------------------------");
            System.out.println("Edit Car company press  \"1\" ");
            System.out.println("---------");
            System.out.println("Edit Car Condition press \"2\" ");
            System.out.println("---------");
            System.out.println("Edit Car Model press \"3\" ");
            System.out.println("---------");
            System.out.println("Edit Car Odometer Press \"4\" ");
            System.out.println("---------");
            System.out.println("Edit Car Max Speed press \"5\" ");
            System.out.println("---------");
            System.out.println("Edit Car Cylinder press \"6\" ");
            System.out.println("---------");
            System.out.println("Edit Date of Manufacture press \"7\" ");
            System.out.println("---------");
            System.out.println("Edit Car Vin Number press \"8\" ");
            System.out.println("---------");
            System.out.println("Edit Car Plate Number press \"9\" ");
            System.out.println("---------");
            System.out.println("Edit Car Price press \"10\" ");
            System.out.println("-----------------------------------------------");
            System.out.print(" : ");
            int p = in.nextInt();
          
            if(p > 0 && p < 11){
                switch(p){
                    case 1 : 
                        System.out.println("Current : "+getCarCompany());
                        System.out.println("Enter the new Car company : ");
                        String CarCompany = in.next();
                        setCarCompany(CarCompany);
                        System.out.println("Car Company : "+getCarCompany());
                    break ;
                    
                    case 2 :
                        System.out.println("Current : "+getCarCondition());
                        System.out.println("Enter the new Car Condition : ");
                        String CarCondition = in.next();
                        setCarCondition(CarCondition);
                        System.out.println("Car Condition : "+getCarCondition());
                    break;   
                    
                    case 3 :
                        System.out.println("Current : "+getCarModel());
                        System.out.println("Enter the new Car Model : ");
                        int CarModel = in.nextInt();
                        setCarModel(CarModel);
                        System.out.println("Car Model : "+getCarModel());
                        
                    break; 
                    
                    case 4 :
                        System.out.println("Current : "+getOdometer()+"Km");
                        System.out.println("Enter the new Odometer : ");
                        double Odometer = in.nextDouble();
                        setOdometer(Odometer);
                        System.out.println("Odometer : "+getOdometer()+"Km");
                    break;
                    
                    case 5 :
                        System.out.println("Current : "+getMaxSpeed()+"Km/h");
                        System.out.println("Enter the new Max Speed : ");
                        String MaxSpeed = in.next();
                        setMaxSpeed(MaxSpeed);
                        System.out.println("Max Speed : "+getMaxSpeed()+"Km/h");
                    break;
                    
                    case 6 : 
                        System.out.println("Current : "+getCylinder());
                        System.out.println("Enter the new Cylinder  : ");
                        int Cylinder = in.nextInt();
                        setCylinder(cylinder);
                        System.out.println("Cylinder : "+getCylinder());
                    break; 
                    
                    case 7 : 
                        System.out.println("Current : "+getDateOfManufacture());
                        System.out.println("Enter the new Date of Manufacture : ");
                        String DateOfManufacture = in.next();
                        setDateOfManufacture(DateOfManufacture);
                        System.out.println("Date Of Manufacture : "+getDateOfManufacture());
                    break;
                    
                    case 8 : 
                        System.out.println("Current : "+getVinNumber());
                        System.out.println("Enter the new Vin Number : ");
                        String VinNumber = in.next();
                        setVinNumber(VinNumber);
                        System.out.println("Vin Number : "+getVinNumber());
                    break;
                    case 9 : 
                        System.out.println("Current : "+getPlateNumber());
                        System.out.println("Enter the new Plate Number : ");
                        String PlateNumber = in.next();
                        setPlateNumber(PlateNumber);
                        System.out.println("Plate Number : "+getPlateNumber());
                    break;
                    
                    case 10 :
                        System.out.println("Current : "+getCarPrice());
                        System.out.println("Enter the new Car Price : ");
                        long CarPrice = in.nextLong();
                        setCarPrice(CarPrice);
                        System.out.println("Car Price : "+getCarPrice());
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

  
 