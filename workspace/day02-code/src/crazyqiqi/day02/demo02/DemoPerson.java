package crazyqiqi.day02.demo02;

public class DemoPerson {
	public static void main(String[] args) {
		Person p1 = new Person(18, "������");	//����ʵ����
		
		p1.setAge(20); //�ı�����age��ֵ
		p1.setName("�����");	//�ı�name��ֵ
		System.out.println("�ҽ�" + p1.getName() + ", " + "�ҵ������ǣ�" + p1.getAge());
	}
}
