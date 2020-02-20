package dom;

//by extending Thread class

public class ThreadEg extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();//override used so that we can use the method in super class as well as to write our own method 
	
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadEg t1=new ThreadEg();//thread t1 is created
		ThreadEg t2=new ThreadEg();//thread t2 is created
		t1.start();
		try {
			Thread.sleep(1000);//give a exception so quick fix it
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
