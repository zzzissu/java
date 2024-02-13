package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		//ok버튼 객세 챙성
		Button btnOk = new Button();
		
		//버튼 객체 생성
		//Button btn = new Button();
		
		//Ok 버튼 클릭 이벤드를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class OkListener implements Button.ClickListener {
		@Override
		public void onClick() {
			System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		//Ok 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());
		
		//Ok 버튼 클릭하기
		btnOk.click();
		
		//-----------------------------------------------
		
		//cancel 버튼 객체 생성
		Button btnCancel = new Button();		//구현 객체가 달라지면 필요 없음.
		
		//Cacel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		//btn.setClickListener(new CancelListener());
		
		//Cancel 버튼 클릭하기
		btnCancel.click();
		//btn.click();
	}
}
