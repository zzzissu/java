package com.jisu.base.ck;

class Super{					//부모클래스
	String superField;

	public void getSuperField() {
		System.out.println("Super " + superField);
	}

	public void setSuperField(String superField) {
		this.superField = superField;
	}
	public void overrideMethod() {
		System.out.println("나는 슈퍼 메서드");
	}
}
class Sub extends Super {			//자식클래스
	String subField;
	
	public void getsubField() {
		System.out.println("subfield " + subField);
	}
	
	public void setsubField(String subField) {
		this.subField = subField;
	}
	@Override
	public void overrideMethod() {
		System.out.println("나는 서버 메서드");
	}
}

public class UpcastingClass {

	public static void main(String[] args) {
		Super s = new Sub();	//부모타입 참조변수가 자식객체를 가리킨다.(업캐스팅)
		s.setSuperField("Parent"); 		//부모 타입과 같은 타입만 접근 가능
		s.getSuperField();
		// s.setsubField("child");		//타입이 부모타입으로 바뀌었기 때문에 자식객체 멤버에는 접근 불가
		s.overrideMethod();
		
		Sub sub = (Sub) s;
		sub.setsubField("Child");
		sub.getsubField();
		sub.getSuperField();
		
	}

}
