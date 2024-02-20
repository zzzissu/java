package com.name.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Book {

	private static final String Devices = null;			//디바이스 불러오기
	private static int size;							

	public static void main(String[] args) {

		ArrayList<BookClass> bookList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("{ 1. 도서 등록 | 2. 도서 검색 | 3. 도서 삭제 | 4. 도서 확인 | 5. 도서 구입 | 0. 종료 }");
			System.out.println("----------------------------------------------------------------------");
			int num = sc.nextInt();		//사용자가 번호로 기능 선택
			sc.nextLine();
			
			switch (num) {
			//1. 도서 등록
				case 1:		
					System.out.println("책 종류 선택 {1. 전자책 | 2. 종이책 }");
					int bookNum = sc.nextInt();
					sc.nextLine();		//int 다음 스캐너 재사용
					
						if(bookNum == 1) {			//전자책
							System.out.println("전자책 호환기기: ");
							String devices = sc.nextLine();
							
							System.out.println("책 제목: ");
							String title = sc.nextLine();
							
							System.out.println("저자: ");
							String author = sc.nextLine();
							
							System.out.println("출판사: ");
							String publisher = sc.nextLine();
							
							System.out.println("가격: ");
							int price = sc.nextInt();
							sc.nextLine();
							
							EBookClass eBook = new EBookClass(Devices);
							eBook.setDevices(devices);
							eBook.setTitle(title);
							eBook.setAuthor(author);
							eBook.setPublisher(publisher);
							eBook.setPrice(price);
							
							bookList.add(eBook);		//책 정보 입력 및 저장
							
						} else if(bookNum == 2) {		//종이책
							System.out.println("종이 책 페이지 수: ");
							int size = sc.nextInt();
							sc.nextLine();
							
							System.out.println("책 제목: ");
							String title = sc.nextLine();
							
							System.out.println("저자: ");
							String author = sc.nextLine();
							
							System.out.println("출판사: ");
							String publisher = sc.nextLine();
							
							System.out.println("가격: ");
							int price = sc.nextInt();
							sc.nextLine();
							
							PaperBookClass pBook = new PaperBookClass(size);
							pBook.setSize(size);
							pBook.setTitle(title);
							pBook.setAuthor(author);
							pBook.setPublisher(publisher);
							pBook.setPrice(price);
							
							bookList.add(pBook);
						} 
						break;
						  
			//2. 도서 검색  
				case 2:		
					System.out.println("도서 검색(제목 및 저자): ");
					String search = sc.nextLine();
					for(BookClass book : bookList) {
						if(book.getTitle().equals(search) || book.getAuthor().equals(search)) {
							System.out.println("검색 결과: " + book);
						}
					}
					break;
					
			//3. 도서 삭제
				case 3:		
					System.out.println("도서 삭제(제목 입력): ");
					String del = sc.nextLine();
					for(BookClass book : bookList) {
						if(book.getTitle().equals(del)) {
							bookList.remove(book);
							System.out.println("삭제 완료");
							break;
						}
					}
					break;
			//4. 도서 확인
				case 4:
					System.out.println("현재 등록되어 있는 도서: ");
					for(BookClass book : bookList) {
						System.out.println(book + "\n가(이) 등록되어 있습니다.");
					}
					break;
					
			//5. 도서 구입
				case 5:
					System.out.println("구매할 책 제목: ");
					String purchase = sc.nextLine();
					System.out.println("구매할 책 종류: 1. eBook | 2. paperBook");
					int num2 = sc.nextInt();
					sc.nextLine();
					
					for(BookClass book : bookList) {
						if(book.getTitle().equals(purchase)) {
							String bookType = (num2 == 1) ? "전자책" : (num2 == 2) ? "종이책" : "다시 선택해주세요.";
							if(num2 == 1 || num2 == 2) {
								int totalPrice = (int) (book.getPrice()*1.1);
								System.out.printf("구매내용: '%s'(책분류: %s, 가격(tax포함): %d원)책을 구매하셨습니다.\n", book.getTitle(), bookType, totalPrice);
							}
//							if(num2 == 1) {
//								for(int i=0; i<bookList.size(); i++) {
//								System.out.printf("구매 내용: '%s'(책분류: 전자책, 가격(tax포함): %d)책을 구매 하셨습니다.\n", bookList.get(i).getTitle(), (int)(bookList.get(i).getPrice()*1.1));
//								}
//							} else if(num2 == 2) {
//								for(int i=0; i<bookList.size(); i++) {
//								System.out.printf("구매 내용: '%s'(책분류: 종이책, 가격(tax포함): %d)책을 구매 하셨습니다.\n", bookList.get(i).getTitle(), (int)(bookList.get(i).getPrice()*1.1));
//								}
//							} else {
//								System.out.println("다시 선택해주세요.");
//							}
//							
						}
					}
					break;
					
			//0. 종료
				case 0:
					System.out.println("도서 관리 프로그램을 종료하시겠습니까?(Y/N)");
					String exit = sc.nextLine();
					if(exit.equals("Y")) {
						System.out.println("도서 관리 프로그램을 종료합니다.");
						sc.close();
						System.exit(0);
					} else if(exit.equals("y")) {
						System.out.println("도서 관리 프로그램을 종료합니다.");
						sc.close();
						System.exit(0); 
					} else if(exit.equals("N")) {
						System.out.println("프로그램을 재시작합니다.");
					} else if(exit.equals("n")) {
						System.out.println("프로그램을 재시작합니다.");
					}
					break;
			}
		}
	}
}
