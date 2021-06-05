package Test;

import java.util.ArrayList;


public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> t = new ArrayList<>();
		
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		
		a.add("a");
		a.add("b");
		a.add("c");
		b.add("a");
		b.add("b");
		b.add("c");
		c.add("a");
		c.add("b");
		c.add("c");
		
		t.addAll(a);
		t.addAll(b);
		t.addAll(c);
		System.out.println(t);
		
	}
}
