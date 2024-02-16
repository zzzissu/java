package thread;

public class ThreadTwo extends ThreadOne {


	@Override
	public void run() {
		System.out.println(getName() + " thread Start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " thread stop");
	}

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Thread t = new ThreadTwo();
			t.start();
			//자식 스레드가 죽을때 까지 대기
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();				//try 메소드가 없으면 불규칙하게 출력됨
			}
		}
	}
}
