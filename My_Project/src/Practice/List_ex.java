package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class List_ex 
{

	public static void main(String[] args)
	{
		List<String> lst= new ArrayList<String>();
		lst.add("java");
		lst.add("selenium");
		lst.add("testing");
		lst.add("qtp");
		
		lst.add(2, "linux");
		lst.add("java");
		
		for(String x : lst)  //for each loop  ..   x will take each value in lst
			System.out.println(x);
		
		System.out.println("==========================");
		
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("kiran");
		ts.add("vijay");
		ts.add("abhi");
		ts.add("zaved");
		ts.add("anil");
		
		ts.add("kiran");
		
		for(String x : ts)
			System.out.println(x);
		

	}

}
