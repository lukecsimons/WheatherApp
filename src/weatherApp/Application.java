package weatherApp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		// declare of necessary objects for App
		Weather w = new Weather();
		Time t = new Time();
		
		int timeOfDayAsInt = t.returnTimeOfDayAsInt();
		String[] weatherRange = w.getCurrentWeatherRange(timeOfDayAsInt);
		
		System.out.println(timeOfDayAsInt);
		System.out.println("The current temperature is:  " + w.getTemperature(weatherRange));
		System.out.println("The current pressure is: " + w.getPressure(1250));
		
	}

}
