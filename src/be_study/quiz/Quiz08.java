package be_study.quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year=scanner.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int backNum=scanner.nextInt();
		
		int age=(2027-year);
		
		if ( 2000 > year && 1 == backNum ) {
			System.out.println( age+"살 남자입니다.");
		} else if ( 2000 > year && 2 == backNum) {
			System.out.println( age+"살 여자입니다." );
		} else if ( 2000 <= year && 3 == backNum) {
			System.out.println(  age+"살 남자입니다.");
		} else if ( 2000 <= year && 4 == backNum) {
			System.out.println( age+"살 여자입니다.");
		} else if ( year > 2027 || backNum > 4) {
			System.out.println("잘못된 입력");
		} else {
			System.out.println("잘못된 입력");
		}
		

	}

}
