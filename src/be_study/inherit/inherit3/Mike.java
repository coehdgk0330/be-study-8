package be_study.inherit.inherit3;

public class Mike {
	
	//마이크
	String type;
	String model;
	int price;
	
	public void volumUp() {
		System.out.println("Mike volumUp()");
	}
	
	public void check() {
		System.out.println("Mike check() 기능체크");
	}
	
	//메소드 지정의 불가
	public final void noMethod() {
		System.out.println("Mike noMethod()");
	}
	//여러 메소드
	
}
