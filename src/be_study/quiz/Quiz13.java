package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		
	/*	System.out.print("정수를 입력하세요 : ");
		int num1 =scanner.nextInt();
		if(num1% 2 == 0)
		{
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		*/
		
	/*	System.out.print("정수를 입력하세요 : ");
		int num2 =scanner.nextInt();
		if(num2%7==0) {
			System.out.println("7의 배수입니다");
		}else {
			System.out.println("아닙니다");
		} */
		
		
		
	/*  int num3 = 0;
		for (int i = 1; i <= 1000; i++) {
		    if (i % 5 == 0) {
		        num3 += i;
		    }
		}
		System.out.println(num3); */
		
		
		
	/*	System.out.print("입력 : ");
		int num4 =scanner.nextInt();
		if(num4<1 || num4>50) {
			
		}else {
			System.out.print("결과 : ");
		
		for(int i=0; i<num4; i++) {
			System.out.print("*");
		} */
		
	 	/*int sum = 0;
		for(int i=1; i<=10; i++) {
			
			if(i%2 == 0) {
				sum = sum - i;
			} else {
				sum = sum + i;
			}*/
		
	//	}
		//System.out.println("최종 결과 : " + sum);
		 
//	sum = sum + (i%2 == 0 ? -i : i);
		
	/*	int sum= 0;
		for(int i=1; i<=1000; i++) {
			
			if(sum < 1000) {
				sum=sum + i;
			}else {
				break;
			}
		}
			System.out.println("1000이 넘어간 시점에 누적 합 : " + sum); */
			
		/*	sum=0;
			int i = 1;
			
			while(sum<1000) {
				sum = sum + 1;
				i = i +1; */
//			}
//			System.out.println("1000이 넘어간 시점에 누적 합 : " + sum);
//			sum = sum + i;
//			if(sum>1000) {
//				break;
//			
//		}
		
		
			System.out.print("1~9까지 중 보고싶은 구구단은? : ");
			int num = scanner.nextInt();
			
			for(int j=1; j<=9; j++) {
				System.out.printf("%2d * %2d = %2d\n", num, j,(num*j) );
				
			}
	}
	
	
	


}
