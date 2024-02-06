package ch06.sec14;

public class Car {
	//필드 선언
	private int speed;
	private boolean stop;
	
	//speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
		this.speed = 0;
		return;
	} else {
		this.speed = speed;
		}
	}
	//stop 필드의 Getter/Setter 선언
	public boolean isStop() {	//boolean타입의 경우 get/set이 아닌 is로 시작
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
