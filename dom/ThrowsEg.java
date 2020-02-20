package dom;
import java.io.IOException;

public class ThrowsEg {

	void m()throws IOException{
		throw new IOException("device error");// checked exception
	}
	
	void n()throws IOException {
		m();
	}
	
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception handle");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowsEg obj=new ThrowsEg();
		obj.p();
		System.out.println("normal flow");
	}

}
