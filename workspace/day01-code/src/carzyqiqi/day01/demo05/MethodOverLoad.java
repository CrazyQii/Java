package carzyqiqi.day01.demo05;

/* 
 * �������أ�
 * ��һ�����ж�����ͬ���ķ������������Ĳ���������ͬ
 * �������ص�ע������
 * 1.�βεĸ�����ͬ
 * 2.�βε��������Ͳ�ͬ
 * 3.�βε�λ�ò�ͬ                                                                                                                                                                                                                                                                                                                                       
*/
public class MethodOverLoad {
	public static void main(String[] args) {
		System.out.println(sum(4, 5));
		System.out.println(sum(78, 56.0));
		System.out.println(sum(4, 2, 6));
		
	}
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}                                                             
	public static double sum(int a, double b) {
		return a + b;
	}
}
