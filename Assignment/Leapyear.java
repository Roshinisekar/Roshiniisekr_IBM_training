package Assignment;
import java.util.*;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		Scanner scan= new Scanner(System.in);
		System.out.println("year");
		year=scan.nextInt();
		scan.close();
		if(((year%4==0 && year%100 !=0)) || (year%400==0))
			System.out.println("Leap year");
		else
			System.out.println("not leap year");
		
	}

}
