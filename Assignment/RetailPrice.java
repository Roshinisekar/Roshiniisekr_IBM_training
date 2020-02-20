package Assignment;
import java.util.*;

public class RetailPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String code;
		int quantity;
		double price;
		Scanner scan=new Scanner(System.in);
		System.out.println("Product Code: ");
		code=scan.next();
		System.out.println("Quantity: ");
		quantity=scan.nextInt();
		scan.close();
		
		switch(code)
		{
		case "A":
			{
				price=quantity*22.50;
				System.out.println("Price= "+price);
				break;
			}
		case "B":
			{
				price=quantity*44.50;
				System.out.println("Price= "+price);
				break;
			}
		case "C":
			{
				price=quantity*9.98;
				System.out.println("Price= "+price);
				break;
			}
		
			
		}
		

	}

}
