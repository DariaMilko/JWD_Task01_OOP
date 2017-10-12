package by.tc.task01.entity;

public class TabletPC extends Appliance{
	// you may add your own code here
    private int batteryCapacity;
    private int displayInches;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String color;
    
    public TabletPC() {
        this.batteryCapacity = 0;
        this.displayInches = 0;
        this.memoryROM = 0;
        this.flashMemoryCapacity = 0;
        this.color = "";
        }
        
        public TabletPC(int batteryCapacity, int displayInches, int memoryROM, int flashMemoryCapacity, String color) {
        	this.batteryCapacity = batteryCapacity;
        	this.displayInches = displayInches;
        	this.memoryROM = memoryROM;
        	this.flashMemoryCapacity = flashMemoryCapacity;
        	this.color = color;
        	}

        public int getBatteryCapacity() {
        	return batteryCapacity;
        	}
        
        public void setBatteryCapacity(int batteryCapacity) {
        	this.batteryCapacity = batteryCapacity;
        	}
        
        public int getDisplayInches() {
        	return displayInches;
        	}

        public void setDisplayInches(int displayInches) {
        	this.displayInches = displayInches;
        	}
        
        public int getMemoryROM() {
        	return memoryROM;
        	}
        
        public void setMemoryROM(int memoryROM) {
        	this.memoryROM = memoryROM;
        	}

        public int getFlashMemoryCapacity() {
        	return flashMemoryCapacity;
        	}

        public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        	this.flashMemoryCapacity = flashMemoryCapacity;
        	}
        
        public String getColor() {
        	return color;
        	}
        
        public void setColor(String color) {
        	this.color = color;
        	}
        
        public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	
        	TabletPC that = (TabletPC) obj;
        	
        	if (batteryCapacity != that.batteryCapacity) return false;
        	if (displayInches != that.displayInches) return false;
        	if (memoryROM != that.memoryROM) return false;
        	if (flashMemoryCapacity != that.flashMemoryCapacity) return false;
        	return color.equals(that.color);
        	}
        

        public int hashCode() {
        	int result = batteryCapacity;
        	result = 19 * result + displayInches;
        	result = 19 * result + memoryROM;
        	result = 19 * result + flashMemoryCapacity;
        	result = 19 * result + color.hashCode();
        	return result;
        	}

        public String toString() {
        	return "TabletPC :" + "BATTERY_CAPACITY=" + batteryCapacity + ", DISPLAY_INCHES='" + 
        displayInches + '\'' + ", MEMORY_ROM='" + memoryROM + '\'' + ", FLASH_MEMORY_CAPACITY='" + flashMemoryCapacity + '\'' + 
        ", COLOR=" + color + ";";
        	}
}
