package topic.demo02;

public class Manager extends Employee{
	private double bonus;		//����Ľ���

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("������" + name + "\n");
		sb.append("���գ�" + birthday + "\n");
		sb.append("нˮ��" + salary + "\n");
		sb.append("����:" + bonus);
		return sb.toString();
	}
}
