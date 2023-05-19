package pack1;

public class Constructordemo 
{
	int a;
	
	public static void main(String[] args) 
	{
		Constructordemo cd = new Constructordemo(1);
		Constructordemo vd = new Constructordemo(10);
		Constructordemo dd = new Constructordemo(10,10);
	}
	
	 Constructordemo()//default constructor 
	{
		
		System.out.println(a);
	}
	 Constructordemo(int n)// parameter constructor
	 {
		 System.out.println(n);
	 }
	 Constructordemo(int c,int m)
	 {
		 System.out.println(c);
		 System.out.println(m);
		 
	 }

			
	
}
