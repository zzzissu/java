package com.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerOne {	// 클래스를 구성하는 것 = 멤버 변수, 멤버 함수(메서드), 생성자
	static ServerSocket serverSocket = null;
	public static void main(String[]args){
	 
	System.out.println("-------------------------------------------");
	System.out.println("서버를 종류 q 또는 Q를 입력하고 Enter 키를 입력하세요");
	System.out.println("--------------------------------------------");
	
	startServer();	// 메서드 호출
	// sc: 참조변수 - 객체의 주소를 저장
	// new키워드를 통해 heap영역에 객체를 생성하고 생성된 객체의 주소를 반환한다.
	Scanner sc = new Scanner(System.in);	// heap영역에 생성
	
	while(true) {
		String key = sc.nextLine();
		if(key.toLowerCase().equals("q")) {
			break;
			}
		}
	System.out.println("프로그램을 종료합니다.");
	sc.close();	// 입력 스트림 닫기
	
	stopServer();
	}
	static void startServer() {	// 정적 멤버(클래스 멤버)로 만든다
		Thread th = new Thread() {	// 익명객체(1. 익명자식객체-상속, 2. 익명구현객체-인터페이스)
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(9000);		//포트번호 8080을 사용하는 서버 소켓(접근할 때 8080을 통해 접근하라.)
					System.out.println("서버소켓 생성");
					
					Socket clntSocket = serverSocket.accept();	// 클라이언트 소켓 생성
					System.out.println("클라이언트 소켓 생성");
					//서버소켓을 통해 접속 - 서버 소켓은 1개, 클라이언트를 생성해서 접근
					
					//서버가 클라이언트로 메세지 보내기
					DataOutputStream dos = new DataOutputStream(clntSocket.getOutputStream());
					dos.writeUTF("First my Server!!");
					dos.flush();
					
					clntSocket.close();
					System.out.print("클라이언트 소켓 종료");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		th.start();
	}
	static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("서버소켓 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}