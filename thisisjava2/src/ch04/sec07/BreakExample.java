package ch04.sec07;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			//6까지의 수를 랜덤으로 돌리기
			System.out.println(num);
			if(num == 6) {
				//6이라는 수가 나온다면 프로그램 종료
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
