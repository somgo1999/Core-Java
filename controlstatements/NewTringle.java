package core.java.controlstatements;

public class NewTringle {
	public static void main(String[] agrs) {
		int i;
		int j;
		for (i = 1; i < 10; i++) {
			System.out.println("hello");
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
