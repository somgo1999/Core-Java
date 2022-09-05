package core.java.basics;

public class Diamond {
	public static void main(String[] agrs) {
		int i;
		int j;
		int k;
		for (i = 1; i <= 10; i++) {
			for (j = 10; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (i = 1; i <= 10; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (k = 9; k >= i; k--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}