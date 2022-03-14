package exceptionHandle;
import static org.junit.Assert.*;
import org.junit.Test;
public class Validate {

	@Test
	public void testFindMood()
	{
		assertEquals("Sad",MoodAnalyser.mood("I am Any mood"));
	}
}
