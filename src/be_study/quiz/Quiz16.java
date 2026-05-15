package be_study.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		int [][]num ={{1,2,2,2,2},{3,1,2,2,2},{3,3,1,2,2},{3,3,3,1,2},{3,3,3,3,1}};
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
