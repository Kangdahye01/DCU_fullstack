
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
		arr4 = new int [4][4]; //��� �ε����� ���� �ٽ� 0���� ����
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
		
		//���� �ʱ�ȭ ��Ű�鼭 �迭��ü�� �����ϴ� ���
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
		
		//1�� ��İ� 2�� ����� �������� 1���� �迭��ü������ �������� ����
		//1). �迭�� ����� ������ �и��Ǵ� ����� 2�� ��ĸ� ���
		//2). �޼ҵ��� ���ڷ� �迭��ü�� ������ ���� 2�� ��ĸ� ���
		
		
		
		
		
	}

}
