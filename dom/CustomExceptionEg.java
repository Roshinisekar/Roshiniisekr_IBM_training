package dom;
import java.io.IOException;

class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}  

public class CustomExceptionEg {
	 static void validate(int age)throws InvalidAgeException{
		 if(age<18)
			 throw new InvalidAgeException("not valid");
		 else
			 System.out.println("welcome to vote");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(13);
		}
		catch(Exception m) {
			System.out.println("exception occured"+m);
		}
		System.out.println("rest of the code");

	}

}
