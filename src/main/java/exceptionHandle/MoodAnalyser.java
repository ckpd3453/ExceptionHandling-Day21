package exceptionHandle;

import java.io.BufferedReader;

public class MoodAnalyser {

	/**
	 * Procedure:-
	 * ============
	 * 1. Created Method to Compare the Mood 
	 * 2. Exception Handling
	 */
	
	//1. Created Method to Compare the Mood
	public static String mood(String str)
	{
		//2. Exception Handling
		try
		{
			//For Happy
			if(str.toLowerCase().contains("happy"))
			{
				System.out.println("HAPPY");
				return "Happy";
			}
			//For Sad
			else if(str.toLowerCase().contains("sad")){
				System.out.println("Sad");
				return "Sad";
			}
			//For Any Mood Throwing Exeption
			else 
			{
				throw new NullPointerException();
			}
		}
		//Handling Exception by Passing Comments in null pointer error
		catch(NullPointerException e) {
			System.out.println("Did Not contain Happy or Sad");
		}
		return null;
	}
}
