package carzyqiqi.day02.demo04;

//导入集合
import java.util.ArrayList;

public class DemoHero {
	public static void main(String[] args) {
		
		//英雄实例化
		Hero one = new Hero("蔡文姬", 1000);
		Hero two = new Hero("貂蝉", 500);
		Hero three = new Hero("吕布", 5000);
		Hero four = new Hero("董卓", 1500);
		Hero five = new Hero("赵云", 2000);
		
		//向集合添加元素
		ArrayList<Hero> heros = new ArrayList<>();
		heros.add(one);
		heros.add(two);
		heros.add(three);
		heros.add(four);
		heros.add(five);
		
		//循环遍历集合
		int sumAttack = 0;
		for (int i = 0; i < heros.size(); i++) {
			//获取当前英雄
			Hero hero = heros.get(i);
			sumAttack += hero.getAttack();
			System.out.println("英雄：" + hero.getName() + "  战斗力：" + hero.getAttack());
		}
		System.out.println("平均战斗力为：" + sumAttack / heros.size());
		
	}
}
