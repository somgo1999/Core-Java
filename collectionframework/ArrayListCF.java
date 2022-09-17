package core.java.collectionframework;

import java.util.*;

public class ArrayListCF {
	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add("Ram");
		a.add("Shyam");
		a.add("Ramesh");
		a.add("Suresh");
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a);
		System.out.println(a.iterator());
		a.remove("Ram");
		System.out.println(a);
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}
}
