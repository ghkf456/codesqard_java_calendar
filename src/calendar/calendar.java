package calendar;

import java.util.Scanner;

public class calendar {
	
	/*1 - 31 
	2 - 28
	3 - 31
	4 - 30
	5 - 31
	6 - 30
	7 - 31
	8 - 31
	9 - 30
	10 - 31
	11 - 30
	12 - 31*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] month ={0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		
		System.out.println("달을 입력하세요");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("0월은 없습니다.");
		}
		else if (input > 12) {
			System.out.println("정확한 달을 입력하세요.");
		}
		else
		System.out.println(input+"월은 "+month[input]+"일까지 있습니다.");
		
		sc.close();

	}
}
