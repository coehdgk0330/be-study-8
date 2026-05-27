package be_study.quiz.quiz30;

public class StudentMain {

	public static void main(String[] args) {
//		Student s = new Student("컴퓨터",26);
		Student s = new Student("컴퓨터");
		Student i = new Student(26);
		
		System.out.println("학과 : " + s.getDepartment());
		System.out.println("학번 : " + i.getStudentId());
	}

}
