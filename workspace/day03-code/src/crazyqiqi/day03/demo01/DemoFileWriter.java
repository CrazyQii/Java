package crazyqiqi.day03.demo01;

/*
 * д���ļ�
 * ������д���ļ����У�������FileWriter��
 * 1.����
 * import java.io.FileWriter;
 * 
 * 2.����
 * public FileWriter(String FileName); �����ַ������ļ�·������
 * FileWriter fw = new FileWriter("flie01.txt");
 * 
 * 3.ʹ��
 * 3.1д���� 
 * public void write(String str)��������д���ļ����е��ַ���
 * 3.2�ر���
 * public void close() �رգ��ͷ������Դ
 *
 */

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
	public static void main(String[] args) throws IOException {
		//1.����FileWriter����
		FileWriter fw = new FileWriter("file01.txt", true);
		
		//2.����write����д����
		fw.write("������\n");
		
		//3.�ر��ļ�
		fw.close();
	}
}
