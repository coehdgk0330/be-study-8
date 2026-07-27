package be_study.quiz.quiz48;

import java.util.List;

public class Quiz48Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Quiz48MainDTO> list = Quiz48MainDAO.findStudentScoreStudno();

		for(Quiz48MainDTO dto : list ) {
			System.out.println(dto);
		}
	}

}
