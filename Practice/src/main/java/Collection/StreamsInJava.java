package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava {

	public static void main(String[] args) {

     List<Integer> list= Arrays.asList(3,45,56,76,87,48);
     
     System.out.println(list);
     
     list.stream().map(x -> x*4).forEach(x -> System.out.println(x));
     
     List<Integer> List2= list.stream().map(x -> x/4).collect(Collectors.toList());
     
     System.out.println(List2);
     
     List<String> list3= Arrays.asList("ahgs","fdgfdg","sdfdg");
     
     list3.stream().filter(x -> x.startsWith("f")).forEach(x -> System.out.println(x));
     
     
     list3.stream().sorted().forEach(x -> System.out.println(x));
     
     list3= list3.stream().sorted().collect(Collectors.toList());
     
     List<String> list4 = list3.reversed();
     
     System.out.println(list4);
     
     

	}

}
