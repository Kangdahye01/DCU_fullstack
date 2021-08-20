
public class workshopprofessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr4 = new int [4][4];
		
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4.length; j++) {
				if(i == j) arr4[i][j] =1;
			}
		}
		
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4.length; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		arr4 = new int [4][4]; //모든 인덱스의 값을 다시 0으로 변경
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4.length; j++) {
				if(i == 0 || i == arr4.length - 1 || j == 0 || j == arr4[i].length -1) arr4[i][j] =1;
			}
		}
		
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4.length; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		//값을 초기화 시키면서 배열객체를 생성하는 방법
		//1.
		int[][] arr5 = {{2,3,4},{5,6,7}};
		System.out.println("int[][] arr5 = {{2,3,4},{5,6,7}};");
		
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}
		
		//2.
		int[][] arr6 = new int[][] {{7,8,9},{10,11,12}};
		System.out.println("int[][] arr6 = new int[][] {{7,8,9},{10,11,12}};");
		
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				System.out.print(arr6[i][j] + " ");
			}
			System.out.println();
		}
		
		//1번 방식과 2번 방식의 차이점은 1차원 배열객체에서의 차이점과 동일
		//1). 배열의 선언과 생성이 분리되는 방식은 2번 방식만 허용
		//2). 메소드의 인자로 배열객체를 전달할 때는 2번 방식만 허용
		
		
		
		
		
	}

}
