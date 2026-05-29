package be_study.homework;

public class HomeworkMain1 {

	public static void main(String[] args) {
//		🔹 1단계: 기본 배열 연습 (1~10)
//	1. 정수 배열을 만들어 모든 요소를 출력하라.
//		int []arr= {10,20,30,40,70};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		2. 길이 5짜리 int 배열을 만들고 2번 인덱스에 50을 넣어라.
//		
//		arr[2]=50;
//		
//		3. 배열의 길이를 출력하라.
//		System.out.println(arr.length);
//		4. 배열 요소들의 합계를 구해라.
//		int sum=0;
//		for(int num : arr) {
//			sum +=num;
//			}
//		System.out.println(sum);
//	
//		5. for 문으로 배열 요소들을 출력하라.
//		for(int i=0; i<arr.length; i++) {
//		System.out.print(arr[i] + " ");
//		}
//		System.out.println();

		


		
		
		
		
	}
	
//		6. int 배열을 매개변수로 받아 평균을 구하는 메서드를 만들어라.

		public static int getAverage(int[] arr) {
			int sum =0;
			for(int i=0; i<arr.length; i++) {
				sum+=arr[i];
			}
			
			return sum/arr.length;
			
		}
//		7. 배열을 전달받아 가장 큰 값을 리턴하는 메서드를 만들어라.
		
		public static int getMaxNum(int[]arr) {
			int maxNum=0;
			for(int i =0; i<arr.length; i++) {
				if(arr[i]>maxNum) {
					maxNum=arr[i];
				}
				
			}
			return maxNum;
		}
//		8. 배열을 전달받아 모든 요소를 1 증가시키는 메서드를 작성하라. (원본 변경 확인)
		public static void increease(int[]arr) {
			for(int i= 0; i<arr.length; i++) {
				arr[i]=arr[i]+1;
			}
		}
		
		
//		9. 배열을 생성하는 메서드를 만들어라(길이를 받아서 0으로 채워진 배열 리턴).
		public static int[] createEmptyArray(int size) {
			int[] newArray = new int[size];
			
			return newArray;
		}
		
//		10. 배열을 전달하면 역순으로 뒤집어주는 메서드를 만들어라.
		
		
		
}


	

