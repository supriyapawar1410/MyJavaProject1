package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReversedLinkedList {

	public static void main(String[] args) {
		
		List<Integer> List=new LinkedList();
		
		for(int i=0;i<=10;i++)
		{
			List.add(i);
		
		}
		System.out.println("Before reversing "+List);
		
		Collections.reverse(List);
		
		System.out.println("After reversing "+List);
		

	}

}
