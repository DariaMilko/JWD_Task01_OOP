package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.Map;
import java.util.Set;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		// you may add your own code here
		String type = criteria.getApplianceType();
 		boolean syntacticСorrectness;
 		if(type.equals("Laptop")){
 			syntacticСorrectness=ovenValidator(criteria.getCriteria());
 		}
 		else{
 			if(type.equals("Oven")){
 				syntacticСorrectness=laptopValidator((criteria.getCriteria()));
 			}
 			else{
 				if(type.equals("Refrigerator")){
 					syntacticСorrectness=refrigeratorValidator((criteria.getCriteria()));
 				}
 				else{
 					if(type.equals("Speakers")){
 						syntacticСorrectness=vacuumCleanerValidator((criteria.getCriteria()));
 					}
 					else{
 						if(type.equals("TabletPC")){
 							syntacticСorrectness=tabletPCValidator((criteria.getCriteria()));
 						}
 						else {
 							if (type.equals("VacuumCleaner")) {
 								syntacticСorrectness=speakersValidator((criteria.getCriteria()));
 							}
 							else{
 								syntacticСorrectness=false;
 							}
 						}
 					}
 				}
 			}
 		}
 		return syntacticСorrectness;
 	}

	
	
 	public static <E> boolean ovenValidator(Map<E, Object> criteria){
 		boolean coincidenceOfMeaning=true;
 		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
 		for (Map.Entry<E, Object> userCriteria : setCriteria) {
 			if (userCriteria.getKey().equals(Oven.POWER_CONSUMPTION) || userCriteria.getKey().equals(Oven.WEIGHT)
 					|| userCriteria.getKey().equals(Oven.CAPACITY) || userCriteria.getKey().equals(Oven.DEPTH)
 					|| userCriteria.getKey().equals(Oven.HEIGHT) || userCriteria.getKey().equals(Oven.WIDTH)){
 				if(!(userCriteria.getValue() instanceof Number)){
 					coincidenceOfMeaning = false;
 					break;
 					}
 				} 
 			}
 		if(coincidenceOfMeaning){
 			return true;
 			}	else {
 				System.out.println("Null");
 				return false;
	 		}
 	}

 	
 	public static <E> boolean laptopValidator(Map<E, Object> criteria){
 		boolean coincidenceOfMeaning=true;
 		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
 		for (Map.Entry<E, Object> userCriteria : setCriteria) {
 			if (userCriteria.getKey().equals(Laptop.BATTERY_CAPACITY) || userCriteria.getKey().equals(Laptop.MEMORY_ROM)
 					|| userCriteria.getKey().equals(Laptop.CPU) || userCriteria.getKey().equals(Laptop.DISPLAY_INCHS)
 					|| userCriteria.getKey().equals(Laptop.SYSTEM_MEMORY)){
 				if(!(userCriteria.getValue() instanceof Number)){
 					coincidenceOfMeaning = false;
 					break;
 				}
 			}
 			else {
 				if (userCriteria.getKey().equals(Laptop.OS)){
 					if(!(userCriteria.getValue() instanceof String)){
 						coincidenceOfMeaning = false;
 						break;
 						}
 					}
 				}
 			}
 		if(coincidenceOfMeaning){
 			return true;
 			}	else {
 			System.out.println("Null");
 			return false;
 		}
 		
 	}
 		
 
 	public static <E> boolean refrigeratorValidator(Map<E, Object> criteria){
 		boolean coincidenceOfMeaning=true;
 		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
 		for (Map.Entry<E, Object> userCriteria : setCriteria) {
 			if (userCriteria.getKey().equals(Refrigerator.POWER_CONSUMPTION) || userCriteria.getKey().equals(Refrigerator.WEIGHT)
 					|| userCriteria.getKey().equals(Refrigerator.FREEZER_CAPACITY) || userCriteria.getKey().equals(Refrigerator.OVERALL_CAPACITY)
 					|| userCriteria.getKey().equals(Refrigerator.HEIGHT) || userCriteria.getKey().equals(Refrigerator.WIDTH)){
 				if(!(userCriteria.getValue() instanceof Number)){
 					coincidenceOfMeaning = false;
 					break;
 					}
 				}
 			}
 		if(coincidenceOfMeaning){
 			return true;
 			}	else {
 				System.out.println("Null");
 				return false;
 				}
 		}
 	
 	
 	public static <E> boolean vacuumCleanerValidator(Map<E, Object> criteria){
 		boolean coincidenceOfMeaning=true;
 		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
 		for (Map.Entry<E, Object> userCriteria : setCriteria) {
 			if (userCriteria.getKey().equals(VacuumCleaner.POWER_CONSUMPTION) || userCriteria.getKey().equals(VacuumCleaner.MOTOR_SPEED_REGULATION)
 					|| userCriteria.getKey().equals(VacuumCleaner.CLEANING_WIDTH)){
 				if(!(userCriteria.getValue() instanceof Number)){
 					coincidenceOfMeaning = false;
 					break;
 				}
 			}
 			else {
 				if (userCriteria.getKey().equals(VacuumCleaner.FILTER_TYPE) || userCriteria.getKey().equals(VacuumCleaner.BAG_TYPE)
 						|| userCriteria.getKey().equals(VacuumCleaner.WAND_TYPE)){
 					if(!(userCriteria.getValue() instanceof String)){
 						coincidenceOfMeaning = false;
 						break;
 					}
 				}
 			}
 		}
 		if(coincidenceOfMeaning){
 			return true;
 			}	else {
 				System.out.println("Null");
 				return false;
 				}
 		}
 	
 	
 	public static <E> boolean tabletPCValidator(Map<E, Object> criteria){
 		boolean coincidenceOfMeaning=true;
 		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
 		for (Map.Entry<E, Object> userCriteria : setCriteria) {
 			if (userCriteria.getKey().equals(TabletPC.BATTERY_CAPACITY) || userCriteria.getKey().equals(TabletPC.DISPLAY_INCHES)
 					|| userCriteria.getKey().equals(TabletPC.MEMORY_ROM) || userCriteria.getKey().equals(TabletPC.FLASH_MEMORY_CAPACITY)){
 				if(!(userCriteria.getValue() instanceof Number)){
 					coincidenceOfMeaning = false;
 					break;
 				}
 			}	else {
 					if (userCriteria.getKey().equals(TabletPC.COLOR)) {
 						if (!(userCriteria.getValue() instanceof String)) {
 							coincidenceOfMeaning = false;
 							break;
 						}
 					}
 				}
 		}
 		if(coincidenceOfMeaning){
 			return true;
 			}	else {
 				System.out.println("Null");
 				return false;
 				}
 	}
 	
 	
 	public static <E> boolean speakersValidator(Map<E, Object> criteria){
 		boolean coincidenceOfMeaning=true;
 		Set<Map.Entry<E, Object>> setCriteria = criteria.entrySet();
 		for (Map.Entry<E, Object> userCriteria : setCriteria) {
 			if (userCriteria.getKey().equals(Speakers.POWER_CONSUMPTION) || userCriteria.getKey().equals(Speakers.NUMBER_OF_SPEAKERS)
 					|| userCriteria.getKey().equals(Speakers.FREQUENCY_RANGE) || userCriteria.getKey().equals(Speakers.CORD_LENGTH)){
 				if(!(userCriteria.getValue() instanceof Number)){
 					coincidenceOfMeaning = false;
 					break;
 				}
 			}
 		}
 		if(coincidenceOfMeaning){
	 			return true;
	 			}	else {
	 				System.out.println("Null");
	 				return false;
	 				}
 	}
}

//you may add your own new classes