package crazyqiqi.day01.demo02;
//�����鵱������ֵ
public class Demo01Array {
	public static void main(String[] args) {
		//��������һ������
		int[] Array = new int[] {10, 20, 10, 15, 23, 99, 56, 45};
		//��ȡ����ĳ���
		int length = Array.length;
		//��������е����ֵ
		int i, max = Array[0], min = Array[0];
		for (i = 1; i < length; i++) {
			if (Array[i] >= max) {
				max = Array[i];
			}
			if (Array[i] <= min) {
				min = Array[i];
			}
		}
		System.out.println("����ֵΪ��" + max);
		System.out.println("��С��ֵΪ��" + min);
	}
}
