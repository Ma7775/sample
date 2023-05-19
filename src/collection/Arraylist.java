package collection;

import java.util.ArrayList;
import java.util.Vector;

public class Arraylist {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add("mohit");
		al.add(80);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.contains("mohit"));
		al.add(2, 20);
		al.set(0, "rahul");
		System.out.println(al);
		
		
	}

}
