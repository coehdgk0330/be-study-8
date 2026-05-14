package be_study.refer;

public class Arr03 {

	public static void main(String[] args) {
		
		
		int[] arr1 = {1,2,3};
		
		//            ㅁ ㅁ ㅁ
		//			  1 2 3
		//	index	  0 1 2
		
		// arr[0] <-- int 타입변수
		
		System.out.println( arr1[0] == arr1[0] );
		System.out.println( arr1[0] == arr1[2] ); //값 == 값
		
		String [] arr2 = {"A" , "B" , "C"};
		
		System.out.println(arr2[0] == arr2[2]); //주소비교
		
		
		
		System.out.println(arr2[0].equals(arr2[2])  );
		
		
		String[][] arr3 = { { "A" , "B" , "C"},{ "D" , "E" , "F"}};
		
		
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		
		System.out.println(arr3[0]== arr3[1]);
		System.out.println(arr3[0][0] == arr3 [1][1]);
		System.out.println(arr3[0][0].equals(arr3 [1][1]));
		
		int[][] arr4 = { { 1,2,3},{4,5,6}};
		System.out.println(arr4[0] == arr4[1]);
		System.out.println(arr4[0][0] == arr4[1][1]);
		
		 
	}			String s ="커피";

}
