package be_study.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz23_lv1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random = new Random();
		
		
		int mem1=random.nextInt(10)+1;
		int []kg=new int [1];
		
		System.out.print("엘리베이터 무게 : ");
		int evKg = scanner.nextInt();
		System.out.print("정원 : ");
		int mem = scanner.nextInt();
		System.out.print(" 탑승 인원 : " + mem1);
		
		for(int j=1; j<mem1; j++) {
			System.out.print("인원 무게 : "); 
			System.out.print((int)(Math.random()*111) +39+ " ");
		if(j>evKg) {
			System.out.println();
		}
		}
		
		System.out.println();
		System.out.print("멈출수 있는 횟수 : ");
		int stop = scanner.nextInt();
		
		
		
		System.out.print("내리는 층 : ");
		
		int[] ev = new int [100];
		for(int i=1; i<ev.length; i++) {
			
			ev[i]=scanner.nextInt();
			
			System.out.println("현재 층 : " + ev[i]);
		
		if(ev[i]==100) {
			
			System.out.println("현재 층 : 1 ");
		
		
		}else {
		
		}
		if(stop==i) {
			System.out.print(" 점검 중 정지 ");
			break;
		}
		
		
			
		
		
		for(int s =stop; s==0; s--) {
			System.out.println("점검 중");
		}
		
		for(int j=1; j<=10; j++) {
			System.out.println((int)(Math.random()*10) +1);
		}
		
		}
	}
}

		

		
	
