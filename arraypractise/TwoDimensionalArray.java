package core.java.arraypractise;

public class TwoDimensionalArray {
public static void main(String [] agrs){
	int [][] table = new int [11][11];
for(int i = 1; i < table.length; i++) {
	for(int j = 1; j < table.length; j++) {
		table[i][j] = i*j;
	System.out.println(table);
	}
}	
}
}