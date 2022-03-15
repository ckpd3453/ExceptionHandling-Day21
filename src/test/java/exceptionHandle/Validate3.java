package exceptionHandle;
import static org.junit.Assert.*;
import org.junit.Test;
public class Validate21 {

	//Testing Unit Cases using JUnit
	@Test
	public void testFindMood()
	{
		assertEquals("Happy",MoodAnalyser21.mood(""));
	}
}
