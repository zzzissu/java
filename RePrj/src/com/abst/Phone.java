package com.abst;
//인터페이스 -> 구현클래스 > 구현객체 생성
public interface Phone {
	public static final int version = 10;	//상수필드
	String getNamefacture();	//추상메서드
	String getOs();				//추상메서드 cf.추상클래스
}

class IPhone implements Phone {

	@Override
	public String getNamefacture() {
		return "Apple";
	}

	@Override
	public String getOs() {
		return "MacOs";
	}
	void filedInfo() {
		System.out.println(version);
	}
}

class Galaxy implements Phone {

	@Override
	public String getNamefacture() {
		return "Samsung";
	}

	@Override
	public String getOs() {
		return "Androide";
	}	
	void filedInfo() {
		System.out.println(version);
	}
}
