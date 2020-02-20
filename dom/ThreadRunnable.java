package dom;

//when can thread by using runnable interface
//used when our class is being extended

class A
{
	
}

public class ThreadRunnable extends A implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnable r=new ThreadRunnable();
		Thread t=new Thread(r); //r is runnable target , allocates a new thread object
		t.start();
		Thread t1=new Thread(r);
		t1.start();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
