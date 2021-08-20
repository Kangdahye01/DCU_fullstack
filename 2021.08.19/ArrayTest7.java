//2차원 배열
public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 배열선언
		int[][] arr1;
		int arr2[][];
		int[] arr3[];
		
		//2. 배열객체 생성
		arr1 = new int[3][3];
		
		//3. 배열에 값 할당
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		
		//4. 값 조회하기
		for (int i = 0; i < arr1.length; i++) {
			//1차원 반복
			for (int j = 0; j < arr1[i].length; j++) {
				//2차원 반복
				System.out.print("arr1[" + i + "] [" + j + "] = " + arr1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		//arr1[1] = 2; 이런식으로는 못함 2차원에만 가능
		arr1[1] = new int[3]; //이렇게 표현해야함.
		
		//2차원 배열객체를 생성해서 값을 할당하는 2중 for문과 
		//값을 출력하는 2중 for문을 사용해서 
		//결과가 1 0 0 0
		//     0 1 0 0
		//     0 0 1 0
		//     0 0 0 1		
		
		//     1 1 1 1
		//     1 0 0 1
		//     1 0 0 1
		//     1 1 1 1
		
		

	}

}
