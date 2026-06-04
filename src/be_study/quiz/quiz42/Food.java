package be_study.quiz.quiz42;

public class Food {
	
	String name;
	int price;
	int stock;
	
	//public Food(){}  // new Food()
	
	public Food(String name, int price) {
		this.name=name;
		this.price=price;
		this.stock=0;//초기화
		
		//this.stock =5; //임의로 5개로 고정
	}
	
	public Food(String name, int price, int stock) {
		this.name=name;
		this.price=price;
		this.stock=stock; //재고가 저해진 상태로 시작
	}
	
	//재고 세팅(설정) //기본 Setter 역할
	
	//1. 정해진 값으로 세팅
	public void setStock(int stock) {
		this.stock=stock;
	}
	
	//2. 재고 조정/변경
	//주문-> 재고 -1
	//재료준비 -> 재고 UP -> 재고 +5
	
	//upStock downStock
	public void modifyStock(int count) {
		if( stock + count < 0) {
		stock = 0;
		}else {
			this.stock +=count;
		}
		
	}
	
	
	//Food 자체 정보를 정리해서 String 반환
	//public String toString() {
	public String getFoodInfo() {
		return String.format("%s %d원 (잔여재고:%d)", name, price, stock);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
