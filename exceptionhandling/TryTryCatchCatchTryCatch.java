package core.java.exceptionhandling;

public class TryTryCatchCatchTryCatch {
	public static void main(String[] args) {
		try {
			try {
				String name = "name";
				System.out.println(name.charAt(10));
			} catch (NullPointerException e) {
				System.out.println("No value found  " + e.getMessage());
			}
		} catch (NullPointerException e1) {
			System.out.println(e1.getMessage());
try {
	
}
		}
	}
}
