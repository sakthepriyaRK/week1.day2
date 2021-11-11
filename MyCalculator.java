package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println("addition:"+ cal.addition(5, 10, 15));
		System.out.println("subraction:"+ cal.sub(10,5));
		System.out.println("multiplication:"+ cal.mul(10, 5));
		System.out.println("division:" + cal.div(10, 5));
	}

}
