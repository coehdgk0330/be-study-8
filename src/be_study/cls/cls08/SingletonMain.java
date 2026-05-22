package be_study.cls.cls08;

public class SingletonMain {

	public static void main(String[] args) {
		
		//외부에서 생성 -> 여러개의 객체가 존재 -> 외부에서 생성 못하게 제한
//		Singleton s1 =new Singleton();	//객체생성
//		Singleton s2 =new Singleton();	//객체생성
//		Singleton s3 =new Singleton();	//객체생성
		
		//Singleton s3 = new Singleton();
		//s3.singleton; //생성한 인스턴스 객체를 통해서 필드변수에 접근해야함
//		
//		Singleton s1 = Singleton.singleton;
//		Singleton.singleton = new Singleton();
//		
//		Singleton.singleton = null; 
//	
		
//		Singleton s3 = new Singleton();
//		s3.getInstance();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
	}

}
