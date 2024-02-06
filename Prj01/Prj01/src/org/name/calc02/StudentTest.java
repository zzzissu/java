package org.name.calc02;

public class StudentTest {
	public static void main(String[] args) {
		Student st = new Student("한지수","여자","부경대", 27, 1);	//선언 순서대로 작성	//불러오는 것
		person pr = new person("한지수", "여자");
		
		st.myInfo();
		pr.myInfo();
	}
}
