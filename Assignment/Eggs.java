package Assignment;
import java.util.*;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggs,gross,remgross,dozen,remain;
		Scanner scan=new Scanner(System.in);
		System.out.println("Eggs= ");
		eggs=scan.nextInt();
		scan.close();
		
		gross=eggs/144;
		remgross=eggs%144;
		dozen=remgross/12;
		remain=remgross%12;
		System.out.println("gross= "+gross+" dozen= "+dozen+" remaining= "+remain);
		

	}

}
