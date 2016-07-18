package weatherApp;
import java.util.Random;

public class Randomiser {
	
	public String stringRandomiser(String[] array) {
		int idx = new Random().nextInt(array.length);
		String rand = array[idx];

		return rand;
	}

}
