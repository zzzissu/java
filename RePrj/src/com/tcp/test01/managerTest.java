package com.tcp.test01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class managerTest {

	public static void main(String[] args) {
		
//		BufferedTest bt = new BufferedTest();
		Scanner sc = new Scanner(System.in);

		
        while (true) {
        	System.out.println("{ 1. 회원 등록 | 2. 회원 조회 }");
        	// 고유번호, 이름, 주소, 전화번호
        	int num = sc.nextInt();
        	sc.nextLine();
        	
        	switch(num) {
        	// 1. 회원 등록
        	case 1:
        		System.out.println("이름 입력: ");
        		String name = sc.nextLine();
        		
        		System.out.println("주소 입력: ");
        		String add = sc.nextLine();
        		
        		System.out.println("전화번호 입력: ");
        		int phone = sc.nextInt();
        		sc.nextLine();
        		
        	}
        }
	}
	public static void logIn(Scanner sc) throws IOException {
        System.out.println("아이디 : ");
        String id = sc.nextLine();
        
        System.out.println("비밀번호 : ");
        String pw = sc.nextLine();
        
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
	}
}

