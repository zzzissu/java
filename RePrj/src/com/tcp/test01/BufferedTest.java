package com.tcp.test01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedTest {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("{1. 로그인 | 2. 회원가입 | 3. 종료 }");
            System.out.println("번호 입력>>");
            int num = sc.nextInt();
            sc.nextLine(); // int다음 입력 초기화

            if (num == 1) {
            // 1. 로그인
                logIn(sc);
            } else if (num == 2) {
            // 2. 회원가입
                signUp(sc);
            } else if (num == 3) {
            // 3. 종료
                System.out.println("프로그램이 종료되었습니다.");
                break;
            } else {
                System.out.println("번호를 다시 입력하세요.");
            }
        }
        sc.close();	//입력 더이상 받지 않음
    }

    public static void logIn(Scanner sc) throws IOException {
        System.out.println("아이디 : ");
        String id = sc.nextLine();
        
        System.out.println("비밀번호 : ");
        String pw = sc.nextLine();

        // 파일에 입력된 사용자 정보와 일치하는지 확인
        try (BufferedReader rd = new BufferedReader(new FileReader("./join.txt"))) {
            String input;
            while ((input = rd.readLine()) != null) {			// 더이상 정보가 없을때까지 한줄씩 읽어옴. 
                String[] parts = input.split("/");	// 아이디, 비번 구분하기 위해
                if (parts.length == 2 && parts[0].equals(id) && parts[1].equals(pw)) {
                    System.out.println("로그인 되었습니다.");
                    return;
                }
            }
        }
        System.out.println("회원 정보가 없거나, 아이디 또는 비밀번호가 일치하지 않습니다.");
    }

    private static void signUp(Scanner sc) throws IOException {
        System.out.println("회원가입 할 아이디 : ");
        String id = sc.nextLine();
        System.out.println("회원가입 할 비밀번호 : ");
        String pw = sc.nextLine();

        // 회원가입 정보를 파일에 저장(true = 파일을 이어쓰기 모드로 열기)
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("./join.txt", true))) {
            wr.write(id + "/" + pw);
            wr.newLine();
        }

        System.out.println("회원가입이 완료되었습니다.");
	}
    
    private static void member(Scanner sc, String input) throws IOException {
    	
    	System.out.println("회원 정보를 입력하세요.");
    	System.out.println("이름 입력: ");
		String name = sc.nextLine();
		
		System.out.println("주소 입력: ");
		String add = sc.nextLine();
		
		System.out.println("전화번호 입력: ");
		int phone = sc.nextInt();
		sc.nextLine();
		
//		int memNum;
//		for(memNum=1000; memNum<=999999; memNum++;) {
//			}
//		}
		
		try (BufferedWriter wr = new BufferedWriter(new FileWriter("./join.txt", true))) {
//            wr.write(id + "/" + pw);
            wr.newLine();
    }
}
