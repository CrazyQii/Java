package test01;

//����
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������������֣�");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b) {
			System.out.println("�ϴ������Ϊ��" + a);
		} else {
			System.out.println("�ϴ������Ϊ��" + b);
		}
		System.out.println("����������õ��ϴ������Ϊ��" + (a > b ? a : b));
	}
}
