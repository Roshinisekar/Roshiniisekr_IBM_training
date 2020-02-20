package dom;

public class ExceptionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		System.out.println("program execution starts");
		
		try
		{
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());     
		}
		finally
		{
			System.out.println("i am always executing if exception occurs or not");//can also excetute even there is no any error occuring stmt
		}
		System.out.println("program execution is done");
		

	}

}
