package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorsInJava {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector();
		
		for(int i=0;i<=1000;i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		
		System.out.println(v.indexOf(499));
		
		v.remove(499);
		
		System.out.println(v);
		
		
        
	}

}
