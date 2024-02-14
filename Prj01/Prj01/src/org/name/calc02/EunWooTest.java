package org.name.calc02;

class Parent {
	int func(int n) {
		if(n<=1)
			return n;
		return func(n-1) + func(n-2);
	}
}
class Child extends Parent {
	int func(int n) {
		if(n<=1) {
			return n;
		}
		return func(n-1) + func(n-3);
	}
}
public class EunWooTest {
	public static void main(String[] args) {
		Parent obj = new Child();
		System.out.print(obj.func(7));
	}
}
