package be_study.quiz.quiz30;

public class SalaryMan {
		int salary;
		int AnnualGrass;
		SalaryMan(){}
		
		SalaryMan(int salary){
			this.salary=salary;
			}

		
		
		
		public int getAnnualGrass() {
			this.AnnualGrass=(salary*12)+(salary*5);
			return this.AnnualGrass;
		
		}
}
	




