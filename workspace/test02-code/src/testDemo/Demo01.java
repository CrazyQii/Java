package testDemo;

class Rectangle {
	double px;
	double py;
	double qx;
	double qy;
	
//	Ĭ�Ϲ��췽��
	Rectangle() {
		px = 0;
		py = 0;
		qx = 0;
		qy = 0;
	}	
	
	Rectangle(double px, double py, double qx, double qy) {
		this.px = px;
		this.py = py;
		this.qx = qx;
		this.qy = qy;
	}
	
	public void setPx(double px) {
		this.px = px;
	}
	
	public double getPx() {
		return px;
	}
	
	public void setPy(double py) {
		this.py = py;
	}
	
	public double getPy() {
		return py;
	}
	
	public double getQx() {
		return qx;
	}

	public void setQx(double qx) {
		this.qx = qx;
	}

	public double getQy() {
		return qy;
	}

	public void setQy(double qy) {
		this.qy = qy;
	}

	public double getArea(double px, double py, double qx, double qy) {
		double Area;
		Area = (qy - py) * (qx - px);
		return Area;
	}
	
	public double getCircle(double px, double py, double qx, double qy) {
		double cicle;
		cicle = ((qy - py) + (qx - px)) * 2;
		return cicle;
	}
}

public class Demo01 {
	public static void main(String[] args) {
		double Area;
		double length;
		
//		Ĭ�Ϲ��췽��
		Rectangle r1 = new Rectangle();
		r1.setPx(2.1);
		r1.setPy(3.2);
		r1.setQx(5.2);
		r1.setQy(6.3);
		Area = r1.getArea(r1.getPx(), r1.getPy(), r1.getQx(), r1.getQy());
		length = r1.getCircle(r1.getPx(), r1.getPy(), r1.getQx(), r1.getQy());
		System.out.println("Ĭ�Ϸ����ľ��������" + Area + "  �����ܳ���" + length);
		
//		�������Ĺ��췽��
		Rectangle r2 = new Rectangle(1, 2, 6.8, 10.5);
		Area = r2.getArea(r2.getPx(), r2.getPy(), r2.getQx(), r2.getQy());
		length = r1.getCircle(r2.getPx(), r2.getPy(), r2.getQx(), r2.getQy());
		System.out.println("���в��������ľ��������" + Area + "�����ܳ���" + length);
	}
}
