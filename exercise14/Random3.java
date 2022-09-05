package core.java.exercise14;

import java.util.Random;

public class Random3 {
	public static void main(String[] agrs) {
		for (int i = 1; i <= 5; i++) {
			int random = (int) (Math.random() * 100);
			System.out.println(random);
		}
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			int ran = r.nextInt(100);
			System.out.println(ran);
		}
	}
}