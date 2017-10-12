package by.tc.task01.entity;

public class Refrigerator extends Appliance{
	// you may add your own code here
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;
    
    public Refrigerator() {
        this.powerConsumption = 0;
        this.weight = 0;
        this.freezerCapacity = 0;
        this.overallCapacity = 0;
        this.height = 0;
        this.width = 0;
        }
        
        public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, int height, int width) {
        	this.powerConsumption = powerConsumption;
        	this.weight = weight;
        	this.freezerCapacity = freezerCapacity;
        	this.overallCapacity = overallCapacity;
        	this.height = height;
        	this.width = width;
        	}

        public int getPowerConsumption() {
        	return powerConsumption;
        	}
        
        public void setPowerConsumption(int powerConsumption) {
        	this.powerConsumption = powerConsumption;
        	}
        
        public int getWeight() {
        	return weight;
        	}

        public void setWeight(int weight) {
        	this.weight = weight;
        	}
        
        public int getFreezerCapacity() {
        	return freezerCapacity;
        	}
        
        public void setFreezerCapacity(int freezerCapacity) {
        	this.freezerCapacity = freezerCapacity;
        	}

        public double getOverallCapacity() {
        	return overallCapacity;
        	}

        public void setOverallCapacity(double overallCapacity) {
        	this.overallCapacity = overallCapacity;
        	}
        
        public int getHeight() {
        	return height;
        	}
        
        public void setHeight(int height) {
        	this.height = height;
        	}
        
        public int getWidth() {
        	return width;
        	}
        
        public void setWidth(int width) {
        	this.width = width;
        	}
        
        public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	
        	Refrigerator that = (Refrigerator) obj;
        	
        	if (powerConsumption != that.powerConsumption) return false;
        	if (height != that.height) return false;
        	if (width != that.width) return false;
        	if (weight != that.weight) return false;
        	if (Double.compare(that.overallCapacity, overallCapacity) != 0) return false;
        	return freezerCapacity == that.freezerCapacity;
        	}
        

        public int hashCode() {
        	int result = powerConsumption;
        	result = 19 * result + weight;
        	result = 19 * result + freezerCapacity;
        	result = 19 * result + (int)overallCapacity;
        	result = 19 * result + height;
        	result = 19 * result + width;
        	return result;
        	}

        public String toString() {
        	return "Refrigerator :" + "POWER_CONSUMPTION=" + powerConsumption + ", WEIGHT='" + 
        weight + '\'' + ", FREEZER_CAPACITY='" + freezerCapacity + '\'' + ", OVERALL_CAPACITY='" + overallCapacity + '\'' + 
        ", HEIGHT=" + height + ", WIDTH=" + width + ";";
        	}
}
