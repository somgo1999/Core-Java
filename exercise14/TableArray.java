package core.java.exercise14;

public class TableArray {
	public static void main(String[] args) {
		int[][] table = new int[9][10];
		table[0][0] = 1;
		table[0][1] = 2;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
