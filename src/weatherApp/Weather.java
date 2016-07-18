package weatherApp;
import weatherApp.Randomiser;
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
	private final static String[] weatherConditions = {"Rainy","Cloudy","Sunny","Clear","Snow"};
	
	// method to get conditions
	public String[] getWeatherConditions(){
		return weatherConditions;
	}
	
	// method to provide current conditions
	public void GenerateConditions(String[] conditions){
		Randomiser rand = new Randomiser();
		
		rand.stringRandomiser(conditions);
	}
	
	// method to provide current temperature
	public void GetTemperature(){
		
	}
	
	// method to provide current Pressure
	public void GetPressure(){
		
	}
	
	// method to provide current humidity
	public void GetHumidity(){
		
	}
}
