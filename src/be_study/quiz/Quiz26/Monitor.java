package be_study.quiz.Quiz26;

public class Monitor {
	//필드
	String company;
	int inch;
	int price;
	String color;
	int maxScreenX;
	int maxScreenY;
	//생성자
	Monitor(){}
	
	
	
	Monitor(String company, int inch , int price){
		this.company=company;
		this.inch=inch;
		this.price=price;
	}
	
	//메소드
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	void color(String color) {
		this.color = color;
	}
	void maxScreenX(int maxScreenX) {
		this.maxScreenX = maxScreenX;
	}
	void minScreenY(int maxScreenY) {
		this.maxScreenY = maxScreenY;
	}
	

	void printInfo() {
		System.out.println(company + " " + inch+"인치 "+ price+ " " +color + " " + maxScreenX + " " + maxScreenY);
	}
	
	int sum(int price , int priceUp) {
		int sum= price+priceUp;
		return sum;
	}
	
	
	
	
}
