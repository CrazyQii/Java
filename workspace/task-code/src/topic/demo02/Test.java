package topic.demo02;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee();		//����Ա������
		employee.setName("����");
		employee.setSalary(6000);
		employee.setBirthday(new Date());
		Manager manager = new Manager();		//�����������
		manager.setName("���");
		manager.setSalary(5000);
		manager.setBonus(8000);
		manager.setBirthday(new Date());
		System.out.println(employee);
		System.out.println(manager);
	}

}
