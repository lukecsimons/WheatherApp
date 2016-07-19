package weatherApp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		Weather w = new Weather();
		Randomiser r = new Randomiser();
		
		String conditions = w.GenerateConditions(w.getWeatherConditions());
		
		System.out.println(conditions);
		System.out.println(w.GetTemperature());
	}

}
