import java.util.Scanner;

public class WorkShop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean stop = false;

		do {
			System.out.println("**** �������� *****");
			System.out.println("1. �ﰢ��");
			System.out.println("2. ��");
			System.out.println("3. ��ٸ���");
			System.out.println("4. ����");
			System.out.print("���ϴ� ���� �Է� �ϼ��� : ");
			int menunum = sc.nextInt();

			switch(menunum) {
			case 1 :
				System.out.println("**** �ﰢ������ ****");
				System.out.print("�غ� : ");
				int hori = sc.nextInt();
				System.out.print("���� : ");
				int vert = sc.nextInt();
				double total = (double)((hori * vert) /2);
				System.out.println("���� : %.2f\n" + total);
				break; 
			
			case 2:		
				System.out.println("**** ���� ���� ****");
				System.out.print("������ : ");
				int redi = sc.nextInt();
				double total1 = (double)(3.14*redi);
				System.out.println("���� : %.2f\n" + total1);		
				break; 
				
			case 3 :
				System.out.println("**** ��ٸ��ó��� ****");
				System.out.print("�Ʒ��� : ");
				int hori1 = sc.nextInt();
				System.out.print("���� : ");
				int hori2 = sc.nextInt();
				System.out.print("���� : ");
				int vert1 = sc.nextInt();
				float total2 = (float)((hori1+hori2)*vert1)/2;
				System.out.printf("���� : %.2f\n",total2);		
				break; 
			
			case 4:
				System.out.println("���α׷�����");
				stop = true;
				break;

			default:
				System.out.println("�޴���ȣ�� �߸��Ǿ����ϴ�.");
				break;	
			}

		}while(!stop);
	}

}

