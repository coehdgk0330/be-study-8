package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		/*int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {

            numbers[i] = scanner.nextInt();
        }
 
        System.out.print("몇번째 수인가요? ");
        int index = scanner.nextInt();
        */
		System.out.println("5개 정수를 입력하세요:");
//		numbers[0]=scanner.nextInt();
//		numbers[1]=scanner.nextInt();
//		numbers[2]=scanner.nextInt();
//		numbers[3]=scanner.nextInt();
//		numbers[4]=scanner.nextInt();
		
        /*
        if (index >= 1 && index <= 5) {
            System.out.println(numbers[index - 1]);
        } else {
          }*/
        
        
       /* int[] numbers2 = new int[5];
        
        for (int i = 0; i < numbers2.length; i++) {
        	numbers2[i] = scanner.nextInt();
        }
        
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.print(numbers2[i] + " ");
        }*/
        
		int [][] arr= { { 1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		//값 저장
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				
				//i: 0		1		2
				//j: 0 1 2 3 0 1 2 3 0 1 2 3
				//값:
				
				
			}
		}
			
			
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d" , arr[i][j]);
				
			}
			System.out.println();
		}
	
        
	}
}
		

	
