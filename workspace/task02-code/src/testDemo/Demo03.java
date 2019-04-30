package testDemo;

//���ࣺ�����
class Computer {
	protected int price;

	Computer() {
		this.price = 100;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showPrice() {
		System.out.println("������ļ۸�" + this.getPrice());
	}
}

//���ࣺDesktop
class Desktop extends Computer{
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showPrice() {
		System.out.println("̨ʽ���ļ۸��ǣ�" + this.getPrice());
	}
}

//���ࣺNotebook
class Notebook extends Computer {
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showPrice() {
		System.out.println("�ʼǱ��ļ۸��ǣ�" + this.getPrice());
	}
}

public class Demo03 {
	public static void main(String[] args) {
		Desktop dt1 = new Desktop();
		dt1.setPrice(500);
		dt1.showPrice();
		
		Notebook nt1 = new Notebook();
		nt1.setPrice(1000);
		nt1.showPrice();
	}
}
