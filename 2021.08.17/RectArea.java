
public class RectArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			if(i == 1 || i == 5) {
				System.out.print("**********"); 
				/*for (int j = 1; j == i; j++) {
					System.out.print("**********");
				}*/
			}
					
		
			else {
				System.out.print("*        *");
				/*for (int j = 1; j == i ; j++) {
					System.out.print("*        *");
				}*/
				
				
			}
			System.out.println();
	}
		
		
		
		
		
		
		
		
		//교수님 방법
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 10) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//while문 사용
		int i = 1;
			while (i <= 5) {
				int j=1;
				while (j <=10)
				{if (i == 1 || i == 5 || j == 1 || j == 10) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				j++;
				}
			i++;
			System.out.println();
			}
			
		
	}

}
