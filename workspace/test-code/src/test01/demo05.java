package test01;

//����
import java.util.Scanner;

public class demo05 {
	public static void main(String[] args) {
		int n, i;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int flag = 1;
			System.out.println("������һ�����֣�");
			n = sc.nextInt();
			if (n == 1) break;
			if (n < 0 || n > 1000) {
				System.out.print("���ݴ���");
				break;
			}
			for (i = 0; i < n; i++) {
				if (n % 9 == 0) {
					flag = 0;
					System.out.println("���� " + n + " �ܱ�9����");
					break;
				}
			}
			if (flag == 1) {
				System.out.println("���� " + n + " ���ܱ�9����");
			}
		}
	}
}