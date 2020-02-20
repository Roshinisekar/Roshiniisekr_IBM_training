package dom;


public class ExceptionPropagationEg {
	
	void m()
	{
		int data=50/0;
	}
	
	void n()
	{
		m();
	}
	
	void p()
	{
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionPropagationEg obj=new ExceptionPropagationEg();
		obj.p();
		System.out.println("normal flow");
//try n catch block can be mentioned here too
	}

}
