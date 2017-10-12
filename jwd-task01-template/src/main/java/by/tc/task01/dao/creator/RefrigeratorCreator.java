package by.tc.task01.dao.creator;
 
 import by.tc.task01.entity.Appliance;
 import by.tc.task01.entity.Refrigerator;
 
 public class RefrigeratorCreator implements Command {
 
     public Appliance create(String paramsString) {
 
         String params[] = paramsString.split("[:;\\s,=]");
 
         int powerConsumption = Integer.parseInt(params[2]);
         int weight = Integer.parseInt(params[4]);
         int freezerCapacity = Integer.parseInt(params[6]);
         double overallCapacity = Double.parseDouble(params[8]);
         int height = Integer.parseInt(params[10]);
         int width = Integer.parseInt(params[12]);
 
         return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
     }
 }