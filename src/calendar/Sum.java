package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("두 수를 입력하세요");
	int first = sc.nextInt();
	int second = sc.nextInt();
	System.out.println("두 수의 합은 : "+(first+second));
	}
}
