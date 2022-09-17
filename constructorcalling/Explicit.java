package core.java.constructorcalling;

public class Explicit extends Implicit {
	public Explicit() {
	}

	public Explicit(int a, int b, int c) {
		super(a, b);
		int d = a + b + c;
		System.out.println(d);
		System.out.println("This is 2 parameterised constructor of Explicit Class");
	}

	public static void main(String[] args) {
		Explicit e = new Explicit(1, 2, 10);

	}
}
