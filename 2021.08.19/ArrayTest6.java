
public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 임의의 숫자(0~9까지의 난수)를 1번 배열객체에 저장하고
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int)(Math.random() * 10));
			//0 ~ 9 까지의 난수 할당 
		}
		System.out.println();
		
		//2. 2번 배열객체에 1번 배열객체에 저장된 각 숫자들의 개수를 저장할 것임
		//3. 2번 배열객체의 인덱스 번호가 1번 배열객체에 저장되어 있는 각 숫자값
		int[] counter = new int[10];
		//배열객체를 생성하면 각 인덱스 영역의 값은 해당 배열의 데이터타입의 기본값으로 초기화 된다.
		
		//각 데이터타입들의 기본값
		//정수형 : 0
		//실수형 : 0.0
		//문자형 : ' ' (spacebar)
		//논리형 : false
		//객체타입 : null
		
		//number 배열객체에 저장되어 있는 숫자값들의 개수를 계산
		for (int i = 0; i < number.length; i++) {
			counter[number[i]]++;
			//counter[0]++ -> 이 말은 카운터 0인덱스의 값을 1 올려주는거다.
			
		}
		
		//결과출력
		for (int i = 0; i < counter.length; i++) {
			System.out.println(i + "의 개수 : " + counter[i]);
		}
		
		
		
		
	}

}
