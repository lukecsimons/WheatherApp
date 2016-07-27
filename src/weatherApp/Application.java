package weatherApp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		// declare of necessary objects for App
		Weather w = new Weather();
		Time t = new Time();
		
		int timeOfDayAsInt = t.returnTimeOfDayAsInt();
		String[] weatherRange = w.getCurrentWeatherRange(timeOfDayAsInt);
		int temp = w.getTemperature(weatherRange);
		
		
		System.out.println(timeOfDayAsInt);
		System.out.println("The current temperature is:  " + temp);
		System.out.println("The current pressure is: " + w.getPressure(1250));
		System.out.println("The current humidity is: " + w.getHumidity());
		
	}

}
