package topic.demo;

import java.util.Scanner;

public class CelsiusConverter {

	public static void main(String[] args) {
		System.out.println("������Ҫת�����¶ȣ�");
//		������Ϣ
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
//		��������������Ķ���
		CelsiusConverter converter = new CelsiusConverter();
//		ͨ��������÷���
		double Fahrenheit = converter.getFahrenheit(celsius);
		System.out.println("ת����ɵ��¶ȣ� "+ Fahrenheit);
	}

	
	// getFahrenheit()���������϶�ת���ɻ��϶�
	public double getFahrenheit(double celsius) {
		double fahrenheit = 1.8 * celsius + 32;
		return fahrenheit;
	}
}
