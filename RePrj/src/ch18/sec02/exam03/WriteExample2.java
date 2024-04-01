package ch18.sec02.exam03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {
	public static void main(String[] args) {
		try {
			// 문자기반 출력 스트림 생성
			Writer write = new FileWriter("./test.txt");
			
			//1문자씩 출력
			char a = 'A';
			write.write(a);
			char b = 'B';
			write.write(b);
			
			//char 배열 출력
			char[] arr = {'C', 'D', 'E'};
			write.write(arr);
			
			//문자열 출력
			write.write("FGH");
			
			//버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
			write.flush();
			
			//출력 스트림을 닫고 메모리 해제
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
