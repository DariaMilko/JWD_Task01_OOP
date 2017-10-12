package by.tc.task01.dao.creator;
 
 import by.tc.task01.entity.Appliance;
 import by.tc.task01.entity.Oven;
 
 public class OvenCreator implements Command{
 
     public Appliance create(String paramsString) {
 
         String params[] = paramsString.split("[:;\\s,=]");
 
         int powerConsumption = Integer.parseInt(params[2]);
         int weight = Integer.parseInt(params[4]);
         int capacity = Integer.parseInt(params[6]);
         int depth = Integer.parseInt(params[8]);
         double height  = Double.parseDouble(params[10]);
         double width = Double.parseDouble(params[12]);
 
         return new Oven(powerConsumption, weight,capacity, depth, height, width);
     }
 }