package Generic_Utility;

import java.util.Random;

public class Java_Utility {
	
	public int RandomNum(int limit) {
		
		Random ran = new Random();
		int num = ran.nextInt(limit);
		return num;
		
		
	}

}
