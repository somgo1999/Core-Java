package core.java.prachimamquestions;

public class Diamond {
	public static void main(String[] agrs) {
		int a;
		int b;
		int c;
		for (a = 1; a <= 50; a++) {
			for (b = 50; b >= a; b--) {
				System.out.print(" ");
			}
			for (c = 1; c <= a; c++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (a = 1; a <= 49; a++) {
			for (b = 2; b >= a; b++) {
				System.out.print(" ");
			}
			for (c = 49; c >= a; c--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
