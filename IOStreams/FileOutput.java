package IOStreams;
import java.io.FileOutputStream;
public class FileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileOutputStream fout=new FileOutputStream("E:\\JavaFile.txt");
			fout.write(65);
			String s="we are bulletproff boys!";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("BTS");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
