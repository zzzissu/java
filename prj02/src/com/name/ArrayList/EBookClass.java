package com.name.ArrayList;

public class EBookClass extends BookClass {
	String Devices;		//호환기기
	
	EBookClass (String Devices) {
		this.Devices = Devices;
	}
  
	public String getDevices() {
		return Devices;
	}

	public void setDevices(String devices) {
		Devices = devices;
	}
	
	void deviceinfo() {
		System.out.printf("호환기기: %s\n", Devices);
	}
}
