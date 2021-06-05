package Test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(UCLN(a,b));
		

	}
	public static int UCLN(int a, int b) {
		if(a < 0) {
			a *= -1;
		}
		if(b < 0) {
			b *=-1;
		}
		if((a != 0 || b!= 0) && (a <= 1000 && b <= 1000)){
			if(b == 0) {
				return a;
			}
		}
		return UCLN(b, a %b);
		
	}
}
