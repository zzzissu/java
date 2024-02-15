package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		//Toolkit toolkit = toolkit.getDefaultToolkit();
		for(int i=1; i<5; i++) {
			//toolkit.beep();
			System.out.println(i);
			try {Thread.sleep(500);
			} catch(Exception e) {
				//catch(InterruptedException e) {}
				//e.printStackTrace();
			} 
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);
			} catch(Exception e) {}			//{Thread.sleep(500);} 0.5초간 일시 정지
		}
	}
}
