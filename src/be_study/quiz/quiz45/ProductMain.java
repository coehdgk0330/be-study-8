package be_study.quiz.quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import be_study.db.v1.Dept;



public class ProductMain {

	public static void main(String[] args) {
			findProduct();
			
			List<Product> ProductList = findProductList();
			
			if(ProductList.size() == 0) {
				System.out.println("데이터가없다");
			}else {
				for(Product p : ProductList) {
					System.out.println(p.toString());
				}
			}
			if (ProductList != null &&ProductList.size()>0 ) {
				
			}
		

	}	
	
	public static void findProduct() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB 연결 정보
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		
		//db 연결, 실행 객체
		Connection conn = null; //db연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from product ";
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) { //다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
				

				// column 이름(별칭) 기준 조회
				System.out.print( rs.getInt("p_code")+ " ");
				System.out.print( rs.getString("p_name")+ " ");
				System.out.println( rs.getString("p_price") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

}
	
public static List<Product> findProductList() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB 연결 정보
		
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		
		//db 연결, 실행 객체
		Connection conn = null; //db연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		
		//DB 연결
		
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//실행할 쿼리 준비
		String sqlQuery = " select * from product ";
		
		List<Product> ProductList = null;
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) { //다음에 읽어올 데이터(행단위)가 있는가? true 다음 데이터가 있다
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
				
				// 데이터가 있다.
				
				// 한줄 조회 한 행 데이터
				// 한 행 데이터 -> Dept 객체 저장
				// List<Dept>  .add(Dept)
				
				// column 이름(별칭) 기준 조회
				Product product = new Product();
				
				product.setP_code(rs.getInt("p_code") );
				product.setP_name(rs.getString("p_name") );
				product.setP_price(rs.getInt("p_price") );
				
				if(ProductList == null) {
					ProductList = new ArrayList<>();
				}
				ProductList.add(product);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ProductList;
}
}
