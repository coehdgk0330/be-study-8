package be_study.quiz.quiz30;

public class Computer {
	//4.
//	다음을 만족하는 클래스 Computer를 작성하시오.
//	· 다음을 상수 필드로 선언
//	public … String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
//	· 다음과 같은 클래스 Computer의 객체의 사용 결과에 적합하도록 생성
//	자와 메소드 구현


//		public String[] osType = {"윈도우10", "애플 OS X","안드로이드"};
//		 public static String[] osType = {"윈도우10", "애플 OS X","안드로이드"};
//		 public final String[] osType = {"윈도우10", "애플 OS X","안드로이드"};
	
	 	public static final String[] osType = {"윈도우10", "애플 OS X","안드로이드"};
		  
		int index;	// 0 1 2  ostype 에 사용할 인덱스
		int memory;	// 16 32 16 메인메모리 값
		
		public Computer(int index, int memory) {
			this.index = index;
			this.memory = memory;
		}
		
		public void print() {
			System.out.printf("운영체제: %s, 메인메모리: %d\n", osType[index], memory);
		}
	
}

