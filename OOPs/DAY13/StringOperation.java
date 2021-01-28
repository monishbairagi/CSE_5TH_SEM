import java.lang.String;

public class StringOperation{
	public static void main(String[] args){
		// Using new keyword
		System.out.println("\nUsing new keyword");
		System.out.println("------------------------------");
		String s = new String("Monish Bairagi");
		System.out.println("s = "+s);
		System.out.println("s.length() = "+s.length());
		System.out.println("s.substring(0,6) = "+s.substring(0,6));
		System.out.println("s.replace('Bairagi','Pandey') = "+s.replace("Bairagi","Pandey"));
		System.out.println("s.charAt(7) = "+s.charAt(7));
		s = new String("    Monish Bairagi");
		System.out.println("s = "+s);
		System.out.println("s.trim() = "+s.trim());
		
		// Useing String literal
		System.out.println("\nUseing String literal");
		System.out.println("------------------------------");
		String s1 = "MONISH";
		String s2 = "monish";
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s1.compareTo(s2) = "+s1.compareTo(s2));
		System.out.println("s1.equals(s2) = "+s1.equals(s2));
		System.out.println("s1.concat(s2) = "+s1.concat(s2));
		System.out.println("s2.toUpperCase() = "+s2.toUpperCase());
		System.out.println("s1.toLowerCase() = "+s1.toLowerCase());
		System.out.println();
	}
}