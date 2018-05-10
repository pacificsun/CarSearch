package com.suraj.CarSearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

public class ShowResults {

	 public void render(Set<CarResult> cars) {
//	        for (CarResult car : cars) {
//	        	System.out.println (car);
//	           
//}
	        System.out.println("-----------------------");
            System.out.println("After sorting ");
            System.out.println("-----------------------");
            List<CarResult> list =new ArrayList<>(cars);
            

//            class SortByCost implements Comparator<CarResult> {
//                public int compare(CarResult a, CarResult b) {
//                    if ( a.getRentalCost() < b.getRentalCost() ) return -1;
//                    else if ( a.getRentalCost() == b.getRentalCost() ) return 0;
//                    else return 1;
//                }
//            }
            

            list.sort(new Comparator<CarResult>(){

				@Override
				public int compare(CarResult o1, CarResult o2) {
					 if ( o1.getRentalCost() < o2.getRentalCost() )
						 {return -1;
						 }
				        else if ( o1.getRentalCost() == o2.getRentalCost() ) {
				        	return 0;
				        }
				        else return 1;
					}
				
//					if( o1.getSupplierName().equalsIgnoreCase("AVIS")
//							 || o1.getSupplierName().equalsIgnoreCase("BUDGET")
//							 || o1.getSupplierName().equalsIgnoreCase("ENTERPRISE")
//							 || o1.getSupplierName().equalsIgnoreCase("FIREFLY")
//							 || o1.getSupplierName().equalsIgnoreCase("HERTZ")
//							 || o1.getSupplierName().equalsIgnoreCase("SIXT")
//							 || o1.getSupplierName().equalsIgnoreCase("THRIFTY")==  o2.getSupplierName().equalsIgnoreCase("AVIS")
//									 || o2.getSupplierName().equalsIgnoreCase("BUDGET")
//									 || o2.getSupplierName().equalsIgnoreCase("ENTERPRISE")
//									 || o2.getSupplierName().equalsIgnoreCase("FIREFLY")
//									 || o2.getSupplierName().equalsIgnoreCase("HERTZ")
//									 || o2.getSupplierName().equalsIgnoreCase("SIXT")
//									 || o2.getSupplierName().equalsIgnoreCase("THRIFTY")){
//						return 0;
////						
////						 
//						
//					} return o1.getSupplierName()!=o2.getSupplierName() ? -1:1;
////						return o1.;
					
					
										
				
	 
            	
            });
            for (CarResult carResult : list) {
				System.out.println("list : "+carResult);
			}
            System.out.println("corporate group");
            System.out.println("----------------------");
//          {
//        	  Map<String, List<CarResult>> map = new HashMap<String, List<CarResult>>();
//        	  
//for (CarResult carResult : list) {
//    String key  = carResult.getSupplierName();
//    if(map.containsKey(key)){
//        List<CarResult> list1 = map.get(key);
//        list1.add(carResult);
//        System.out.println("Corp "+list1);
//
////    }else{
////        List<CarResult> list1 = new ArrayList<CarResult>();
////        list1.add(carResult);
////       // map.put(key, list1);
////    }
////
////}
////            	
////          for (CarResult carResult : list) {
////        	  System.out.println(list);
////			
////		}  
//          }
//            	
//	 }
	       
	        
	 
          }
	 }


