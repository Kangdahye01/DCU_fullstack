
public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int [10];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int)(Math.random()*10));//0~9
		}
		
		System.out.println();
		
		//정렬
		for (int i = 0; i < number.length; i++) {
			boolean changed = false;
			//앞의 숫자와 뒤의 숫자가 자리변경이 되었는지를 판단하는 변수
			//자리바꿈이 일어나지 않으면 정렬이 끝났다는 것임
			
			for (int j = 0; j < number.length -1 - i; j++) {
				if(number[j] > number[j + 1]) {
					int temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
					changed = true;
					
				}
			}
			
			if(!changed) {
				break;
			}
			
			for (int j = 0; j < number.length; j++) {
				System.out.print(number[j]);
			}
			System.out.println();
			
		}
	}

}
