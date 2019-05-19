package topic.demo02;

import java.util.Date;

public class Employee {
	protected String name;		//Ա������
	protected double salary;		//Ա������
	protected Date birthday;		//Ա������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("������" + name + "\n");
		sb.append("���գ�" + birthday + "\n");
		sb.append("нˮ��" + salary + "\n");
		return sb.toString();
	}
}
