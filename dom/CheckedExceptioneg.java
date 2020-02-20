package dom;
import java.io.IOException;   /* to denote the-*/
import java.sql.SQLException;/* - checked expression*/

public class CheckedExceptioneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
		throw new ArrayIndexOutOfBoundsException();// unchecked exception must be handled at run time
		
		//throw new IOEXception();checked exception must be handle at compile time
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
