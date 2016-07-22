package weatherApp;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		// declare of necessary objects for App
		Weather w = new Weather();
		
		System.out.println("The current temperature is:  " + w.getTemperature());
		System.out.println("The current pressure is: " + w.getPressure(1250));
		
	}

}
