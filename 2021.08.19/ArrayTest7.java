//2���� �迭
public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. �迭����
		int[][] arr1;
		int arr2[][];
		int[] arr3[];
		
		//2. �迭��ü ����
		arr1 = new int[3][3];
		
		//3. �迭�� �� �Ҵ�
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		
		//4. �� ��ȸ�ϱ�
		for (int i = 0; i < arr1.length; i++) {
			//1���� �ݺ�
			for (int j = 0; j < arr1[i].length; j++) {
				//2���� �ݺ�
				System.out.print("arr1[" + i + "] [" + j + "] = " + arr1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		//arr1[1] = 2; �̷������δ� ���� 2�������� ����
		arr1[1] = new int[3]; //�̷��� ǥ���ؾ���.
		
		//2���� �迭��ü�� �����ؼ� ���� �Ҵ��ϴ� 2�� for���� 
		//���� ����ϴ� 2�� for���� ����ؼ� 
		//����� 1 0 0 0
		//     0 1 0 0
		//     0 0 1 0
		//     0 0 0 1		
		
		//     1 1 1 1
		//     1 0 0 1
		//     1 0 0 1
		//     1 1 1 1
		
		

	}

}
