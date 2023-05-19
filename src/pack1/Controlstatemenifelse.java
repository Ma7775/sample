package pack1;

public class Controlstatemenifelse 
{
	//Grade marks>=90-A+ , mark>=70-A , mark>=50-B, mark>=35-C,  else fail
	public static void main(String[] args) 
	{
		int mark= 90;
		if(mark>=90)
		{
			System.out.println("A+");
		}
		else if(mark>=70)
		{
		System.out.println("A");
		}
		else if (mark>=50) 
		{
			System.out.println("B");
		}
		else if (mark>=35) 
		{
			System.out.println("C");
		}
		else
		{	
			System.out.println("Fail");
		}
	}

}
