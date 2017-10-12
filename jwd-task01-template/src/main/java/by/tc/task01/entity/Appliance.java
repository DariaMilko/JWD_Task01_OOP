package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Appliance {
	// you may add your own code here
	 public Appliance() {}
	  public static Appliance buildAppliance(String initString){
		 Appliance appliance = null;
		 if(initString.contains("Laptop")){
			 double batteryCapacity = Double.parseDouble(Appliance.findValue(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(),initString));
			 String OS = Appliance.findValue(SearchCriteria.Laptop.OS.toString(),initString);
			 int memoryRom = Integer.parseInt(findValue(SearchCriteria.Laptop.MEMORY_ROM.toString(), initString));
			 int systemMemory = Integer.parseInt(findValue(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), initString));
			 double cpu = Double.parseDouble(Appliance.findValue(SearchCriteria.Laptop.CPU.toString(),initString));
			 int displayInchs = Integer.parseInt(Appliance.findValue(SearchCriteria.Laptop.DISPLAY_INCHS.toString(),initString));
			 appliance = new Laptop(batteryCapacity,OS,memoryRom,systemMemory,cpu,displayInchs);
			 }
		 if(initString.contains("Oven")){
			 int powerCunsumption = Integer.parseInt(findValue(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), initString));
			 int weight = Integer.parseInt(Appliance.findValue(SearchCriteria.Oven.WEIGHT.toString(),initString));
			 int capacity = Integer.parseInt(Appliance.findValue(SearchCriteria.Oven.CAPACITY.toString(),initString));
			 int depth = Integer.parseInt(Appliance.findValue(SearchCriteria.Oven.DEPTH.toString(),initString));
			 double height = Double.parseDouble(Appliance.findValue(SearchCriteria.Oven.HEIGHT.toString(),initString));
			 double width = Double.parseDouble(Appliance.findValue(SearchCriteria.Oven.WIDTH.toString(),initString));
			 appliance = new Oven(powerCunsumption,weight,capacity,depth,height,width);
			 }
		 if(initString.contains("Refrigerator")){
			 int powerConsumption = Integer.parseInt(Appliance.findValue(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(),initString));
			 int weight = Integer.parseInt(Appliance.findValue(SearchCriteria.Refrigerator.WEIGHT.toString(),initString));
			 int freezerCapacity = Integer.parseInt(Appliance.findValue(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(),initString));
			 double overallCapacity = Double.parseDouble(Appliance.findValue(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(),initString));
			 int height = Integer.parseInt(Appliance.findValue(SearchCriteria.Refrigerator.HEIGHT.toString(),initString));
			 int width = Integer.parseInt(Appliance.findValue(SearchCriteria.Refrigerator.WIDTH.toString(),initString));
			 appliance = new Refrigerator(powerConsumption,weight,freezerCapacity,overallCapacity,height,width);
			 }
		 if(initString.contains("Speakers")){
			 int powerConsumption = Integer.parseInt(findValue(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), initString));
	         int numberOfSpeakers = Integer.parseInt(findValue(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), initString));
	         String frequencyRange = Appliance.findValue(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(),initString);
	         int cordLength = Integer.parseInt(Appliance.findValue(SearchCriteria.Speakers.CORD_LENGTH.toString(),initString));
	         appliance = new Speakers(powerConsumption,numberOfSpeakers,frequencyRange,cordLength);
	         }
		 if(initString.contains("TabletPC")){
			 int batteryCapacity = Integer.parseInt(Appliance.findValue(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(),initString));
			 int displayInches = Integer.parseInt(Appliance.findValue(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(),initString));
			 int memoryROM = Integer.parseInt(findValue(SearchCriteria.TabletPC.MEMORY_ROM.toString(), initString));
			 int flashMemoryCapacity = Integer.parseInt(Appliance.findValue(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(),initString));
			 String color = Appliance.findValue(SearchCriteria.TabletPC.COLOR.toString(),initString);
			 appliance = new TabletPC(batteryCapacity,displayInches,memoryROM,flashMemoryCapacity,color);
			 }
		 if(initString.contains("VacuumCleaner")){
			 int powerConsumption = Integer.parseInt(findValue(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), initString));
			 String filterType = Appliance.findValue(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(),initString);
			 String bagType = Appliance.findValue(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(),initString);
			 String wandType = Appliance.findValue(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(),initString);
			 int motorSpeedRegulation = Integer.parseInt(findValue(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), initString));
			 int cleaningWidth = Integer.parseInt(Appliance.findValue(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(),initString));
			 appliance = new VacuumCleaner(powerConsumption,filterType,bagType,wandType,motorSpeedRegulation,cleaningWidth);
			 }
		 return appliance;
		 }
	 
	 public static String findValue(String criteriaType, String stringToFind){
		 int i = stringToFind.indexOf(criteriaType);
		 i += criteriaType.length() + 1;
		 int substringIndex = i;
		 char signTemp = ' ';
		 while (substringIndex < stringToFind.length()){
			 signTemp = stringToFind.charAt(substringIndex);
			 if((signTemp == ',') || (signTemp == ';') || (signTemp == ' ')){
				 break;
				 }
			 substringIndex++;
			 }
		 return stringToFind.substring(i,substringIndex);
		 }
}
