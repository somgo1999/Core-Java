package core.java.controlstatements;

public class ReverseTriangle {
public static void main(String[] agrs){
	int i;
	int j;
	for(i = 10; i > 0; i--) {
		for(j = 1; j < i; j++) {
			System.out.print(j + "  ");
		}
		System.out.println();
	}
}
}
