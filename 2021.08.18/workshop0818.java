import java.util.Scanner;

public class workshop0818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1��
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ������ �����ÿ�.");
		int numOfApples = scanner.nextInt();
		
		
		
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples%sizeOfBucket == 0) ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket + 1);

		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);
		

		//���� 2��
		
		System.out.print("���ڸ� �Է��Ͻÿ�.");
		int num = scanner.nextInt();
		
		String code = "";
		if(num > 0) {
			System.out.println ("����Դϴ�.");
			
		}
		else if(num == 0) {
			System.out.println("0�Դϴ�.");
		}
			
		else if(num < 0) {
			System.out.println ("�����Դϴ�.");
				
	}



		//���׿����� (����2��)

		System.out.print ("���ڸ� �Է��Ͻÿ�!");
		int numm = scanner.nextInt() ;
		System.out.println ((numm > 0) ? "����Դϴ�" :
				(numm < 0)? "�����Դϴ�" : "0�Դϴ�");
	


		//���� 3��
		System.out.print("���ڸ� �Է��Ͻÿ�.");
			int i = scanner.nextInt();
			int iNum = (i/100)*100;
			
			System.out.println(iNum);
			
			
		//���� 4��
			System.out.print ("�Է��Ͻÿ�! ");
			char ch = scanner.next().charAt(0);
			
			if(ch>='a' && ch<= 'z') {
				System.out.println("true");
			}
			else if(ch>='0' && ch<='9') {
				System.out.println("true");
			}
			else {
				System.out.print("�߸� �Է��߽��ϴ�.");
			}
			
				
		//���� 5��
			System.out.print ("�̸� :");
			String name = scanner.next() ;
			
			System.out.print ("���� :");
			char gender = scanner.next().charAt(0);
			System.out.println ((gender == 'M') ? "����" : "����");
			
			
			System.out.print ("���� :");
			int age = scanner.nextInt() ;
			
			System.out.print ("���� :");
			int tall = scanner.nextInt() ;
			
			
		//����6��
			int e = 1, ans = 0;
			while(ans <= 100) {
				
				if(e%2 == 0) {
					ans = ans - e;
				}
				else if (e%2 == 1) {
					ans = ans + e;
				}
				e++;
			}
			System.out.println(e);
			
		//����7��
			
			int count = 0;
			for (int q = 1; q < 7; q++) { //q=ù��°�ֻ���
			for (int t = 1; t < 7; t++) { //t=�ι�°�ֻ���
			int summ = q + t;
			if (summ == 6) {
				
				System.out.println("q:" + q + " + " + "t:" + t + " = " + summ);
				count++;
			}
			
			}
			}
			System.out.println(count + "����");

	

}

}














