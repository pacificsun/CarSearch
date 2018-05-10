package com.suraj.CarSearch;

public class CarResult {
	
    private final String supplierName;
    private final String description;
    private final String sippCode;
    private final double rentalCost;
    private final FuelPolicy fuelPolicy;
    
        public enum FuelPolicy {
        	FULLFULL,
        	FULLEMPTY
        };
        
     public CarResult(String supplierName,String description,  String sippCode, double d, FuelPolicy fuelPolicy  ){
    	 this.description=description;
    	 this.supplierName= supplierName;
    	 this.sippCode=sippCode;
    	 this.rentalCost= d;
    	 this.fuelPolicy= fuelPolicy;
     }
     
     public String getSupplierName() {
         return this.supplierName;
     }
     
     public String getDescription() {
         return this.description;
     }

     public String getSippCode() {
         return this.sippCode;
     }

     public double getRentalCost() {
         return this.rentalCost;
     }

     public FuelPolicy getFuelPolicy() {
         return this.fuelPolicy;
     }
     
     public String toString() {
         return this.supplierName + " : " +
             this.description + " : " +
             this.sippCode + " : " +
             this.rentalCost + " : " +
             this.fuelPolicy;
     }
     
     

}
