package com.name.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Book {
	
	public void Input(String title, String author, int price, String publisher) {
		//도서 등록
		System.out.printf("책 제목: %s, 저자: %s, 가격: %d, 출판사: %s", title, author, price, publisher);
	}
		//도서 검색
	public void search(String title, String author, int price, String publisher) {
		
	}
	
	public static void main(String[] args) {
		//1. 도서등록
//		BookClass bc1 = new BookClass("홍길동전", "홍길동", 12000, "부경출판사");
//		BookClass bc2 = new BookClass("춘향전", "춘향이", 15000, "부경출판사");
//		BookClass bc3 = new BookClass("심청전", "심청이", 17000, "부경출판사");
		Scanner sc = new Scanner(System.in);
		List<BookClass> list = new ArrayList<>();
		
		
			while (true) {
			
		}
	}
}
