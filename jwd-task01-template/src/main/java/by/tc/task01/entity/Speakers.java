package by.tc.task01.entity;

public class Speakers extends Appliance{
	// you may add your own code here
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;
    
    
    public Speakers() {
        this.powerConsumption = 0;
        this.numberOfSpeakers = 0;
        this.frequencyRange = "";
        this.cordLength = 0;
        }
        
        public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
        	this.powerConsumption = powerConsumption;
        	this.numberOfSpeakers = numberOfSpeakers;
        	this.frequencyRange = frequencyRange;
        	this.cordLength = cordLength;
        	}

        public int getPowerConsumption() {
        	return powerConsumption;
        	}
        
        public void setPowerConsumption(int powerConsumption) {
        	this.powerConsumption = powerConsumption;
        	}
        
        public int getNumberOfSpeakers() {
        	return numberOfSpeakers;
        	}

        public void setNumberOfSpeakers(int numberOfSpeakers) {
        	this.numberOfSpeakers = numberOfSpeakers;
        	}
        
        public String getFrequencyRange() {
        	return frequencyRange;
        	}
        
        public void setFrequencyRange(String frequencyRange) {
        	this.frequencyRange = frequencyRange;
        	}

        public int getCordLength() {
        	return cordLength;
        	}

        public void setCordLength(int cordLength) {
        	this.cordLength = cordLength;
        	}
        
        public boolean equals(Object obj) {
        	if (this == obj) return true;
        	if (obj == null || getClass() != obj.getClass()) return false;
        	
        	Speakers that = (Speakers) obj;
        	
        	if (powerConsumption != that.powerConsumption) return false;
        	if (numberOfSpeakers != that.numberOfSpeakers) return false;
        	if (cordLength != that.cordLength) return false;
        	return frequencyRange.equals(that.frequencyRange);
        	}
        

        public int hashCode() {
        	int result = powerConsumption;
        	result = 19 * result + numberOfSpeakers;
        	result = 19 * result + frequencyRange.hashCode();
        	result = 19 * result + cordLength;
        	return result;
        	}

        public String toString() {
        	return "Speakers :" + "POWER_CONSUMPTION=" + powerConsumption + ", NUMBER_OF_SPEAKERS='" + 
        numberOfSpeakers + '\'' + ", FREQUENCY_RANGE='" + frequencyRange + '\'' + ", CORD_LENGTH='" + cordLength + ";";
        	}
}
