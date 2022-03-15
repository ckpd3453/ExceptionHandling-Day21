package exceptionHandle;

/**
 * We have created our custom exception. 
 * *  We have used Inheritance and extended the Exception class.
 *  Then we have created a method and passed a message as input.
 *  Inside the method we have called the super. It is a reference variable which is used to refer immediate parent class object. 
 * @author CKPD
 *
 */
public class MoodAnalyser3Exception extends Exception {
	public MoodAnalyser3Exception(String message) {
		super(message);
	}
}
