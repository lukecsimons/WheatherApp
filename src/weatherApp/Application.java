package weatherApp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		// declare of necessary objects for App
		Weather w = new Weather();
		Randomiser r = new Randomiser();
		Time t = new Time();
				
		int timeOfDay = t.returnTimeOfDay();
		String[] range = w.getWeatherRange(timeOfDay);
		
		int tod = t.returnTimeOfDay();
		System.out.println("time of day is:  " + tod);
		
		int temp = w.GetTemperature(Integer.parseInt(range[1]), Integer.parseInt(range[2]));
		double pressure = w.GetPressure(14.7);
		
		System.out.println("The current temperature is: " + temp + " Degrees");
		System.out.println("The current air pressure is :  " + pressure);
	}

}
