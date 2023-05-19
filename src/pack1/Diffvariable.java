package pack1;


public class Diffvariable 
{  
	int num1 = 40;// can be excess in non static regular method, for static method need to create object for each method to excess this variable
	static int num2 = 50;// is a class variable and can be excess in any method 
	
	

	public static void main(String[] args) 
	{
		add();
		sub();
		System.out.println(num2);
		
		Diffvariable mar24 = new Diffvariable();
		System.out.println(mar24.num1);
		mar24.mul();
		
	}
	//SRM
	public static void add()
	{
	  int b1 =20;
	     System.out.println(b1);	
	System.out.println(num2);
	Diffvariable vd = new Diffvariable();
	System.out.println(vd.num1);

	}
		public static void sub()
		{
			int c1= 30;
			System.out.println(c1);
		System.out.println(num2);
		
		}
	public void mul()
		{
			int d1 = 40;
			System.out.println(d1);
			System.out.println(num2);
		}
		
		
		
		
	
}
