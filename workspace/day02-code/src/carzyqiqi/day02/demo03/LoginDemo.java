package carzyqiqi.day02.demo03;

/*
 * ģ���û���¼���
 * 1.ע��
 * 1.1 ע�������û���������
 * 2.��¼
 * 2.1�����û��������룬��ע����û���������бȽ�
 */
import java.util.Scanner;
public class LoginDemo {
	public static void main(String[] args) {
		//ע���û���������
		Scanner sc = new Scanner(System.in);
		
		//��ʾע���û�������Ϣ
		System.out.println("������ע���û�����");
		String register_username = sc.nextLine();
		System.out.println("������ע�����룺");
		String register_pwd = sc.nextLine();
		System.out.println("ע��ɹ���");
		System.out.println("====================");
		
		int n = 0;
		do {
			//��ʾ��¼�û�������Ϣ
			System.out.println("�������û�����");
			String username = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();
			
			//��֤�û���Ϣ�Ƿ���ȷ
			//�û������Դ�Сд
			//���벻�ܺ��Դ�Сд
			if (!register_username.equalsIgnoreCase(username) || (!register_pwd.equals(pwd))) {
				if (n == 2) {
					System.out.println("���Ļ����Ѿ����꣡");
					break;
				}
				System.out.println("�û������������������µ�¼");
				n++;
				System.out.println("����ʣ�� " + (3 - n) + " �λ���");

			}
			else {
				System.out.println("��¼�ɹ���");
				break;
			} 
		} while(n < 3);
	}
}