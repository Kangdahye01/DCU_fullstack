import java.util.Scanner;

public class WorkShop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.println("name = " + name);
		
		System.out.print("kor : ");
		int kor = scanner.nextInt();
		System.out.println("kor = " + kor);
		
		System.out.print("eng : ");
		int eng = scanner.nextInt();
		System.out.println("eng = " + eng);
		
		System.out.print("mat : ");
		int mat = scanner.nextInt();
		System.out.println("mat = " + mat);
		
		int total = kor + eng + mat;
		float avg = total/3f;
		
		System.out.println("total 점수 = " + total);
		System.out.printf("avg 점수 = %.1f\n" , avg);

	}

}
