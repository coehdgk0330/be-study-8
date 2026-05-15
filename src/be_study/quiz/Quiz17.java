package be_study.quiz;


import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
               if ((2 * x) + (4 * y) == 10) {
                    System.out.println("결과 x : " + x + " 결과 y : "+ y);
                  
            }
		}
	}*/
		Scanner scanner=new Scanner(System.in);
		/*int num=scanner.nextInt();
		int num2=scanner.nextInt();
		if(num>num2) {
			System.out.println(num-num2);
		}else {
			System.out.println(num2-num);
		} */
		
		
		/*int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += scanner.nextInt();
        }

       
        String result = "";
        switch (sum) {
            case 1: result = "도"; break;
            case 2: result = "개"; break;
            case 3: result = "걸"; break;
            case 4: result = "윷"; break;
			
			
		}
        System.out.println("결과 " + result);
        */
        int num = scanner.nextInt();
        for(int i=0; i<num; i++) {
			System.out.print("*");}
        
        
		}
		
		
		
}
