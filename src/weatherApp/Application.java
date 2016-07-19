package weatherApp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		Weather w = new Weather();
		Randomiser r = new Randomiser();
		Time t = new Time();
		
		
		String conditions = w.GenerateConditions(w.getWeatherConditions());
		
		int timeOfDay = t.returnTimeOfDay();
		String[] range = w.getWeatherRange(timeOfDay);
		
		System.out.println("time of day is:  " + timeOfDay);
		
		for(String s: range){
			System.out.println(s);
		}
		
	}

}
