package com.jisu.base;

public class MainTest1 {
	public static void main(String[] args) {
		System.out.printf("args.length: %d\n", args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
