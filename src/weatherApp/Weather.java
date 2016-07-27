package weatherApp;

import java.util.Random;
/*
	The purpose of this class is to generate wheather patterns for the App
 
 */
public class Weather {
	//Instance Variables
	private int Temperature;
	private double Pressure;
	private double Humidity;
	private String Conditions;
	private String[] weatherRange;
	
	// Class variables
	private final static String[] weatherConditions = {"Snow","Rainy","Cloudy","Clear","Sunny"};
	Random r = new Random();
	
	
	//as per encapsulation you do not want classes crossing
	//Time t = new Time();
	//int timeOfDayAsInt = t.returnTimeOfDayAsInt();
	//Randomiser r = new Randomiser();	
	
	
	
	// multidimensional array to store some basic ranges for the weather conditions
	String[][] weatherRanges = {
			{"Morning","-5","20","0600","1200"},
			{"Midday","15","50","1200","1800"},
			{"Night","10","30","1800","2400"}
	};
	
	// Getters and setters
	public int getTemperature(String[] weatherRange){
		//String[] temp = getCurrentWeatherRange();
		// run the calculate method to set the temperature value
		calculateTemperature(Integer.parseInt(weatherRange[1]),Integer.parseInt(weatherRange[2]));
		
		return Temperature;
	};
	
	public double getPressure(double Elevation){
		// run the method to calculate and set the variable to the value
		calculatePressure(Elevation);
		return Pressure;
	};
	
	public double getHumidity(){
		calculateHumidity();
		return Humidity;
	}

	public String[] getWeatherConditions(){
		return weatherConditions;
	}	
	
	public String[] getCurrentWeatherRange(int timeOfDayAsInt){
		calculateWeatherRange(timeOfDayAsInt);
	
		return this.weatherRange;
	};
	
	
	//Methods
	// method to check time of the day for the weather range
	public void calculateWeatherRange(int timeOfDay){
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
		
		this.weatherRange = range;
	}
	
	// method to provide current temperature
	public void calculateTemperature(int min, int max){
		this.Temperature = r.nextInt(max - min + 1) + min;
	}
	
	// method to provide current Pressure
	// parse the elevation in order to return the pressure
	public void calculatePressure(double Elevation){
		// formula to generate barometric pressure value
		// value is in pascals
		double barometric = Math.pow((1-2.25577 * 0.00001 * Elevation),5.25588) * 101325;
		
		// convert pascals to hectopascals
		double pressure = (double) Math.round((barometric / 100) * 100) / 100;
		
		Pressure = pressure;
	}
	
	// method to provide current humidity
	public void calculateHumidity(){
		
		int wetBulbTemp = r.nextInt(this.Temperature - 10);
		
		// dry bulb saturation air pressure
		double Es = 6108 * Math.log((17.27 * this.Temperature)/(237.3 * this.Temperature));
		// wet bulb saturation air pressure
		double Ew = 6108 * Math.log((17.27*wetBulbTemp)/(237.3*wetBulbTemp));
		// Actual pressure
		double E = Ew - (0.00066 * (1+ 0.00115 * wetBulbTemp) * (this.Temperature - wetBulbTemp) * this.Pressure);
		//temp value
		double B = (Math.log(E / 6.108)) / 17.27;
		// Dewpoint in Degrees
		double D = (237.3 * B) / (1 - B);
		
		//set the humidity
		this.Humidity = 100 * (E /Es);
		
	}
	
	
//	// method to provide current conditions
//	public String GenerateConditions(int temperature){		
//		
//		//new array to to hold weather conditions within scope of method
//		String[] conditions = {"hello"};
//		return r.stringRandomiser(conditions);
//	}

}
