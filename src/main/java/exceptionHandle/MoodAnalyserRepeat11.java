package exceptionHandle;

public class MoodAnalyserRepeat11 {
	private String message;
	/**
	 * PROCEDURE
	 * =======================================
	 *  1.created parametric constructor
	 *  2.created another constructor
	 *  3. created getter and setters
	 *  4.creating a method to check various mood
	 *  5.condition if person is happy
	 *  6.condition if person is sad
	 *  7.condition if person is in any mood
	 * @param message-mood of person
	 * =========================================
	 */
	
	/*
	 * 1.created parametric constructor
	 */
	public MoodAnalyserRepeat11(String message) {
		super();
		this.message = message;
	}

	/*
	 * 2.created another constructor
	 */
	public MoodAnalyserRepeat11() {

	}

	/*
	 * 3. created getter and setters
	 */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 4.creating a method to check various mood
	 */
	public String analyzeMood() {

		/*
		 * 5.condition if person is happy
		 */
		if (message.toLowerCase().contains("happy")) {
			return "Happy";

			/*
			 * 6.condition if person is sad
			 */
		} else if (message.toLowerCase().contains("sad")) {
			return "Sad";

			/*
			 * 7.condition if person is in any mood
			 */
		} else {

			return "Happy";

		}

	}
}