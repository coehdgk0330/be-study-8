package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int cls1 [] = new int [5];
		System.out.print("1반 : ");
		for(int i=0; i<cls1.length; i++) {
			cls1[i] = scanner.nextInt();
		}
		int sum1=0;
		for(int i =0; i<cls1.length; i++) {
			sum1 += cls1[i];
		}
		
		int cls2[] = new int[5];
		System.out.print("2반 : ");
		for(int i=0; i<cls2.length; i++) {
			cls2[i] = scanner.nextInt();
		}
		int sum2=0;
		for(int i = 0; i<cls2.length; i++) {
			sum2 +=cls2[i];
		}
		
		int cls3[] = new int[5];
		System.out.print("3반 : ");
		for(int i=0; i<cls3.length; i++) {
			cls3[i] = scanner.nextInt();
		}
		int sum3=0;
		for(int i = 0; i<cls3.length; i++) {
			sum3 +=cls3[i];
		}
		
		
		
		System.out.println("1반 평균 : "+ sum1/ cls1.length);
		System.out.println("2반 평균 : "+ sum2/ cls2.length);
		System.out.println("3반 평균 : "+ sum3/ cls3.length);
		
		
		int all=sum1 + sum2 + sum3 ;
		System.out.println("전체 평균 : "+ all/15 );
		
		

	}

}
