package com.abst;

class Coffee {
	int price;
	String name;
	
	public Coffee(int price, String name) {
		this.price = price;
		this.name = name;
	}
}
class Americano extends Coffee {

	@Override
	public String toString() {
		return super.toString();		// name 변수 선언을 하지 않고 toString으로 이름 지정 가능
	}

	public Americano() {
		super(5000, "아메리카노");
	}
}

class Hazelnet extends Coffee {
	
	@Override
	public String toString() {
		return super.toString();
	}

	public Hazelnet() {
		super(5500, "헤이즐넛");
	}
}

class Latte extends Coffee {
	
	@Override
	public String toString() {
		return super.toString();
	}

	public Latte() {
		super(5500, "라떼");
	}
}

class Vanilla extends Coffee {
	
	@Override
	public String toString() {
		return super.toString();
	}

	public Vanilla() {
		super(6000, "바닐라라떼");
	}
}

class Customer {
	int money = 300000;
	void buyCoffee(Coffee coffee) {
		if (money < coffee.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money = money - coffee.price;
		System.out.printf("%s(을)를 %d원에 구입하셨습니다.잔액은 %d원 입니다.\n", coffee.name, coffee.price, money);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.buyCoffee(new Americano());
		c.buyCoffee(new Hazelnet());
		c.buyCoffee(new Latte());
		c.buyCoffee(new Vanilla());
		
		System.out.printf("커피를 구입하고 남은 총 잔액은 %d원 입니다.\n", c.money);
	}

}
