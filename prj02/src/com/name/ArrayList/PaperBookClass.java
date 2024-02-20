package com.name.ArrayList;

public class PaperBookClass extends BookClass {
	int size;
	
	PaperBookClass(int size) {
		this.size = size;
	}
  
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	void sizeinfo() {
		System.out.printf("책 페이지 수: %d\n", size);
	}
}
