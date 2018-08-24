package programs;

import java.util.Scanner;

public class Reverse {
	static String name;
	public static String ulta = "";

	public void reverseString(String name) {
		for (int i = name.length() - 1; i >= 0; i--) {
			ulta = ulta + name.charAt(i);
		}
		System.out.println(ulta);

	}

	public static void main(String str[]) {
		Reverse rev = new Reverse();
		System.out.println("Enter the String: ");
		Scanner scr = new Scanner(System.in);
		name = scr.nextLine();
		rev.reverseString(name);

	}
}
