package be_study.quiz.Quiz25;

public class monitor {
	
		//필드
		int inch;
		String company;
		String model;
		//생성자
		monitor(){}
		
		monitor( String company, String model,int inch){
		
		
		this.company=company;
		this.model=model;
		this.inch=inch;
		}
		//메소드

		
		
		void printInfo(){
			System.out.print("제조사:"+company+" 모델명:"+model+" 인치:"+inch+"인치");
			
			
		}
		
}
