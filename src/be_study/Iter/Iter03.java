package be_study.Iter;

public class Iter03 {

	public static void main(String[] args) {
		
		// 반복문 중첩
		
		// 삼항 ? (참) : (거짓)
		// 삼항 ? (참) : ( 삼항 ? (참) : (거짓))
		
		//if()
		//if() {
		//	 if()
		// }
		
		//i: 1
		for(int i=1; i<=5; i++) {
			
			//실행문
			System.out.println("for i 실행문 : " + i );
			
			// j:1 2 3 | 4
			for(int j=1; j<=3; j++) {
				System.out.println("내부 for j 실행문 : " + j);
			}
			
			System.out.println("---for i 실행문 한싸이클 종료 ---");
		}

		
		//밖으로 나옴
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=2; k++) {
					//실행문 i j k  변수 활용
					
					
				}
			}
		}
		
		// 방 3개 청소
		// 		3번 쓸기
		//		2번 닦기
		//		1번 쓰레기 정리
		
		for(int i=1; i<=3; i++) {
			
			System.out.println(i + "번 방 청소");
			
			
			for(int j=1; j<=3; j++) {
				System.out.println("쓸기");
			}
			
			int k=1;
			while(k<=2) {
				System.out.println("닦기");
				k++;
			}
			 {
				System.out.println("쓰레기정리");
				
			}
		}
		
	}

}
