package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		System.out.println();
		//Using for each on enhanced for loop
		System.out.println(a1);
		for(Integer i:a1)
		{
			System.out.println(i);
		}
		System.out.println();
		
		//Using for loop
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println();
		//Using iterator
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		String s1="Jaya";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		
		
	}
	

}
