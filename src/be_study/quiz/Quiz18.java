package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		/*for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
			System.out.print("*");
			
			}
			System.out.println();
		} */
		
		/*for(int i=4; i>=1; i--) {
			for(int j=4; j>=i; j--) {
			System.out.print("*");
			
			}
			System.out.println();
		}*/
		/*int num =scanner.nextInt();
		for(int i =1; i <=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
			}*/
		/*int num = scanner.nextInt();
		for(int i = num ; i>0; i--) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
			}
		for(int i=1; i<=num; i++) {
			for(int j=(num-1); j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		int totalSum = 0; 

        for (int i = 1; i <= 10; i++) {       // 1부터 10까지 (항의 개수)
            int sum = 0;          // 각 괄호 안의 합계
            
            for (int j = 1; j <= i; j++) {    // 각 항 내에서 1부터 i까지 더함
                sum += j;
            }
            
            totalSum += sum;}
        System.out.println(totalSum);
		
		
		
		} 
	}

