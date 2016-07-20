package weatherApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	The purpose of this class is to generate wheather patterns for the App
 
 */
public class Weather {
	//Instance Variables
	private int Temperature;
	private int Pressure;
	private int Humidity;
	private String Conditions;
	
	// Class variables
	private final static String[] weatherConditions = {"Snow","Rainy","Cloudy","Clear","Sunny"};
	Randomiser r = new Randomiser();	
	
	// multidimensional array to store some basic ranges for the weather conditions
	String[][] weatherRanges = {
			{"Morning","-5","20","0600","1200"},
			{"Midday","15","50","1200","1800"},
			{"Night","10","30","1800","2400"}
	};
	
	// method to check time of the day for the weather range
	public String[] getWeatherRange(int timeOfDay){
		String[] range = new String[5];
		
		// search through the array using the time of day to find out the ranges  
		for(int i = 0; i < weatherRanges.length; i++){
			//Get the Max and Min range for the current time period
			int min = Integer.parseInt(weatherRanges[i][3]);
			int max = Integer.parseInt(weatherRanges[i][4]);
			
			if (timeOfDay > min &&  timeOfDay < max){
				for(int p = 0; p < weatherRanges[i].length; p++){
					range[p] = weatherRanges[i][p];
				}
				
				continue;
			}
		}
		
		return range;
	}
	
	// method to generate the weather report
	public String generateWeatherReport(){
		String temp = "temp value";
		
		return temp;
	}
	
	// method - Getter - to get conditions
	public String[] getWeatherConditions(){
		return weatherConditions;
	}	
	
	// method to provide current conditions
	public String GenerateConditions(int temperature){		
		
		//new array to to hold weather conditions within scope of method
		String[] conditions = {"hello"};
		return r.stringRandomiser(conditions);
	}
	
	// method to provide current temperature
	public int GetTemperature(int min, int max){
		return r.numberGenerator(min, max);
	}
	
	// method to provide current Pressure
	public double GetPressure(double Elevation){
		// formula to calculate air pressure
		// to be added in later
		double barometric = Elevation;
		
		// convert psi to hectopascals
		double pressure = (double) Math.round((barometric * 68.94757293168) * 100) / 100;
		
		return pressure;
	}
	
	// method to provide current humidity
	public void GetHumidity(int temperature){
		
	}
}
