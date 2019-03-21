package assignment_12;

import javax.xml.transform.Result;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * Return a version of the given string, where for every star (*) in the string
	 * the star and the chars immediately to its left and right are gone. So "ab*cd"
	 * yields "ad" and "ab**cd" also yields "ad". <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * starKill("cd*zq") <b>---></b>"cq"<br>
	 * starKill("ab**cd") <b>---></b> "ad" <br>
	 * starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */

	public static String starKill(String str) {
		System.out.println(str);
		String result = "";
		boolean sawStar = false;
		for (int i = 0; i < str.length(); i++) {
			String c = "" + str.charAt(i);
			if (sawStar) {
				if (!c.equals("*")) {
					sawStar = false;
				}
				continue;
			}
			if (!c.equals("*")) {
				sawStar = false;
				result = result + c;
			} else {
				sawStar = true;
				if (result.length() > 0)
					result = result.substring(0, result.length() - 1);
			}
		}
		return result;
	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}
