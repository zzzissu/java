package ch18.sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("src/ch18/sec02/exam03/ReadLineExample.java")
		);
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		
		br.close();
	}

}
