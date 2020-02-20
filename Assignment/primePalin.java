package Assignment;
import java.util.*;
public class primePalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,revNum=0,rem;
		int flag=0,check,m;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number ");
		num=scan.nextInt();
		scan.close();
		check=num;
		while(num>0)
		{
			rem=num%10;
			revNum=rem+(revNum*10);
			num=num/10;
		}
		
		if(check==revNum)
		{
			m=(int)Math.pow(check, 0.5);
			for(int i=2;i<=m;i++)
			{
				if(check%i==0)
				{
					flag=1;
					break;
				}
			}
		if(flag==0)
			System.out.println(check+"p");
		else
			System.out.println(check);
		}

	}

}
