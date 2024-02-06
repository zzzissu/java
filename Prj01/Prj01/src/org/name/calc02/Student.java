package org.name.calc02;

public class Student extends person {
	int age; //나이
	String school; //학교
	int grade; //학년
	
	
	public Student(String name, String gender, String school, int age, int grade) {
		super(name, gender);
		this.school = school;
		this.age = age;
		this.grade = grade;

	}
	void myInfo() {
		System.out.println("나는 " + school + "학교 " + grade + "학년에 다니는 " + age + "살, 성별은 " + gender + " 이름은 " + name + "입니다.");
		System.out.printf("나는 %s학교 %d학년에 다니는 %d살, 성별은 %s이고 이름은 %s입니다.", school, grade, age, gender, name);
	}
	//나는 ㅇㅇ학교 ㅇ학년에 다니는 ㅇ살 여자 한지수입니다		//이게 출력
}
