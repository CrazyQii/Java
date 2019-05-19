package topic.demo;

class Address {
	private String state;		//����
	private String province;	//ʡ
	private String city;		//��
	public Address(String state, String province, String city) {			//���췽��
		this.state = state;
		this.province = province;
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("����:" + state + "; ");
		sb.append("ʡ:" + province + "; ");
		sb.append("��:" + city);
		return sb.toString();	
	}
}

class Employees implements Cloneable {
	private String name;
	private int age;
	private Address address;
	public Employees(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
//		����StringBuilder����
		StringBuilder sb = new StringBuilder();
//		׷�����ݵ�StringBuilder��ĩβ
		sb.append("����:" + name + "\n");
		sb.append("����:" + age + "\n");
		sb.append("��ַ:" + address + "\n");
		return sb.toString();	// ��StringBuilder����ת��ΪString����
	}
	
//	ʵ��ǳ��¡
	public Employees clone() {
		Employees employee = null;
		try {
			employee = (Employees)super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("�����ܿ�¡");
		}
		return employee;
	}
}

public class Clone2 {

	public static void main(String[] args) {
		System.out.println("��¡֮ǰ:");
		Address address = new Address("�й�", "�㽭", "����");		//��������
		Employees employee1 = new Employees("����", 40, address);	//����Ա������
		System.out.println("Ա����Ϣ:");
		System.out.println(employee1);
		
		System.out.println("����֮��:");
		Employees employee2 = employee1.clone();
		System.out.println(employee2);
		employee2.getAddress().setState("�й�");
		employee2.getAddress().setProvince("����");
		employee2.getAddress().setCity("����");
		employee2.setName("����");
		employee2.setAge(18);
		System.out.println(employee2);
	}

}
