import java.util.Scanner;

class HealthSuper {
        Scanner scanner = new Scanner(System.in);
		protected String gender;
		protected double tall;
		protected double weight;
		
	
		 void input() { //�ʷϻ��� �Լ� . input�� �����Ű�� ���װ� �� �����̵�. �ؿ��ִ� �ֵ���.
			System.out.print("���� : ");
			gender = scanner.next();
			System.out.print("���� : ");
			tall = scanner.nextDouble();
			System.out.print("ü�� : ");
			weight = scanner.nextDouble();
		}
		void output1() {
			System.out.println("***** �񸸵� Check *****");
			System.out.println("����(����/����) : " + gender);
			System.out.println("���� : " + tall);
			System.out.println("ü�� : " + weight);
		}
		
		
	}
class HealthChild extends HealthSuper {

		
		// TODO Auto-generated method stub
		private double s_weight ;
		private double fat;
		private String fatName;
		
		
		void calculate( ) {
			
		if (gender == "m") {
		s_weight = (tall - 100) * 0.9;   //ǥ��ü�߰���
		}
		else {
		s_weight = (tall - 100) * 0.85;  //ǥ��ü�߰������ڹ���
		}
		
		fat = weight/s_weight*100; //�񸸵�
		
		String fatName = "";
		if (fat <= 90) {
		 fatName = "��ü��";
		}
		else if (fat <= 110) {
		 fatName = "����(ǥ��ü��)";
		}
		else if (fat <= 120) {
			 fatName = "��ü��";
			}
		else if (fat <= 130) {
			 fatName = "�浵��";
			}
		else if (fat <= 150) {
			 fatName = "�ߵ���";
			}
		else {
			 fatName = "����";
			}
		
		System.out.println("����� �񸸵�" + fat + "�̰�," + fatName + "�Դϴ�.");

		}


}
		
public class WorkShop2  {
	public static void main (String[] args) {
		HealthChild healthChild = new HealthChild() ;
		healthChild.input(); //�̰� �ҷ����°� ����
		healthChild.output1();
		healthChild.calculate();

}
}