package exceptionHandle;

import java.io.BufferedReader;

public class MoodAnalyser {

	//1. Created Method to Compare the Mood
	public static String mood(String str)
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
			//For Any Mood 
			else 
			{
				System.out.println("Did Not contain Happy or Sad");
			}
		return null;
	}
}
