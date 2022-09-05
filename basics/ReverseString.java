package core.java.basics;

public class ReverseString {
	public static void main(String[] agrs) {

		String[] s = { "Vijay", "Dinanath", "Chouhan" };

		for (int i = 0; i < s.length; i++) {

			for (int j = s[i].length() - 1; j >= 0; j--) {

				System.out.print(s[i].charAt(j));

			}

			System.out.print(" ");
		}
	}
}
