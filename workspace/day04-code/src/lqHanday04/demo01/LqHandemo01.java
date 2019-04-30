package lqHanday04.demo01;

class People {
	private String name;
	private int age;
	
	//Ĭ�Ϲ��췽��
	public People() {
		name = "HanLq";
		age = 18;
		System.out.println("���ø���Ĺ��췽��");
	}
	//���ι��췽��
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void sayNowAge() {
		System.out.println(name + " �����Ѿ� " + age + " ���ˣ�");
	}
}

class Young extends People {
	public Young() {
		System.out.println("��������Ĺ��췽��");
	}
	int nowAge = 0;
	public void sayYoungAge(int years) {
		nowAge = getAge() - years;
		System.out.println(years + " ��ǰ " + getName() + " " + nowAge + " �� ");
	}
	
	public void sayNowAge() {
		//ֱ��ʹ�ø��׵ķ���
		super.sayNowAge();
		System.out.println("���� " + getName() + " " + getAge() + " �� ");
	}
}

public class LqHandemo01 {

	public static void main(String[] args) {
		People p1 = new People("qiqi", 20);
		Young y1 = new Young();
		Young y2 = new Young();
		
		p1.setAge(30);
		p1.sayNowAge();
		
		y1.setAge(25);
		y1.sayYoungAge(10);
		
		//������super�﷨
		y2.setAge(10);
		y2.sayNowAge();
		
	}

}
