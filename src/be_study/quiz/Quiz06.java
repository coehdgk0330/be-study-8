package be_study.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		// TODO Auto-generated method stub
		//1.
			System.out.print("삼각형의 밑변 입력 : ");
			int width1 = scanner.nextInt();
			System.out.print("삼각형의 높이 입력 : ");
			int height1 = scanner.nextInt();
			
			System.out.println("삼각형의 넓이는 : " + ((double)width1*height1/2));
			
		//2.
			double a2 = 12.32;
			double b2 = 3.321;
			double c2 = 5.712;
			System.out.println("사다리꼴의 넓이 = " + (a2+b2)*c2/2);
		//3
			int a3 = 100;
			int b3 = 24;
			System.out.println("받는 갯수 : " + (a3/b3));
			System.out.println("남는 갯수 : " + (a3%b3));
		//4.
			System.out.print("세자리의 정수를 입력하세요 : ");
			int num = scanner.nextInt();
			
			System.out.println("백의자리 : " + (num/100)); 
			System.out.println("십의자리 : " + (num/10%10));
			System.out.println("일의자리 : " + (num%10));
			
			
			
		//5.
			int x = 10;
			int y = 20;
			System.out.println("x="+x+ " y="+y);
			//x와 y를 바꾼 작업
			int z = x;
			x = y;
			y = z;
			System.out.println("x="+x+ " y="+y);
			
	}

}
