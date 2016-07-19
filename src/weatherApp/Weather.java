package weatherApp;

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
				for(int p = 0; p < weatherRanges.length; p++){
					range[p] = weatherRanges[i][p];
				}
			}
		}
		
		return range;
	}
	
	// method to generate the weather report
	public String generateWeatherReport(){
		String temp = "temp value";
		
		return temp;
	}
	
	// method to get conditions
	public String[] getWeatherConditions(){
		return weatherConditions;
	}	
	
	// method to provide current conditions
	public String GenerateConditions(String[] conditions){		
		
		
		return r.stringRandomiser(conditions);
	}
	
	// method to provide current temperature
	public int GetTemperature(int min, int max){
		return r.numberGenerator(min, max);
	}
	
	// method to provide current Pressure
	public void GetPressure(){
		
	}
	
	// method to provide current humidity
	public void GetHumidity(){
		
	}
}
