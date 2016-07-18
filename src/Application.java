import weatherApp.Weather; 

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		Weather w = new Weather();
		
		w.GenerateConditions(w.getWeatherConditions());
		
	}

}
