package programs;

import java.util.Scanner;

public class FiboRecur {
	public static int a = 0;
	public static int b = 1;
	public static int c;
	int i = 0;
	int fib(int n) {
	
		if (i <= n) {
			System.out.println(c);
			c = a + b;
			a = b;
			b = c;
		}
		return fib(n);

	}

	public static void main(String[] args) {
		FiboRecur fi = new FiboRecur();
		System.out.println(" Enter the Number : ");
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		fi.fib(n);

	}
}
