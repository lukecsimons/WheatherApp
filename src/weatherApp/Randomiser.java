package weatherApp;
import java.util.Random;

public class Randomiser {
	
	// Inistialize the random object once for the whole class
	private static Random randomiser = new Random();
	
	// method will return a random index from within a string array 
	public String stringRandomiser(String[] array) {
		int idx = randomiser.nextInt(array.length);
		String rand = array[idx];

		return rand;
	}
	
	// method will return random number between a specified min max range
	public int numberGenerator(int min, int max){
		
		int randomInt = randomiser.nextInt(max - min + 1) + min;
		
		return randomInt;
	}

}
