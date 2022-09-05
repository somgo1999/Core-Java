package core.java.exercise;
public class ReverseTriangle {
public static void main(String[] agrs) {
	int i;
	int j;
	for(i = 1; i <= 10; i++) {
		for(j = 10; j >= i; j--) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
}
