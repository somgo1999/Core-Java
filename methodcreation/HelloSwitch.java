package core.java.methodcreation;

public class HelloSwitch {
public static void main(String[] agrs) {
	int size = agrs.length;
	switch(size) {
	case 0 : System.out.println("Usage: java HelloAll1 n1 n2 n3..");
	break;
	case 1: System.out.println("Hello  " + agrs[0]); break;
	default:
		for(int i = 0; i<size; i++){
			System.out.println(i + "= Hello  " + agrs[i]);
		}
	}
}
}
