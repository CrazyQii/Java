package crazyqiqi.day03.demo01;

import java.io.FileReader;
import java.io.IOException;

public class Demo02FileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file02.txt");
		
		//��ȡ�ļ�����һ�����ֵ�ASCIIֵ
		int ch = fr.read();
		System.out.println(ch);
		
		//��ȡ�ļ�����������
		while((ch = fr.read()) != -1) {
			System.out.println(ch);
		}
		fr.close();
	}

}
