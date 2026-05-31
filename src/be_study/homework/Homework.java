package be_study.homework;

import java.util.Arrays;

public class Homework {

	public static void main(String[] args) {
//		1. 정수 배열을 만들어 모든 요소를 출력하라.
		int[]arr1 = {10,20,30,40,50};
		System.out.println(Arrays.toString(arr1));
		
//		2. 길이 5짜리 int 배열을 만들고 2번 인덱스에 50을 넣어라.
		
		int []arr2 = new int [5];
		arr2[2]=50;
		
//		3. 배열의 길이를 출력하라.
		
		System.out.println(arr2.length);
		
//		4. 배열 요소들의 합계를 구해라.
		
		int sum=0;
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println(sum);
		
//		5. for 문으로 배열 요소들을 출력하라.
		
		for(int i= 0; i< arr1.length; i++) {
			System.out.println(arr1[i] + "");
		}
//		6. int 배열을 매개변수로 받아 평균을 구하는 메서드를 만들어라.
		
		System.out.println(getAverage(arr1));
		
//		7. 배열을 전달받아 가장 큰 값을 리턴하는 메서드를 만들어라.
		
		System.out.println(getMaxNum(arr1));
//		8. 배열을 전달받아 모든 요소를 1 증가시키는 메서드를 작성하라. (원본 변경 확인)
		
		System.out.println("원본 : " +Arrays.toString(arr1));
		increase(arr1);
		System.out.println("변경 후 : " +Arrays.toString(arr1));
//		9. 배열을 생성하는 메서드를 만들어라(길이를 받아서 0으로 채워진 배열 리턴).
		
		int[]newArr = createArray(7);
		System.out.println(Arrays.toString(newArr));
//		10. 배열을 전달하면 역순으로 뒤집어주는 메서드를 만들어라.
		reverseArray(arr1);
		System.out.println(Arrays.toString(arr1));

	}
	//6번 메소드
	public static int getAverage(int []arr) {
		int total=0;
		for ( int num : arr) {
			total+= num;
		}
		return total/arr.length;
	}
	//7번 메소드
	public static int getMaxNum(int[]arr) {
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	//8번 메소드
	public static void increase(int[]arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]+ 1;
		}
	//9번 메소드
	
	}
	public static int[] createArray(int length) {
		int[]result = new int [length];
		return result;
	}
	//10번 메소드 
	public static void reverseArray(int []arr) {
		for(int i=0; i<arr.length /2; i++) {
			int temp = arr[i];
			arr[i]=arr[arr.length -1- i];
			arr[arr.length -1 -i]= temp;
		}
	}
}
	

	
	
	

