package be_study.quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//1번

		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.

		//입력에 따른 출력 예시
		
		int hour = scanner.nextInt();
		if( hour >= 1 && hour <=6 ) { 
			System.out.println("이른 오전입니다.");
		}  else if ( hour > 6 && hour <= 12 ) {
			System.out.println("늦은 오전입니다.");
		} else if ( hour > 12 && hour <= 18 ) {
			System.out.println("이른 오후입니다.");
		} else if ( hour > 18 && hour <= 24 ) {
			System.out.println("늦은 오후입니다.");
		} else {
			System.out.println("잘못입력했습니다.");
		} 
		
		//2번 아래 코드를 if문으로 변경

		//int diceNum = 5; //주사위 수 1~6
		int diceNum = scanner.nextInt();

		// if문 변환
		if ( diceNum == 1) {
			System.out.println(1);}
		if ( diceNum == 2) {
			System.out.println(2);}
		if ( diceNum == 3) {
			System.out.println(3);}
			{System.out.println(4);}
		if ( diceNum == 4) {
			System.out.println(4);}
		if ( diceNum == 5) {
			System.out.println(5);}
		if ( diceNum == 6) {
			System.out.println(6);}	
		//3번 아래 코드를 swtich 문으로 변경

		String localNum = "051";
		// switch 문으로 변경
		switch(localNum) {
		case "031": 
		System.out.println("경기도입니다.");
		break;
		case "02" :
		System.out.println("서울입니다.");
		break;
		case "041" :
		System.out.println("충남입니다.");
		break; 
		case "051" :
		System.out.println("부산입니다.");
		
		//4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다.
		int score =69;
		switch( score / 10 ) {
		case 10 : 
		case 9 :
			System.out.println("학점 A");
		break;
		case 8 : 
			System.out.println("학점 B");
		break;
		case 7 : 
			System.out.println("학점 C");
		break;
		default :
			System.out.println("학점 F");
		
		}
		
		
		
		
		
		
		
		}
		
		
		}
}

		

	


