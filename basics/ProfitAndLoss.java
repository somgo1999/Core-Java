package core.java.basics;

public class ProfitAndLoss {
public static void main(String[] agrs) {
	int cp = 1000;
	int sp = 100;
	int c = 100;
	int p = sp - cp;
	int l = cp - sp;
	int P = p * c / cp;
	int L = l * c / cp;
	if( cp < sp ) {
		System.out.println(p);
		System.out.println(P+"%");
	}else {
		System.out.println(l);
		System.out.println(L+"%");
	}
	//System.out.println("cp is the cost price");
	//System.out.println("sp is the selling price");
	//System.out.println("p is the profit");
	//System.out.println("l is the loss");
	//System.out.println("P is the profit percentage");
	//System.out.println("L is the loss percentage");
	}
}
