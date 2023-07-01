package practice;

public class Calculator {

	
	void add() {
		int a = 100;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	void sub() {
		int a = 100;
		int b = 20;
		int c = a-b;
		System.out.println(c);
	}
	
	void mul() {
		int a = 100;
		int b = 20;
		int c = a*b;
		System.out.println(c);
	}
	
	void div() {
		int a = 100;
		int b = 20;
		int c = a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c = new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}

}
