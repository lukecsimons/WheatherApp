package weatherApp;

/*
	The purpose of this class is to generate wheather patterns for the App
 
 */
public class Weather {
	//Instance Variables
	private int Temperature;
	private double Pressure;
	private int Humidity;
	private String Conditions;
	
	// Class variables
	private final static String[] weatherConditions = {"Snow","Rainy","Cloudy","Clear","Sunny"};
	Randomiser r = new Randomiser();	
	Time t = new Time();
	//int timeOfDayAsInt = t.returnTimeOfDayAsInt();
	
	
	
	// multidimensional array to store some basic ranges for the weather conditions
	String[][] weatherRanges = {
			{"Morning","-5","20","0600","1200"},
			{"Midday","15","50","1200","1800"},
			{"Night","10","30","1800","2400"}
	};
	
	// Getters and setters
	public int getTemperature(){
		String[] temp = getCurrentWeatherRange();
		// run the calculate method to set the temperature value
		calculateTemperature(Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
		
		return Temperature;
	};
	
	public double getPressure(double Elevation){
		// run the method to calculate and set the variable to the value
		calculatePressure(Elevation);
		return Pressure;
	};

	public String[] getWeatherConditions(){
		return weatherConditions;
	}	
	
	public String[] getCurrentWeatherRange(){
		String[] currentWeatherRange = getWeatherRange(t.returnTimeOfDayAsInt());
		
		return currentWeatherRange;
	};
	
	
	//Methods
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
	
	// method to provide current temperature
	public void calculateTemperature(int min, int max){
		this.Temperature = r.numberGenerator(min, max);
	}
	
	// method to provide current Pressure
	public void calculatePressure(double Elevation){
		// formula to generate barometric pressure value
		// value is in pascals
		double barometric = Math.pow((1-2.25577 * 0.00001 * Elevation),5.25588) * 101325;
		
		// convert pascals to hectopascals
		double pressure = (double) Math.round((barometric / 100) * 100) / 100;
		
		Pressure = pressure;
	}
	
	// method to provide current humidity
	public void GetHumidity(int temperature){
		
	}
	
	
	// method to provide current conditions
	public String GenerateConditions(int temperature){		
		
		//new array to to hold weather conditions within scope of method
		String[] conditions = {"hello"};
		return r.stringRandomiser(conditions);
	}

}
