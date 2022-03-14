package exceptionHandle;

import java.io.BufferedReader;

public class MoodAnalyser {

	public static String mood(String str)
	{
		try
		{
			if(str.toLowerCase().contains("happy"))
			{
				System.out.println("HAPPY");
				return "Happy";
			}
			else if(str.toLowerCase().contains("sad")){
				System.out.println("Sad");
				return "Sad";
			}
			else 
			{
				throw new NullPointerException();
			}
		}
		catch(NullPointerException e) {
			System.out.println("Did Not contain Happy or Sad");
		}
		return null;
	}
}
