//배열에 저장된 점수 중 최대값과 최소값을 구하기
public class ArratTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100,100,100,100,99};
		int max = score[0];//맨앞에값
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {//0번값은 초기값에 넣었으니까 굳이 비교를 0부터 시작안해도됨.
			if(score[i] > max) {
				max = score[i];
			}
			else if(score[i] < min) {
				min = score[i];
			}
		}
		
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
	}

}
