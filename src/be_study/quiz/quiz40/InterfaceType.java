package be_study.quiz.quiz40;

//basecode
public class InterfaceType {
public static void main(String[] args) {
//객체 생성
	Food jokbal = new Food("족발", 19800);
	Electronics airpot = new Electronics("에어팟",199000);
	Clothing shirt = new Clothing("셔츠",49900);
//총합 계산
	int total = jokbal.discountedPrice()+airpot.discountedPrice()+shirt.discountedPrice();
//결과 출력
	System.out.println("총합 : " + total+"원");
}
}

interface Orderable {
public int discountedPrice();
}

class Food implements Orderable {
private String name;
private int price;

public Food(String name, int price) {
this.name = name;
this.price = price;
}
/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
public int discountedPrice() {

	double discountPrice=(double)price*0.1;
	price = (int) (price-discountPrice);
	return price;
}

}

class Electronics implements Orderable {
private String name;
private int price;

public Electronics(String name, int price) {
this.name = name;
this.price = price;
}
/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
public int discountedPrice() {
	double discountPrice=(double)price*0.2;
	price = (int) (price-discountPrice);
	return price;
}
}

class Clothing implements Orderable {
private String name;
private int price;

public Clothing(String name, int price) {
this.name = name;
this.price = price;
}
/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
public int discountedPrice() {
	double discountPrice=(double)price*0.3;
	price = (int) (price-discountPrice);
	return price;
}
}

