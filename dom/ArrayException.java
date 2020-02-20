package dom;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int arr[]= {11,22,33,44,55};
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("program executed");
		
	}

}
