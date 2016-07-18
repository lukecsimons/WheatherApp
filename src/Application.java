import weatherApp.Weather; 

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		Weather w = new Weather();
		String conditions = w.GenerateConditions(w.getWeatherConditions());
		
		System.out.println(conditions);
	}

}
