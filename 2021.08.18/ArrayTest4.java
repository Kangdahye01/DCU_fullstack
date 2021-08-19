
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		int j = -1; //ball 배열에서 랜덤하게 가져온 인덱스 번호
		//이 인덱스 영역에 저장된 값과 0번 인덱스에 저장된 값을 스왑하면서 배열의 값들을 섞을 것임.
		int temp = 0; //0번 인덱스 영역의 값을 임시적으로 저장할 변수
		
		for (int i = 0; i < 100; i++) {
			j = (int)(Math.random()*45);//0~44
			temp = ball[0];
			ball[0] = ball[j];
			ball[j] = temp;
			
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(ball[i] + " ");
		}
	}

}
