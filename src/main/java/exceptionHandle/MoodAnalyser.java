package exceptionHandle;

public class MoodAnalyser {

	public static String mood(String str) {
		if (str.toLowerCase().contains("happy")) {
			System.out.println("HAPPY");
			return "Happy";
		} else if (str.toLowerCase().contains("sad")) {
			System.out.println("Sad");
			return "Sad";
		} else
			return null;
	}
}
