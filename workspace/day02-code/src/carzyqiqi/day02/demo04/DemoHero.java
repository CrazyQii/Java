package carzyqiqi.day02.demo04;

//���뼯��
import java.util.ArrayList;

public class DemoHero {
	public static void main(String[] args) {
		
		//Ӣ��ʵ����
		Hero one = new Hero("���ļ�", 1000);
		Hero two = new Hero("����", 500);
		Hero three = new Hero("����", 5000);
		Hero four = new Hero("��׿", 1500);
		Hero five = new Hero("����", 2000);
		
		//�򼯺�����Ԫ��
		ArrayList<Hero> heros = new ArrayList<>();
		heros.add(one);
		heros.add(two);
		heros.add(three);
		heros.add(four);
		heros.add(five);
		
		//ѭ����������
		int sumAttack = 0;
		for (int i = 0; i < heros.size(); i++) {
			//��ȡ��ǰӢ��
			Hero hero = heros.get(i);
			sumAttack += hero.getAttack();
			System.out.println("Ӣ�ۣ�" + hero.getName() + "  ս������" + hero.getAttack());
		}
		System.out.println("ƽ��ս����Ϊ��" + sumAttack / heros.size());
		
	}
}