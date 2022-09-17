package core.java.constructorcalling;

public class Implicit {
	public Implicit() {
	}

	public Implicit(int a, int b) {
		int add = a + b;
		System.out.println(add);
		System.out.println("This is 2 parameterised constructor of Implicit Class");
	}

	public Implicit(int a, int b, int c) {
		this(a, b);
		int bdd = a + b + c;
		System.out.println(bdd);
		System.out.println("This is 3 parameterised constructor of Implicit Class");
	}

	public static void main(String[] args) {
		Implicit i = new Implicit(1, 2, 3);

	}
}
