package crazyqiqi.day02.demo01;

/*
 * ����һ��������������
 * 1.����
 * �����Ҫʹ�õ�Ŀ����͵�ǰ��(����main����)����ͬһ��������ľͲ���Ҫ����
 * 2.����
 * 3.ʹ��
 */

public class MyPhone01 {
	public static void main(String[] args) {
		//��������ʵ����
		//������  ������  = new ������()
		Phone p1 = new Phone();
		
		//��p1�����Ը�ֵ
		p1.brand = "Apple";
		p1.price = 8899;
		p1.color = "black";
		p1.size = "large";
		
		//��p1�ķ������ݲ���
		p1.call("hlq");
		p1.watchVideo();
		p1.listenMusic("���С��");
		
	}
}
