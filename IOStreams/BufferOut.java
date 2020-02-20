package IOStreams;
import java.io.*;

public class BufferOut {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		
		FileOutputStream fout=new FileOutputStream("E:\\testout.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="you are the cause of my Euphoria";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.close();
		fout.close();
		System.out.println("Euphoria");

	}

}
