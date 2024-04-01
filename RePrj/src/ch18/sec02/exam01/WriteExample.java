package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("./test1.db");
//			
//			byte a = 10;
//			byte b = 20;
//			byte c = 30;
//			
//			os.write(a);		//1byte씩 출력
//			os.write(b);
//			os.write(c);
//			
//			os.flush();			//내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
//			os.close();			//출력스트림을 닫아 사용한 메모리를 해제
			
			byte[] array = {40, 50, 60};
			
			os.write(array);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		
	}

}
