package core.java.exercise14;
public class PalindromeNumber12 {
public static void main(String[] agrs) {
	int num = 1122332211;
	int n = num;
	int sum = 0;
	int r = 0;
	while(num != 0) {
		r = num % 10;
		num = num / 10;
		sum = (sum * 10) + r;
	}
	if(sum == n) {
		System.out.println("The given number is an Palindrome Number = " + n);
	}else {
		System.out.println("The given number is not an Palindrome Number");
	}
}
}
 