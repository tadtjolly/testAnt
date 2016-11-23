package testAnt;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args){
		System.out.println("hello tuấn anh đẹp trai");
		System.out.println("nhập vào 2 số a b");
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập vào a");
		int a = scan.nextInt();
		System.out.println("nhập vào b");
		int b = scan.nextInt();
		int sum = a + b;
		System.out.println("tổng = " + sum);
	}
}
