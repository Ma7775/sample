package pack1;

public class Neastedifelse 
{
// Nested if else
	//age>=18 Blood donation
	//weight>=50kg
	
	public static void main(String[] args) 
	{
		int age=20;
		int weight=49;
		
		if(age>=18)
		{
			System.out.println("you have passed age condition... please go for weight checkup");
			if(weight>=50)
			{
				System.out.println("you have pass the both conditions..you are eligible for blood donation");
			}
			else
			{
				System.out.println("you have not passed weight condition..you are not eligible for blood donation");
			}
		}
		else
		{
			System.out.println("you are not eligible for blood donation");
		}
	}
	

}
