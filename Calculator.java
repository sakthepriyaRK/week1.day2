package week1.day2;

public class Calculator 
{
	int n, n2,n3;
	double m1,m2;
	float f1,f2;
	public  int  addition (int n1,int n2,int n3)
	{ 
		int sum=n1+n2+n3;
	 return sum;
	}
	public  int  sub( int n1,int n2)
	{
		int sum=n1-n2;
	 return sum;
	}
	public  double mul(double m1,double m2)
	{
		double sum=m1*m2;
		return sum;
	}
	public  float div(float f1,float f2)
	{
		float sum=f1/f2;
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		System.out.println("addition:"+ cal.addition(5, 10, 15));
		System.out.println("subraction:"+ cal.sub(10,5));
		System.out.println("multiplication:"+ cal.mul(10, 5));
		System.out.println("division:" + cal.div(10, 5));
	
}
}
