import java.util.Scanner;

public class WorkShop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		  
		System.out.print("pay : "); int pay = scanner.nextInt();
		  
		System.out.print("o_time : "); int o_time = scanner.nextInt();
		  
		int tax = pay/(100/10);
		int t_pay = pay + o_time - tax;
		
		System.out.print("t_pay " + t_pay);  
		
	}

}
