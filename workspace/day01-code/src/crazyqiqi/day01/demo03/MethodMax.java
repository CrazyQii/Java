package crazyqiqi.day01.demo03;

//����
import java.util.Scanner;

/*
 * ����һ��������������������int���ݣ����������ֵ
 */
public class MethodMax {
	public static void main(String[] args) {
//		����
		Scanner sc = new Scanner(System.in);

		System.out.println("�������һ��������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ���������");
		int num2 = sc.nextInt();
//		���÷���
		System.out.println("���ֵΪ��" + getMax(num1, num2));
	}
	/*
	 * ���췽���� �������ƣ�getMax ����ֵ���ͣ�int
	 */
	public static int getMax(int a, int b) {
//		int max = 0;
//		if (a >= b) {
//			max = a;
//		}
//		else {
//			max = b;
//		}
//		return max;
		if (a > b) {
			return a;
		}
		else return b;
	}
}