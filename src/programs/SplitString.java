package programs;

import java.util.Scanner;

public class SplitString {

	public void splitStr(String name) {
		String[] Rev = name.split(" ");
		for (int i = Rev.length - 1; i >= 0; i--) {
			System.out.print(Rev[i]+" ");
		}
	}

	public static void main(String str[]) {
		SplitString rev = new SplitString();
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		rev.splitStr(name);
	}
}
