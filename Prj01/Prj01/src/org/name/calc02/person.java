package org.name.calc02;

public class person {
	
	public String name;
	public String gender;
	
	
	public person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	void myInfo() {
		System.out.println(gender + " " + name + "입니다.");
		//나의 이름은 ㅇㅇㅇ이고 여자 입니다		//오버라이딩해서 
	}
}
