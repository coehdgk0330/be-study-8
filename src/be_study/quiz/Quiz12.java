package be_study.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("연도를 입력하세요. : ");
		int year =scanner.nextInt();
		if (year % 4 == 0 && !(year % 100 == 0)||year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("윤년 아님");
		}
	}

}
