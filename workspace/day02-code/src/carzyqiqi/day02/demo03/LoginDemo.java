package carzyqiqi.day02.demo03;

/*
 * 模拟用户登录情况
 * 1.注册
 * 1.1 注册输入用户名和密码
 * 2.登录
 * 2.1输入用户名和密码，与注册的用户名密码进行比较
 */
import java.util.Scanner;
public class LoginDemo {
	public static void main(String[] args) {
		//注册用户名和密码
		Scanner sc = new Scanner(System.in);
		
		//提示注册用户输入信息
		System.out.println("请输入注册用户名：");
		String register_username = sc.nextLine();
		System.out.println("请输入注册密码：");
		String register_pwd = sc.nextLine();
		System.out.println("注册成功！");
		System.out.println("====================");
		
		int n = 0;
		do {
			//提示登录用户输入信息
			System.out.println("请输入用户名：");
			String username = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();
			
			//验证用户信息是否正确
			//用户名忽略大小写
			//密码不能忽略大小写
			if (!register_username.equalsIgnoreCase(username) || (!register_pwd.equals(pwd))) {
				if (n == 2) {
					System.out.println("您的机会已经用完！");
					break;
				}
				System.out.println("用户名或密码有误！请重新登录");
				n++;
				System.out.println("您还剩余 " + (3 - n) + " 次机会");

			}
			else {
				System.out.println("登录成功！");
				break;
			} 
		} while(n < 3);
	}
}
