package crazyqiqi.day02.demo02;

/*
 *  ���췽����
 *  public ����(�������� ��ʽ����) {
 *  	û��return
 *  	û�з���ֵ��û�����η�
 *  }
 * 
 */
public class Person {
	
	//��Ա����
	private int age;
	private String name;
	
	public Person(int age, String name) {	//�����вη���----��ʼ������
		this.age = age;
		this.name = name;
	}
	
	public void setAge(int age) {	//���÷�������������age
		if (age < 0 || age > 200) {
			System.out.println("��������");
		} else {
			this.age = age;
		}
	}
	
	public int getAge() {	 //��ȡ������һ�����ڶ�ȡage
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {	//��ȡ������һ�����ڶ�ȡname
		return name;
	}
	
}
