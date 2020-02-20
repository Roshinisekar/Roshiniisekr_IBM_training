package com;

public abstract class Shape {

	abstract double area(); // abstract method

	void display() {
		System.out.println("Jungkook");
	}
}

class Rectangle extends Shape {

	int l, w;

	public Rectangle(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return l * w;
	}
}

class Circle extends Shape {
	int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	double area() {//shows in quick fix
		// TODO Auto-generated method stub
		return (3.14 * this.r * this.r);
	}
}

class ShapeMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 6);
		System.out.println("Area =" + r.area());
		Circle c = new Circle(5);
		System.out.println("Area=" + c.area());

	}
}//right click at project name and selet run as and click the relavent main
