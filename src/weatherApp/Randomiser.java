package weatherApp;
import java.util.Random;

public class Randomiser {
	
	public void stringRandomiser(String[] array) {
		int idx = new Random().nextInt(array.length);
		String rand = array[idx];

		System.out.println(rand);

	}

}
