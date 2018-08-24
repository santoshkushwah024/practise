package programs;

import java.util.Scanner;

public class Table {
	int i=1;
	int c;

	int table(int a) {
		if (i <= 10) {
			
			c=a*i;
			System.out.println(c);
			i++;
	}
		return table(a);
	
	}

	public static void main(String []args) {
		Table tb = new Table();
		System.out.println("Enter The Number for Table : ");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		tb.table(a);
	}
}
