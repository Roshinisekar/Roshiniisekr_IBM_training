package Assignment;
import java.util.*;

public class TaxCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary;
		String catergory;
		Scanner scan=new Scanner(System.in);
		System.out.println("salary=");
		salary=scan.nextInt();
		System.out.println("Catergory: ");
		catergory=scan.next();
		scan.close();
			
		if(catergory=="general")
		{
			if((salary>=0) && (salary<=180000))
				System.out.println("No tax");
			else if((salary>=180001) && (salary<=500000))
				System.out.println("10%");
			else if((salary>=500001) && (salary<=800000))
				System.out.println("20%");
			else
				System.out.println("30%");
		}
		else
		{
			if((salary>=0) && (salary<=190000))
				System.out.println("No tax");
			else if((salary>=190001) && (salary<=500000))
				System.out.println("10%");
			else if((salary>=500001) && (salary<=800000))
				System.out.println("20%");
			else
				System.out.println("30%");
		}

	}

}
