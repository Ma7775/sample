package pack1;

public class Method2 
{
	int a=10;
	public  void mul()
	{
		int a=20;
		System.out.println(a);
				
	}
	public void div()
	{
	 System.out.println(this.a);
	 mul();
	}
	Method2()
	{
	
	}
	Method2(int a)
	{
		
		this();
	}
	
	public static void main(String[] args) 
	{
		
			Method2 cd = new Method2();
			cd.div();
			cd.mul();
			
	}
}
