package topic.demo;

class Employee {
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	��дtoString����
	public String toString() {
		return "������" + this.name + "\n���䣺" + this.age + "��";
	}
}


public class Clone1 {

	public static void main(String[] args) {
		System.out.println("��¡ǰ��");
		Employee employee1 = new Employee();		//��������
		employee1.setName("����");
		employee1.setAge(25);
		System.out.println("Ա����Ϣ��");
		System.out.println(employee1);
		
		
		System.out.println("��¡��");
		Employee employee2 = employee1;
		System.out.println("Ա����Ϣ��");
		System.out.println(employee2);
		
		System.out.println("��¡�޸ĺ�:");
		employee2.setAge(66);
		employee2.setName("����");
		System.out.println("Ա����Ϣ��");
		System.out.println("employee1:" + employee1);
		System.out.println("employee2:" + employee2);
	}

}
