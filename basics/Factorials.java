package core.java.basics;
public class Factorials {
public static void main(String agrs) {
	int num = 10;
	int i;
	int j = 1;
	for(i = 1; i <= num; i++) {
		 j = j * i;
		System.out.println(j);
	}
	System.out.println(j);
}
}
