package carzyqiqi.day02.demo03;

/*
 * ���Ϸ��ͱ������������ͣ������ǻ�������
 * ArrayList<����> name = new ArrayList<>();
 * �������Ҫʹ�û������ͣ���ô��Ҫʹ�û������͵İ�װ�ࣨȫ����λ��java.lang���£���8�֣�
 * 
 * ���ʹ�ô����õļ��ϣ����õķ�����������
 * 1.����Ԫ��
 * public boolean add(E element)
 * 
 * 2.��ȡԪ��
 * public E get(int index)
 * 
 * 3.��ȡ���ϳ���
 * public int size()
 */

//�������鼯��
import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[] args) {
		//������̬�ַ�������
		ArrayList<String> list = new ArrayList<>();
		//����Ԫ��
		list.add("apple");
		list.add("orange");
		list.add("banana");
		System.out.println(list);
		System.out.println("=============");
		
		//��ȡԪ��
		String name = list.get(1);
		System.out.println("�ڶ���Ԫ���ǣ�" + name);
		System.out.println("=============");
		
		//��ȡ���ϳ���
		int length = list.size();
		System.out.println("���ϵĳ�����:" + length);
		
	}
}