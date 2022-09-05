package core.java.basics;
public class HollowRectangle {
public static void main(String[] agrs) {
	String[][] hr = new String[5][5];
int i;
int j;
	for(i = 1; i <= 5; i++) {
	for(j = 1; j <= 5; j++) {
	hr[i][j] = "*";
}
}
System.out.println(hr[i][j]);
}
}
