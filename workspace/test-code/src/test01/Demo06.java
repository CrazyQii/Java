package test01;

import java.util.Scanner;

public class Demo06 {
	public static void main(String[] args) {
		int a;
		int sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������α߳���");
		a = sc.nextInt();		
		sum = area(a);
		System.out.println("���������Ϊ��" + sum);
	}
	
	public static int area(int length) {
		return length * length;
	}

}
