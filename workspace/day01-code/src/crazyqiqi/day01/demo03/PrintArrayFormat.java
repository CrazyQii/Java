package crazyqiqi.day01.demo03;

/*
 * ��ָ����ʽ������飺[10, 20, 30, 40, 50]
 */

public class PrintArrayFormat {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 100 };
		arrayFormat(array);
	}
	/*
	 * ���췽����
	 * ��������arrayFormat
	 * ����ֵ����
	 * ������array
	 */
	public static void arrayFormat(int[] array) {
		int i;
		System.out.print("[");
		for (i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[array.length - 1] + "]");
	}
}
