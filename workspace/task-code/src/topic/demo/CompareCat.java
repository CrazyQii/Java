package topic.demo;

class Cat{
	private String name;	// è������
	private int age;		// è������
	private double weight;	// è������
	private String color;	// è����ɫ
	
//	��ʼ��è������
	public Cat(String name, int age, double weight, String color) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	
//	������д�����������ж�è�Ƿ�һ��
	public boolean equals(Object obj) {
		if(this == obj) {	//�������һ�����򷵻���ȷ
			return true;
		}
		if(obj == null) {	//�������Ϊ�գ��򷵻ش���
			return false;
		}
		if(getClass() != this.getClass()) {		//���è������Ͳ�ͬ��ͬ
			return false;
		}
		Cat cat = (Cat)obj;		//ǿ������ת��
		return name.equals(cat.name) && (age == cat.age) && (weight == cat.weight) && (color.equals(cat.color));
	}
	
//	������д��toString����
	public String toString() {
//		����StringBuilder����
		StringBuilder sb = new StringBuilder();
//		׷�����ݵ�StringBuilder��ĩβ
		sb.append("����:" + name + "\n");
		sb.append("����:" + age + "\n");
		sb.append("����:" + weight + "\n");
		sb.append("��ɫ:" + color + "\n");
		return sb.toString();	// ��StringBuilder����ת��ΪString����
	}
}

public  class CompareCat {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Java", 18, 50, "black");
		Cat cat2 = new Cat("PHP", 15, 100, "white");
		Cat cat3 = new Cat("HTML", 23, 70, "pink");
		System.out.println("1��è" + cat1);
		System.out.println("2��è" + cat2);
		System.out.println("3��è" + cat3);
		System.out.println("1��è��3��è�ıȽϣ�" + cat1.equals(cat3));
		System.out.println("2��è��3��è�ıȽϣ�" + cat2.equals(cat3));
		System.out.println("1��è��2��è�ıȽϣ�" + cat1.equals(cat2));
	}
}
