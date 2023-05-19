package collection;

public class multidementional 
{

	public static void main(String[] args) 
	{
		int a[][]={{10,20},{30,40},{50,60}};	
	
		System.out.println(a.length);
		
		
		
		for(int b=0;b<=2;b++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.print(a[b][c]+" ");
				
				
			}
			System.out.println();
		}
		
	}
	

}
