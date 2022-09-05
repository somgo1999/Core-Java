package core.java.basics;

public class StringPractice {
	public static void main(String[] agrs){
		String name = "Ram Manohar Goswami";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.indexOf("i"));
		System.out.println(name.indexOf("Mano"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.replace("a", "b"));
		System.out.println(name.replaceAll("a", "b"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Ram"));
		System.out.println(name.endsWith("ami"));
		System.out.println(name.substring(6));
	}
}
