package exceptionHandle;

public class MoodAnalyser21 {

	/*
	 * Procedure:-
	 * **************
	 * 1. Created Method to Analyze Mood 
	 * 2.Checking For Exception and throwing exception
	 * 3. Handling Exception
	 */
	
	//1. Created Method to Analyze Mood 
	public static String mood(String str)
	{
		//2.Checking For Exception and throwing exception
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
			//For Any Mood
			else 
			{
				throw new NullPointerException();
			}
		}
		//3. Handling Exception
		catch(NullPointerException e) {
			System.out.println("Happy");
			return "Happy";
		}
	}
}