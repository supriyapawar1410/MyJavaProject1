package JavaCodingPractice;

public class StringReverse {

	public static void main(String[] args) {
		
		String str= "Supriya";
		
		char[] ch= str.toCharArray();
		
		System.out.println(ch);
		
		char [] result= new char [ch.length];
		
		int j=0;
		
		for(int i=ch.length-1;i>=0;i--)
		{
			result[j]= ch[i];
			j++;
		}
		
		System.out.println(result);
		
		
		
		//StringBuilder sb= new StringBuilder();
		
		//sb.append(str);
		
		//System.out.println(sb.reverse());
		
		
		
		

	}

}
