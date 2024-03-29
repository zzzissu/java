package com.abst;

public class MainClass {
	public static void main(String[] args) {
		Phone p = new Galaxy();
		System.out.println(p.getNamefacture());
		System.out.println(p.getOs());

//		Phone p1 = new Phone();		//인터페이스는 객체 생성 X
		p = new Phone() {		// 구현 클래스의 생성자가 아님. 아래와 같이 사용시 에만 가능

			@Override
			public String getNamefacture() {		// 1회용으로 사용(재사용 불가). (익명구현객체)
				return "알뜰폰";
			}

			@Override
			public String getOs() {
				return "Androide";
			}
			
		};
		p = new IPhone();
		System.out.println(p.getNamefacture());
		System.out.println(p.getOs());
		
		Galaxy g = new Galaxy();
		g.filedInfo();
	}
}
