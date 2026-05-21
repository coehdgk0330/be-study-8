package be_study.quiz.Quiz25;

public class monitorMain {

	public static void main(String[] args) {
		monitor m1 = new monitor();
		monitor m2 = new monitor();
		
		
		
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치", "삼성","더프레임",65);
		System.out.println();
		
		m2.company="LG";
		m2.model="올레드";
		m2.inch=80;
		m2.printInfo();		

	}

}
