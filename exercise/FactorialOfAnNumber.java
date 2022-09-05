package core.java.exercise;
public class FactorialOfAnNumber {
public static void main(String[] agrs) {
	int num = 10;
	int mult = 1;
	for(int i = 1; i <= num; i++) {
		mult = mult * i;
	}
	System.out.println(mult);
}
}
