package be_study.random;

import java.util.Random;

public class Rand01 {

	public static void main(String[] args) {
		
		
		//난수 ( 랜덤값 ) 뽑기
		
		//Math.random()  0 <= 랜덤값 < 1 
		
		//(int)(Math.random()*갯수 (범위)) + 시작숫자
		
		//1~10 랜덤
		//(int)(Math.random()*10) + 1
		
		//35~45 랜덤
		//(int)(Math.random()*11) +35
		
		/*
		 	랜덤값 0~1		*10		(int)		+1
		 	0.012			0.12	  0			1
		 	0.1234			1.234
		 	0.25
		 	0.3353
		 	0.4225
		 	...
		 	0.898
		 	0.9982
		 */
		
		// 35~45 랜덤
				// (int)(Math.random()*11) + 35
		/*
		for(int i=1; i<=10; i++) {
			System.out.println(Math.random());
		}
		for(int i=1; i<=10; i++) {
			System.out.println((int)(Math.random()*10) +1);
		}
		for(int i=1; i<=10; i++) {
			System.out.println((int)(Math.random()*50) +1);	
		}
		for(int i=1; i<=10; i++) {
			System.out.println((int)(Math.random()*100) +1);
		}
		for(int i=1; i<=10; i++) {
			System.out.println((int)(Math.random()*21) +1);
	}*/
		
		Random random = new Random();
		
		System.out.println(random.nextInt(10));
		System.out.println(random.nextInt(10)+1);
		System.out.println(random.nextInt(6)+10);
		System.out.println(random.nextInt(10,16));


}
}
