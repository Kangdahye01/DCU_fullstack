import java.util.Iterator;

public class DoubleForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			for (int j =  1; j <= 10; j++) {
				System.out.println("i = " + i + ", j = "+ j);
			}
			
		
		System.out.println();
	}
	
		int i = 1;
		while(i <= 10) {
			int j = 1; 
			while(j <= 10) {
				System.out.println("i = " + i + ", j = "+ j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
}

}








