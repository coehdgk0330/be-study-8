package be_study.refer;

public class Refer02 {

	public static void main(String[] args) {


		//enum 열거타입
		
		//선호도 저장
		
		int likePoint = 50;
		
		String likeLevel = "매우 좋음"; // 매우나쁨 나쁨 보통 좋음 매우좋음
		
		String likeLevel2 = "많이좋음"; // 저장값 목록을 벗어난 논리적오류
		
		int likeValue = 1;
		
		if(likeLevel.equals("매우좋음")) {
			
		}
		if(likeValue == 5) {
			
		}
		
		LikeIndex lil = LikeIndex.VERYGOOD;
		LikeIndex li2 = LikeIndex.NORMAL;
		
		if(lil == LikeIndex.VERYGOOD) {
			System.out.println("아주 좋은 등급이구나~");
		} else if (lil == LikeIndex.VERYBAD) {
			System.out.println("아주 안좋은데 대응이 필요하겠네~");
		}else {
			
		}
		
		Week w1= Week.TUE;
		Week w2= Week.FRI;
		
		if(w2 == Week.FRI) {
			System.out.println("금요일 신나는 날");
		}
				
	}

}
