package test01;


public class Demo08 {
	public static void main(String[] args) {
		sort(10, 8);
		sort(15.3, 12.2);

	}
	
	public static int sort(int a, int b) {
		if (a < b) {
			System.out.println(a + " ,  " + b);
		}
		else {
			System.out.println(b + " , " + a);
		}
		return 0;
	}
	
	public static double sort(double a, double b) {
		if (a < b) {
			System.out.println(a + " " + b);
		}
		else {
			System.out.println(b + " " + a);
		}
		return 0;
	}
}
