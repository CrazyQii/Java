package crazyqiqi.day01.demo03;

//导入
import java.util.Scanner;

/*
 * 构造一个方法，键盘输入两个int数据，求其中最大值
 */
public class MethodMax {
	public static void main(String[] args) {
//		创建
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个整数：");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = sc.nextInt();
//		调用方法
		System.out.println("最大值为：" + getMax(num1, num2));
	}
	/*
	 * 构造方法： 方法名称：getMax 返回值类型：int
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
