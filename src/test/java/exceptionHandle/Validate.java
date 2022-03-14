package exceptionHandle;
import static org.junit.Assert.*;
import org.junit.Test;
public class Validate {

	@Test
	public void testFindMood()
	{
		assertEquals("Happy",MoodAnalyser.mood("I am in Any mood"));
	}
}
