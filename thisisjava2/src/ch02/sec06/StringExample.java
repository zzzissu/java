package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다."; 
		//문자열이라고 해서 문장을 모두 저장할 수 없다.
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		//t는 탭키를 의미함
		System.out.println(str);
		//ln은 new line을 의미, 줄 바꾸어줌
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		// \n은 pirntln대신 줄바꿈을 할 수 있는 단축어
	}
}
