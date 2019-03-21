package assignment_04;

import ignore.TestingUtils;

public class App {

	/**
	 * The birds in Florida like to sing during favorable temperatures. In
	 * particular, they sing if the temperature is between 60 and 90 (inclusive).
	 * Unless it is summer, then the upper limit is 100 instead of 90. Given an int
	 * temperature and a boolean isSummer, return true if the birds are singing and
	 * false otherwise. <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * birdsSinging(70, false) <b>---></b> true <br>
	 * birdsSinging(95, false) <b>---></b> false <br>
	 * birdsSinging(95, true) <b>---></b> true <br>
	 */
	public static boolean birdsSinging(int temp, boolean isSummer) {
		int minTemp = 60;
		int maxTemp = 90;
		if (isSummer) {
			maxTemp = 100;
		}
		if (temp > maxTemp || temp < minTemp) {
			return false;
		}
		return true;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();
	}
}
