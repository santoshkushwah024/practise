package programs;

import java.util.Scanner;

public class Fibonaci {
	public static int a = 0;
	public static int b = 1;
	public static int n;

	public void fibo(int c) {
		for (int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			
		}

	}

	public static void main(String args[]) {
		Fibonaci fb = new Fibonaci();
		System.out.println("Enter the Nuber For Fibbonacci Series : " +a);
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		fb.fibo(n);
	}
}
