package core.java.controlstatements;

public class IfAndElseWith3Variables {
public static void main(String[] agrs){
	int a = 1;
	int b = 2;
	int c = 3;
	for(int i=1; i<3; i++) {
	if( a < b ){
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	if( b < c ) {
		System.out.println("True");
	}else {
		System.out.println("False");
	}
	if( a > c ){
		System.out.println("True");
	}else {
		System.out.println("False");
	}
}
}	
}
