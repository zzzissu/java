package thread;

class MyClass {
	private int count;

	public void increment() {
		count++;
	}

	public void decrement() {
		count--;
	}

	public void getCount() {
		System.out.println("count: " + count);
	}

}

class Thread1 implements Runnable {
	private MyClass mc;

	public Thread1(MyClass mc) {
		this.mc = mc;
	}

	@Override
	public void run() {
		mc.increment();
	}
}

class Thread2 implements Runnable {
	private MyClass mc;

	public Thread2(MyClass my) {
		this.mc = my;
	}

	@Override
	public void run() {
		mc.decrement();
	}
}

public class ThreadFour {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		 for(int i=0; i<10000; i++) {
			Thread td1 = new Thread(new Thread1(myClass));
			Thread td2 = new Thread(new Thread2(myClass));
			/*
			Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					myClass.increment();
					}
				}
			});
			
			
			*/
			
			td1.start();
			td2.start();
			try {
				td1.join();
				td2.join();
			} catch (Exception e) {
				e.printStackTrace();
		}
		 }
			
			myClass.getCount();
		}
}
//연산하는 과정에서 스레드문이 없으면 값이 중구난방으로 나옴
