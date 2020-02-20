package Interface;


interface Runnable
{
	void run();
}

interface Flyable extends Runnable
{
	double velocity=1000;
	void fly();
}

interface Swimable extends Runnable
{
	//by default all variables r public static final i.e constant
	double speed=34.9;
	
	// by default all methods are abstract
	void swim();
	void pause();
	
}

class AutomobileMain
{
	
}

class WaterAuto extends AutomobileMain implements Swimable
{

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("100km/hr");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("pause for 20mins");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run with average speed");
		
	}
	
}

class AirAuto extends AutomobileMain implements Flyable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("High speed");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane pt.2");
	}
	
}



public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterAuto w=new WaterAuto();
		w.swim();
		w.pause();
		w.run();
		System.out.println(Swimable.speed);
		AirAuto a=new AirAuto();
		a.fly();
		a.run();
		System.out.println(Flyable.velocity);
		
		
		
	}

}
