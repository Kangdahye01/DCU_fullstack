
public class ArrayTestworkshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1[];
		
		//2. 배열객체 생성
		arr1 = new int[4][4];
		
		//3. 배열에 값 할당
		arr1[0][0] = 1;
		arr1[1][1] = 1;
		arr1[2][2] = 1;
		arr1[3][3] = 1;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
System.out.println();
		

		int[][]arr2;
		
		arr2 = new int[4][4];
				
		arr2[0][0] = 1;
		arr2[0][1] = 1;
		arr2[0][2] = 1;
		arr2[0][3] = 1;
		
		arr2[1][0] = 1;
		arr2[1][1] = 0;
		arr2[1][2] = 0;
		arr2[1][3] = 1;
		
		arr2[2][0] = 1;
		arr2[2][1] = 0;
		arr2[2][2] = 0;
		arr2[2][3] = 1;
		
		arr2[3][0] = 1;
		arr2[3][1] = 1;
		arr2[3][2] = 1;
		arr2[3][3] = 1;
		
		for (int k = 0; k < arr2.length; k++) {
			for (int p = 0; p < arr2[k].length; p++) {
				System.out.print(arr2[k][p]);
			}
			System.out.println();
		}
	}

}
