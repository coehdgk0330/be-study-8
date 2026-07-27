package be_study.quiz.quiz48;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Quiz48MainDAO {

	public static List<Quiz48MainDTO> findStudentScoreStudno() {

		// db 연결, 실행 객체
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		// 실행할 쿼리 준비
		//String sqlQuery = " select * from student ";
		String sqlQuery = "SELECT s.studno 학번, s.name 이름, sc.total 점수, h.grade 학점 "
                + "FROM student s, score sc, hakjum h "
                + "WHERE s.studno = sc.studno "
                + "  AND sc.total BETWEEN h.min_point AND h.max_point "
                + " and sc.total > 70 "
                + " and s.deptno1 = 101 ";
				

		List<Quiz48MainDTO>list = new ArrayList<>();

		// 쿼리 실행, 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			
			rs = psmt.executeQuery();

			while (rs.next()) { // 다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다

				Quiz48MainDTO q48DTO = new Quiz48MainDTO();
				
				q48DTO.setStudno( rs.getInt("학번") );
				q48DTO.setName(rs.getString("이름"));
				q48DTO.setScore(rs.getInt("점수"));
				q48DTO.setGrade(rs.getString("학점"));
				
				list.add(q48DTO);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return list;
	}
	
}

