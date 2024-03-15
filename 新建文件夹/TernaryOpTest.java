package chapter;

import java.util.Scanner;

/*
 * 2024.03.15
 * 손패택
 */
public class TernaryOpTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Scanner stdIn = new Scanner(System.in);

System.out.print("점수 입력 : ");
int num = stdIn.nextInt();

boolean result;
result = (num % 2 == 0) ? true : false;

System.out.print(num + "은 짝수입니까?");
System.out.println(result);
	}

}
