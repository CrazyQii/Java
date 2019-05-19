package topic.demo05;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3, "����", 21));
		list.add(new Employee(2, "����", 30));
		list.add(new Employee(1, "����", 15));
		System.out.println("����ǰ:");
		for(Employee employee: list) {
			System.out.println(employee);
		}
		System.out.println("�����:");
		Collections.sort(list);		//�Զ�����
		for(Employee employee: list) {
			System.out.println(employee);
		}
	}
}
