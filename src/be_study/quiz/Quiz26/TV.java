package be_study.quiz.Quiz26;

public class TV {
	//필드
	String company;
	int year;
	int inch;
	//생성자
	TV() {}
	
	TV(String company, int year , int inch){
		this.company=company;
		this.year=year;
		this.inch=inch;
		
	
	}
	void show() {
		System.out.println(company+"제품 "+year+"년형 "+ inch+"인치 TV");
	}
}
