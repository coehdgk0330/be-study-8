package be_study.quiz.Quiz26;

import java.util.Scanner;

public class MonitorMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		m1.powerOn();
		m1.company="삼성";
		m1.inch=27;
		m1.price=150000;
		m1.color="검정색";
		m1.maxScreenX=1080;
		m1.maxScreenY=780;
		
		System.out.println(m1.company+ " " + m1.inch + "인치 " + m1.price + " " +m1.color);
		
		m2.company="LG";
		m2.inch=32;
		m2.price=330000;
		m2.color="흰색";
		m2.maxScreenX=4096;
		m2.maxScreenY=2048;
		
		System.out.println(m2.company+ " " + m2.inch + "인치 " + m2.price);
		
		System.out.println(m1.maxScreenX + " * " + m1.maxScreenY);
		System.out.println(m2.color + "," +m2.maxScreenX + " * " + m2.maxScreenY);
		
		m1.printInfo();
		m2.printInfo();
		int priceUp = scanner.nextInt();
		int result=m2.sum(m2.price,priceUp);
		
		
		m2.price=result;
		
		m1.printInfo();
		m2.printInfo();
		
		
		
		
		
		
		
	}

}
