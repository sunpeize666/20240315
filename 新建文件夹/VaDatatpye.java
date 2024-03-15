package chapter;

public class VaDatatpye {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
final int Max = 100;
final double PI = 3.14;

int r = 5;
double Pi = 3.14159;
String name = "손패택"; 
char blood = 'A';
//char blood1 = 'AB';
System.out.println("원주윤은 " + PI + "입니다.");
System.out.println("원주윤은 " + Pi + "입니다.");



System.out.println("반지름니" + r + "임 원위 넓이는 " + r * r);


double area = r*r*Pi;
System.out.println("반지름이 " + r + "임 원의 넓이는 " + area);

area = r * r * PI;
System.out.printf("반지름이 %d임 원위 넓이는 %f입니다. \n", r ,area);
	}

}
