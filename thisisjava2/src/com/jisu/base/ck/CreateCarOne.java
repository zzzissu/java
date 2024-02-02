package com.jisu.base.ck;

class Carone {
	String kind = "세단";
	String modelName; // = "테슬라"; 클래스에서 바로 정의를 하면 값의 오류가 남
	String carColor;
	int carYear;
}
public class CreateCarOne {
	public static void main(String[] args) {
		Carone c = new Carone();
		Carone c1 = new Carone();
		
		System.out.println(c.kind);
		System.out.println(c1.kind);
	}
}
