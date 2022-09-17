package core.java.exercise14;

public class LargestNumberInArrray15 {
	public static void main(String[] args) {

		int[] row = { 10, 2, 43, 14, 85, 68, 76, 83, 9, 110 };
		for (int i = 0; i < row.length; i++) {
			int a;
			int b;
			for (a = 0; a < row.length; a++) {
				for (b = row.length; b < 0; b--) {
				}
				if (row[a] > row[b]) {
					System.out.println(row[a]);
				} else {
					System.out.println("..");
				}
			}
		}
	}
}
