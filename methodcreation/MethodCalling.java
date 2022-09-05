package core.java.methodcreation;

public class MethodCalling {
	public static void main(String[] agrs) {
		MethodMaking m = new MethodMaking();
		m.max(100, 200);
		m.min(100, 200);
		int add = m.sum(100, 200);
		System.out.println(add);
		int sub = m.subtraction(100, 200);
		System.out.println(sub);
		int mul = m.multiplication(100, 200);
		System.out.println(mul);
		double div = m.division(100, 200);
		System.out.println(div);
	}
}
