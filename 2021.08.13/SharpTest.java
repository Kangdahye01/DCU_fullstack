
public class SharpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  for (int i = 1; i <= 5; i++) { 
			  for (int j = 1; j < i +1 ; j++) {
		  System.out.print("#"); } 
			  System.out.println(); }
		  
		  for (int i = 1; i <= 5; i++) { 
			  for (int j = 1; j < 6 - i; j++) {
		  System.out.print("#"); }
			  System.out.println(); }
		 

	
		//하나의 이중  for문으로 합친버전
		for (int i = 1; i <= 10; i++) {
			if(i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("#");
				}
			}
			else {
				for (int j = 1; j <= 11 - i; j++) {
					System.out.print("#");
				}
			}
			System.out.println();
			}
	}


		

		
		//삼항연산자 사용
		/*
		 * for (int i = 1; i <= 10; i++) { 
		 * int sharpCount = (i <= 5) ? i : 11 - i; 
		 * for (int j = 1; j <= sharpCount; j++) { 
		 * System.out.print("#"); 
		 * }
		 * System.out.println(); 
		 * }
		 * 
		 */
		
		
		//while 문 사용
		/*int i = 1;
		while (i <= 10) {
			int sharpCount = (i <= 5) ? i : 11 - i;
			int j = 1;
			while( j <= sharpCount ) {
				System.out.print("#");
				j++;
		}
		System.out.println();
			i++;
		}*/
		
		
	}


		