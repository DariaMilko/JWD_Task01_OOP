package by.tc.task01.dao.creator;
 
 import by.tc.task01.entity.Appliance;
 import by.tc.task01.entity.VacuumCleaner;
 
 
 public class VacuumCleanerCreator implements Command {
 
     public Appliance create(String paramsString) {
 
         String params[] = paramsString.split("[:;\\s,=]");
         int powerConsumption = Integer.parseInt(params[2]);
         String filterType = params[4];
         String bagType = params[6];
         String wandType = params[8];
         int motorSpeedRegulation = Integer.parseInt(params[10]);
         int cleaningWidth = Integer.parseInt(params[12]);
 
         return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
     }
 }