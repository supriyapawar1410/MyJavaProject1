package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		long startTime= System.currentTimeMillis();
		
		List<Integer> list= new ArrayList();
		
		for(int i=0;i<=1000;i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		long endtime=System.currentTimeMillis();
		
		System.out.println("Time required "+(endtime-startTime));
		
		Iterator<Integer> itr= list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		list.forEach(x ->System.out.println(x));

	}

}
