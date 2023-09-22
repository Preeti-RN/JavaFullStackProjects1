package com.gentech.parameterizedconstructor;
/*
Two wheeler type:scooter
Engine capacity:150
Does it have storage space:yes
Fuel type:petrol
++++++++++++++++++
Four wheeler type:bulero
Seating capacity:6
Is this an SUV:yes
Fuel type:diesel
+++++++++++++++++++++++
Heavy vehicle type:truck
Maximum Payload: 5.6tons
Fuel type:petrol
Number of axels:2

 */
class TwoWheelers
{
	
    TwoWheelers(String type,int engineCapacity,String hasStorage,String fuelType)
    {
    	
		System.out.println("Two wheeler type:"+type);
		System.out.println("Engine capacity:"+engineCapacity);
		System.out.println("Does it have storage space:"+hasStorage);
		System.out.println("Fuel type:"+fuelType);
		System.out.println("++++++++++++++++++");
    }
}
class FourWheeler {
	
    
     FourWheeler(String type,
     int seatingCapacity,
     String isSUV,
     String fuelType)
     {
    	 
 		System.out.println("Four wheeler type:"+type);
 		System.out.println("Seating capacity:"+seatingCapacity);
 		System.out.println("Is this an SUV:"+isSUV);
 		System.out.println("Fuel type:"+fuelType);
 		System.out.println("+++++++++++++++++++++++");
     }
}
class HeavyVehicle {
	
    HeavyVehicle(String type,
    double maxPayload,
    String fuelType,
    int numAxles)
    {
    	
		System.out.println("Heavy vehicle type:"+type);
		System.out.println("Maximum Payload: "+maxPayload+"tons");
		System.out.println("Fuel type:"+fuelType);
		System.out.println("Number of axels:"+numAxles);
    }
}
public class Vehiclesss {

	public static void main(String[] args) {
		
        TwoWheelers tw = new TwoWheelers("scooter",150,"yes","petrol");
        
		FourWheeler fw = new FourWheeler("bulero",6,"yes","diesel");
		
		HeavyVehicle hv =new HeavyVehicle("truck",5.6,"petrol",2);
		
	}
}


