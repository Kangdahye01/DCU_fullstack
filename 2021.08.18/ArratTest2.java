//배열에 저장되어 있는 성적들의 총점과 평균을 구하기
public class ArratTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		float average = 0;
		
		int[] score = {100,100,100,100,99};
		
		//총점구하기
		for (int i =0; i < score.length; i++) {
			total += score[i];
		}
		
		//평균구하기
		average = total/ (float)score.length;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}

}
