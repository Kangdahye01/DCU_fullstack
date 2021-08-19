
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이중for문
		/*
		 * for (int i =1; i <= 5; i++) { for(int j = 1;j <= 5 - i;j++) {
		 * System.out.print(" "); } for(int j = 1;j <= 2 * i - 1;j++) {
		 * System.out.print(j); } System.out.println(); } for (int i =1; i <= 4; i++) {
		 * for(int j = 1;j <= i; j++) { System.out.print(" "); } for(int j = 1;j <= 9 -
		 * 2*i ;j++) { System.out.print(j); } System.out.println(); }
		 */
		
		//이중for문을 하나로 합친 버젼
		/*
		 * for (int i = 1; i <= 9; i++) { if(i <= 5) { for (int j = 1; j <= 5 - i; j++)
		 * { System.out.print(" "); } for (int j = 1; j<= 2 * i - 1;j++) {
		 * 
		 * System.out.print(j);
		 * 
		 * } System.out.println(); }
		 * 
		 * 
		 * else { for (int j = 1; j <= i-5 ; j++) { System.out.print(" "); } for (int j
		 * = 1; j <= 19 - 2*i ; j++) { System.out.print(j);
		 * 
		 * } System.out.println(); } }
		 */
		//삼항연산자 사용
		/*
		 * for (int i = 1; i <= 10; i++) { int di = (i <= 5) ? 5-i : i-5; for (int j =
		 * 1; j <= di; j++) { System.out.print(" "); } int da = (i <= 5) ? 2*i - 1 :
		 * 19-2*i; for (int j = 1; j <= da; j++) { System.out.print(j); }
		 * System.out.println();
		 * 
		 * }
		 */
		//while문 사용
		int i = 1;
			while (i <= 9) {
				if (i<=5) {
					int space = 1;
					while (space <= 5-i)
						System.out.print(" ");
					int num = 1;
					while (num <= 2*i-1)
						System.out.print(num);
				}
				else {
					int space = 1;
					while (space <= i-5)
						System.out.print(" ");
					int num = 1;
					while (num <= 19-2*i)
						System.out.print(num);
				}
				i++;
				System.out.println();
			}
		}
		}
		
		
		
		
		
		
		
		


	
	
	


