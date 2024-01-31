package ch04.sec02;

public class SwitchExample {
	public static void main(String[] args) {
		//int num = (int)(Math.random()*6) + 1;
		//System.out.printf("random: %f, num: %d\n", Math.random(), num);
		
		int num = 2;
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				//break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				//break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				//break; //'반복문'을 빠져나오는 것
				//break문을 사용하지 않으면 출력 된 값 뒤로 계속해서 출력됨
				
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				//해당되는 값에 포함되지 않으면 default는 유무 상관없음
		}
	}
}
