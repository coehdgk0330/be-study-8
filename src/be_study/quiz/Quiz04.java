package be_study.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*1.
		x=2 y=3
		5
		5
		x=3 y=4
				z=9
		x=4 y=5
				z=8
		        x=8
		x=8 y=4 z=8
				x=10
				z=2
		x=10 y=5 z=2
		x=20 y=6 z=2
		x=10 y=6 z=2
		
	2.
		true
		false
		false */
//	3.
		int menuPrice=13000; 
		String result= (menuPrice > 12000)?"물로배채우기":(menuPrice > 8000)?"눈물":(menuPrice > 6000)?"선방":"훌륭";
		System.out.println(result);
		
	
		
		
	}

}
