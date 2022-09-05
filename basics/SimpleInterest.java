package core.java.basics;

public class SimpleInterest {
public static void main(String[] agrs) {
	int p = 1000;
	int r = 10;
	int t = 10;
	int c = 100;
	int i = p * r * t / c;
	int a = p + i;
	System.out.println("p is principal amount = " + p);
	System.out.println("r is rate of interest = " + r);
	System.out.println("t is time in years = " + t);
	System.out.println("i is interest = " + i);
	System.out.println("a is amount = " + a);			
}
}
