package exceptionHandle;
import static org.junit.Assert.*;
import org.junit.Test;
public class Validate {
	
	/*
	 * Created method to Validate the test Cases for Mood
	 */
	@Test
	public void testFindMood()
	{
		assertEquals("Happy",MoodAnalyser.mood("I am in Happy mood"));
	}
}
