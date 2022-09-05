package core.java.prachimamquestions;

public class OddEvenNumber {
	public void oddEven(int oe) {
		if (oe % 2 == 0) {
			System.out.println("The given number is an Even Number = " + oe);
		} else {
			System.out.println("The given number is an Odd Number = " + oe);
		}
	}

	public static void main(String[] agrs) {
		OddEvenNumber oen = new OddEvenNumber();
		oen.oddEven(20);
	}
}
