package carzyqiqi.day02.demo04;

/*
 * ����һ��Ӣ�۶���
 * ��Ա����������������ս���� 
 */

public class Hero {
	private String name; 	//����
	private int attack; 	//ս����
	
	//���췽�������ط���
	public Hero() {
		
	}
	public Hero(String name, int attack) {
		this.name = name;
		this.attack = attack;
	}
	
	//��ȡӢ����Ϣ
	public String getName() {
		return name;
	}
	public int getAttack() {
		return attack;
	}
	
	//����Ӣ����Ϣ
	public void setName(String name) {
		this.name = name;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
}
