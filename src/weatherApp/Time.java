package weatherApp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Time {
	
	//declare new date object
	Date DT = new Date();
	SimpleDateFormat timeOfDay = new SimpleDateFormat("HHmm");

	// method that returns time of the day
	public int returnTimeOfDayAsInt(){
		int returnTime = Integer.parseInt(timeOfDay.format(DT));
		
		return returnTime;
	}
}
