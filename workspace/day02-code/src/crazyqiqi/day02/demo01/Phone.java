package crazyqiqi.day02.demo01;

/*����һ���࣬����ģ���ֻ�����
 * 
 * �ֻ����������������
 * ���ԣ�Ʒ�ơ��۸���ɫ����С
 * ��Ϊ����绰������Ƶ��������
 * 
 * ��Ӧ������
 * ��Ա������
 * 		String brand
 * 		double price
 * 		String color
 * 		String size
 * ��Ա������
 * 		public void call(String who) {}
 * 		public void watchVideo() {}
 * 		public void listenMusic(String which) {}
 */

public class Phone {
	
	//��Ա����
	String brand;
	double price;
	String color;
	String size;
	
	//��Ա����
	public void call(String who) {
		System.out.println("���ڸ�" + who + "��绰��");
	}
	public void watchVideo() {
		System.out.println("�ҿ��Կ����Ӿ磡");
	}
	public void listenMusic(String music) {
		System.out.println("�ҿ�����" + music + "����");
	}
}
