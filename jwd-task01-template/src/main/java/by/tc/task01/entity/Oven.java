package by.tc.task01.entity;

public class Oven extends Appliance{
	// you may add your own code here
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;
    
    public Oven() {
        this.powerConsumption = 0;
        this.weight = 0;
        this.capacity = 0;
        this.depth = 0;
        this.height = 0;
        this.width = 0;
        }
        
        public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        	this.powerConsumption = powerConsumption;
        	this.weight = weight;
        	this.capacity = capacity;
        	this.depth = depth;
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
        
        public int getCapacity() {
        	return capacity;
        	}
        
        public void setCapacity(int capacity) {
        	this.capacity = capacity;
        	}

        public double getDepth() {
        	return depth;
        	}

        public void setDepth(int depth) {
        	this.depth = depth;
        	}
        
        public double getHeight() {
        	return height;
        	}
        
        public void setHeight(double height) {
        	this.height = height;
        	}
        
        public double getWidth() {
        	return width;
        	}
        
        public void setWidth(double width) {
        	this.width = width;
        	}
        
        public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	
        	Oven that = (Oven) obj;
        	
        	if (powerConsumption != that.powerConsumption) return false;
        	if (height != that.height) return false;
        	if (width != that.width) return false;
        	if (weight != that.weight) return false;
        	if (Double.compare(that.depth, depth) != 0) return false;
        	return capacity == that.capacity;
        	}
        

        public int hashCode() {
        	int result = powerConsumption;
        	result = 19 * result + weight;
        	result = 19 * result + capacity;
        	result = 19 * result + depth;
        	result = 19 * result + (int)height;
        	result = 19 * result + (int)width;
        	return result;
        	}

        public String toString() {
        	return "Oven :" + "POWER_CONSUMPTION=" + powerConsumption + ", WEIGHT='" + 
        weight + '\'' + ", CAPACITY='" + capacity + '\'' + ", DEPTH='" + depth + '\'' + 
        ", HEIGHT=" + height + ", WIDTH=" + width + ";";
        	}
}
