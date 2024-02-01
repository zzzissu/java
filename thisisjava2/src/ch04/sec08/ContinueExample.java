package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
				//continue에 적합한 값이 나오면 중괄호 밖으로 나가지 않고 위로 올라가버림.
			}
			System.out.print(i + " ");
		}
	}
}
