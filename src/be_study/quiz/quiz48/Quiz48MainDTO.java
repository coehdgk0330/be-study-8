package be_study.quiz.quiz48;

public class Quiz48MainDTO {
	
	
	//student
	int studno;
	String name;
	//score
	int score;
	//hakjum
	String grade;
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentDTO [studno=" + studno + ", name=" + name + ", score=" + score + ", grade=" + grade + "]";
	}
	
	
}