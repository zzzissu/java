package com.abst;

class Base {
	int bNum;
	
	Base(int num) {
		bNum = num;
	}
}
class Drived extends Base {
	int dNum;
	
	Drived(int num, int num2) {
		super(num);
		dNum = num2;
	}
	void printField() {
		System.out.printf("bNum: %d, dNum: %d\n", bNum, dNum);
	}
}


public class inhEx {

	public static void main(String[] args) {
		Drived d = new Drived(10, 20);
		d.printField();
		
	}

}
