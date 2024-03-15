package chapter;

import java.util.Scanner;
/*
 * 2024.03.15
 * 컴퓨터학과
 * 손패택
 * 
 */

public class DataTypeOper {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 ; ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 정수 입력 ; ");
		int num2 = stdIn.nextInt();

		// TODO 自动生成的方法存根
double avg1 = (num1 +num2) / 2;
System.out.println("정수 인싱 ; " + num1 + " + " +num2 + " = " + avg1);
	}

}
