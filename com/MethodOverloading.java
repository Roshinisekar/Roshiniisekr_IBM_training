package com;

public class MethodOverloading {

	// method overloading achieves compile time polymorphism

	double add(int a, double b) {
		return a + b;
	}

	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading x = new MethodOverloading();
		System.out.println(x.add(11, 1.1));
		System.out.println(x.add(11, 1));
		System.out.println(x.add(11.1, 1.1));

	}

}
