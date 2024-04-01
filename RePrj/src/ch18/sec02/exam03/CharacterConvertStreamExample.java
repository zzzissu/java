package ch18.sec02.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test1.txt");
		Writer write = new OutputStreamWriter(os, "UTF-8");
		write.write(str);		//출력 스트림에 사용
		write.flush();			//출력 스트림에 있는 데이터가 파일로 사용됨
		write.close();
	}
	public static String read() throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str;
	}
	
}
