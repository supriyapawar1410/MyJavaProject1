package JavaCodingPractice;

public class Swapintegers {

	public static void main(String[] args) {


		int a=30;
		int b=20;
		
		System.out.println("Before Swapping = a is " + a + " b is " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping = a is " + a + " b is " +b);
		

	}

}
