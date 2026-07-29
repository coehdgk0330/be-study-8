package be_study.quiz.quiz51;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jsonString = "{"
				+ "\"employees\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\","
				+ "\"salary\": 50000,"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"김철수\","
				+ "\"position\": \"디자이너\","
				+ "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
				+ "}"
				+ "],"
				+ "\"company\": {"
				+ "\"name\": \"주식회사 ABC\","
				+ "\"address\": \"서울시 강남구\","
				+ "\"established\": \"1990-01-01\","
				+ "\"departments\": ["
				+ "{"
				+ "\"name\": \"개발부\","
				+ "\"employees\": [1, 3, 5]"
				+ "},"
				+ "{"
				+ "\"name\": \"디자인부\","
				+ "\"employees\": [2, 4]"
				+ "}"
				+ "]"
				+ "},"
				+ "\"projects\": ["
				+ "{"
				+ "\"title\": \"사내 시스템 개발\","
				+ "\"budget\": 100000,"
				+ "\"team\": [1, 3]"
				+ "},"
				+ "{"
				+ "\"title\": \"웹 디자인 프로젝트\","
				+ "\"budget\": 80000,"
				+ "\"team\": [2, 4]"
				+ "}"
				+ "]"
				+ "}";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject jsonObj = (JSONObject)parser.parse(jsonString);
			
			JSONArray emp1 = (JSONArray)jsonObj.get("employees");
			
			JSONObject info1 = (JSONObject)emp1.get(0);
			
			System.out.println(info1.get("id"));
			System.out.println(info1.get("name"));
			System.out.println(info1.get("position"));
			System.out.println(info1.get("salary"));
			
			JSONArray skill = (JSONArray)info1.get("skills");
			
			for(int i=0; i<skill.size(); i++ ) {
				System.out.println(skill.get(i));
			}
			
//			System.out.println(skill.get(0));
//			System.out.println(skill.get(1));
//			System.out.println(skill.get(2));
			
			JSONObject info2 = (JSONObject)emp1.get(1);
			
			System.out.println(info2.get("id"));
			System.out.println(info2.get("name"));
			System.out.println(info2.get("position"));
			System.out.println(info2.get("salary"));
			
			JSONArray skill2 = (JSONArray)info2.get("skills");
			
			for(int j=0; j<skill2.size(); j++ ) {
				System.out.println(skill2.get(j));
			}
			
//			System.out.println(skill2.get(0));
//			System.out.println(skill2.get(1));
			
			JSONObject cp = (JSONObject)jsonObj.get("company");
			
			System.out.println(cp.get("name"));
			System.out.println(cp.get("address"));
			System.out.println(cp.get("established"));
			
			JSONArray dp = (JSONArray)cp.get("departments");
			
			JSONObject info3 = (JSONObject)dp.get(0);
			
			System.out.println(info3.get("name"));
			
			JSONArray emp2 = (JSONArray)info3.get("employees");
			
			for(int i=0; i<emp2.size(); i++ ) {
				System.out.println(emp2.get(i));
			}
			
//			System.out.println(emp2.get(0));
//			System.out.println(emp2.get(1));
//			System.out.println(emp2.get(2));
			
			JSONObject info4 = (JSONObject)dp.get(1);
			
			System.out.println(info4.get("name"));
			
			JSONArray emp3 = (JSONArray)info4.get("employees");
			
			for(int i=0; i<emp3.size(); i++ ) {
				System.out.println(emp3.get(i));
			}
			
			JSONArray pj = (JSONArray)jsonObj.get("projects");
			
			JSONObject info5 = (JSONObject)pj.get(0);
			
			System.out.println(info5.get("title"));
			System.out.println(info5.get("budget"));
			
			JSONArray team = (JSONArray)info5.get("team");
			
			for(int i=0; i<team.size(); i++ ) {
				System.out.println(team.get(i));
			}
			
//			System.out.println(team.get(0));
//			System.out.println(team.get(1));
			
			JSONObject info6 = (JSONObject)pj.get(1);
			
			System.out.println(info6.get("title"));
			System.out.println(info6.get("budget"));
			
			JSONArray team1 = (JSONArray)info6.get("team");
			
			for(int i=0; i<team1.size(); i++ ) {
				System.out.println(team1.get(i));
			}
			
//			System.out.println(team1.get(0));
//			System.out.println(team1.get(1));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
