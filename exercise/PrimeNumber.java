package core.java.exercise;
public class PrimeNumber {
public static void main(String[] agrs){
	int num = 100;
	int count = 0;
	for(int i = 2; i < num; i++) {
		if(num % i == 0) {
			System.out.println("Not Prime Number = " + i);
		count++;
	}
	}
	if(count == 0) {
		System.out.println("Prime Number = " + num);
	}
}
}
