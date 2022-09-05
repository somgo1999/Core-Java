package core.java.basics;
public class SimpleAnndCompoundInterest {
public static void main(String[] agrs) {
	int p = 100000;
	int r = 10;
	int c = 100;
	int tc = 5;
	int t = 5;
	if(t == tc) {
		int i = p * r * t / c;
		System.out.println(i);
	}
}
}
