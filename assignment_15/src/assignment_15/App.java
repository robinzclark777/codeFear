package assignment_15;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
		int longest = 0;
		int current = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				current = 1;
				longest = 1;
				continue;
			}
			if (str.charAt(i) == str.charAt(i-1)) {
				current++;
				if (current > longest) longest = current;
			} else {
				current = 1;
			}
	}
	return longest;
}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}
