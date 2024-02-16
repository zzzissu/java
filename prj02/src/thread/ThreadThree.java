package thread;

public class ThreadThree implements Runnable{		//인터페이스로 받는다는 의미

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Thread Start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " Thread stop");
	}
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Runnable r = new ThreadThree();		//구현객체 생성
			Thread td = new Thread(r);			//스레드 객체 생성
			//Thread td = new Thread(new ThreadThree());
			
			td.start();
			try {
				td.join();
			} catch (Exception e) {
				e.printStackTrace();
		}
	}

}
}
