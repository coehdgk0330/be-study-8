package be_study.quiz.quiz30;

public class Student {
		//필드
		private String Department;
		private int StudentId;
		//생성자
		Student(){}
		
//		Student(String Department, int StudentId){
//			this.Department=Department;
//			this.StudentId=StudentId;
//			System.out.println("학과 : " + Department); 
//			System.out.println("학번 : "+ StudentId);
//		}
		
		
		Student(String Department){
			this.Department=Department;
		}
		
		Student(int StudentId){
			this.StudentId=StudentId;
		}
		
		public String getDepartment() {
			return this.Department;
		}
		
		
		public void setDepartment(String Department) {
			this.Department=Department;
		}
		
		public int getStudentId() {
			return this.StudentId;
		}
		
		
		public void setStudentId(int StudentId) {
			this.StudentId=StudentId;
		}
		
		
		
		
		
		
		
		//메소드
}
