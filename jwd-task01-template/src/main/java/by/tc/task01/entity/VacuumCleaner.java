package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	// you may add your own code here
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;
    
    public VacuumCleaner() {
    this.powerConsumption = 0;
    this.filterType = "";
    this.bagType = "";
    this.wandType = "";
    this.motorSpeedRegulation = 0;
    this.cleaningWidth = 0;
    }
    
    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
    	this.powerConsumption = powerConsumption;
    	this.filterType = filterType;
    	this.bagType = bagType;
    	this.wandType = wandType;
    	this.motorSpeedRegulation = motorSpeedRegulation;
    	this.cleaningWidth = cleaningWidth;
    	}

    public int getPowerConsumption() {
    	return powerConsumption;
    	}
    
    public void setPowerConsumption(int powerConsumption) {
    	this.powerConsumption = powerConsumption;
    	}
    
    public String getFilterType() {
    	return filterType;
    	}

    public void setFilterType(String filterType) {
    	this.filterType = filterType;
    	}
    
    public String getBagType() {
    	return bagType;
    	}
    
    public void setBagType(String bagType) {
    	this.bagType = bagType;
    	}

    public String getWandType() {
    	return wandType;
    	}

    public void setWandType(String wandType) {
    	this.wandType = wandType;
    	}
    
    public int getMotorSpeedRegulation() {
    	return motorSpeedRegulation;
    	}
    
    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
    	this.motorSpeedRegulation = motorSpeedRegulation;
    	}
    
    public int getCleaningWidth() {
    	return cleaningWidth;
    	}
    
    public void setCleaningWidth(int cleaningWidth) {
    	this.cleaningWidth = cleaningWidth;
    	}
    
    public boolean equals(Object obj) {
    	if (this == obj) return true;
    	if (obj == null || getClass() != obj.getClass()) return false;
    	
    	VacuumCleaner that = (VacuumCleaner) obj;
    	
    	if (powerConsumption != that.powerConsumption) return false;
    	if (motorSpeedRegulation != that.motorSpeedRegulation) return false;
    	if (cleaningWidth != that.cleaningWidth) return false;
    	if (!filterType.equals(that.filterType)) return false;
    	if (!bagType.equals(that.bagType)) return false;
    	return wandType.equals(that.wandType);
    	}
    

    public int hashCode() {
    	int result = powerConsumption;
    	result = 19 * result + filterType.hashCode();
    	result = 19 * result + bagType.hashCode();
    	result = 19 * result + wandType.hashCode();
    	result = 19 * result + motorSpeedRegulation;
    	result = 19 * result + cleaningWidth;
    	return result;
    	}

    public String toString() {
    	return "VacuumCleaner :" + "POWER_CONSUMPTION=" + powerConsumption + ", FILTER_TYPE='" + 
    filterType + '\'' + ", BAG_TYPE='" + bagType + '\'' + ", WAND_TYPE='" + wandType + '\'' + 
    ", MOTOR_SPEED_REGULATION=" + motorSpeedRegulation + ", CLEANING_WIDTH=" + cleaningWidth + ";";
    	}
    }


