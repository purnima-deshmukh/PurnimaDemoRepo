import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class basicStreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		streamFilter();
		streamMap();
	}
		
	public static void streamFilter() {
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Abhijeet");
		names.add("Ram");
		names.add("Ayush");
		names.add("Ashish");
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.print(c);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
	
	public static void streamMap() {
		
		//prints the names ending with h in uppercase
		Stream.of("Abhijeet","Ram","Ayush","Ashish").filter(s->s.endsWith("h")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));;
		
		//converting arraylist to list
		List<String> names=Arrays.asList("Abhijeet","Ram","Ayush","Ashish");
		
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
	}
}
