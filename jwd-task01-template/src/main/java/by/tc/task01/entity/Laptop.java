package by.tc.task01.entity;

public class Laptop extends Appliance{
	// you may add your own code here
    private double batteryCapacity;
    private String os;
    private int memoryROM;
    private int systemMemory;
    private double cpu;
    private int displayInches;
    
    public Laptop() {
        this.batteryCapacity = 0;
        this.os = "";
        this.memoryROM = 0;
        this.systemMemory = 0;
        this.cpu = 0;
        this.displayInches = 0;
        }
        
        public Laptop(double batteryCapacity, String os, int memoryROM, int systemMemory, double cpu, int displayInches) {
        	this.batteryCapacity = batteryCapacity;
            this.os = os;
            this.memoryROM = memoryROM;
            this.systemMemory = systemMemory;
            this.cpu = cpu;
            this.displayInches = displayInches;
        	}

        public double getBatteryCapacity() {
        	return batteryCapacity;
        	}
        
        public void setBatteryCapacity(double batteryCapacity) {
        	this.batteryCapacity = batteryCapacity;
        	}
        
        public String getOs() {
        	return os;
        	}

        public void setOs(String os) {
        	this.os = os;
        	}        
        
        public int getMemoryROM() {
        	return memoryROM;
        	}
        
        public void setMemoryROM(int memoryROM) {
        	this.memoryROM = memoryROM;
        	}
        
        public int getSystemMemory() {
        	return systemMemory;
        	}
        
        public void setSystemMemory(int systemMemory) {
        	this.systemMemory = systemMemory;
        	}
        
        public double getCpu() {
        	return cpu;
        	}
        
        public void setCpu(double cpu) {
        	this.cpu = cpu;
        	}
        
        public int getDisplayInches() {
        	return displayInches;
        	}

        public void setDisplayInches(int displayInches) {
        	this.displayInches = displayInches;
        	}
        
        
        public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	
        	Laptop that = (Laptop) obj;
        	
        	if (Double.compare(that.batteryCapacity, batteryCapacity) != 0) return false;
        	if (memoryROM != that.memoryROM) return false;
        	if (systemMemory != that.systemMemory) return false;
        	if (Double.compare(that.cpu, cpu) != 0) return false;
        	if (displayInches != that.displayInches) return false;
        	return os.equals(that.os);
        	}
        

        public int hashCode() {
        	int result = (int)batteryCapacity;
        	result = 19 * result + os.hashCode();
        	result = 19 * result + memoryROM;
        	result = 19 * result + systemMemory;
        	result = 19 * result + (int)cpu;
        	result = 19 * result + displayInches;
        	return result;
        	}

        public String toString() {
        	return "Laptop :" + "BATTERY_CAPACITY=" + batteryCapacity + ", OS='" + os + '\'' +
        	", MEMORY_ROM=" + memoryROM + '\'' + ", SYSTEM_MEMORY=" + systemMemory + '\'' +
        	", CPU=" + cpu + ", DISPLAY_INCHES='" + displayInches + '\'' + ";";
        	}
    
}
