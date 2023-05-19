package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectordemo {// same as arraylist 

	public static void main(String[] args) 
	{
		Vector al = new Vector();
		al.add("mohit");
		al.add(80);
	
		// for each loop 
			for( Object s1:al)
			{
			
			}
			
			ListIterator list = al.listIterator();
					
			while(list.hasNext())
			{
				System.out.println(list.next());
			}
			
			Iterator itr = al.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
		}
	}
	


