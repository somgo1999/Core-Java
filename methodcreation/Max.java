package core.java.methodcreation;

public class Max {
	public static void main(String[] agrs) {
		MethodForMaximum r = new MethodForMaximum();
		r.max(10, 20);
		MethodForMaximum s = new MethodForMaximum();
		int g = s.sum(10, 20);
		System.out.println(g);
	}
}
