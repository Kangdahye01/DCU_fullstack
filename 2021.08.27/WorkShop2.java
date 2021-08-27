import java.util.Scanner;

class HealthSuper {
        Scanner scanner = new Scanner(System.in);
		protected String gender;
		protected double tall;
		protected double weight;
		
	
		 void input() { //초록색이 함수 . input을 실행시키면 쟤네가 다 실행이됨. 밑에있는 애들이.
			System.out.print("성별 : ");
			gender = scanner.next();
			System.out.print("신장 : ");
			tall = scanner.nextDouble();
			System.out.print("체중 : ");
			weight = scanner.nextDouble();
		}
		void output1() {
			System.out.println("***** 비만도 Check *****");
			System.out.println("성별(남자/여자) : " + gender);
			System.out.println("신장 : " + tall);
			System.out.println("체중 : " + weight);
		}
		
		
	}
class HealthChild extends HealthSuper {

		
		// TODO Auto-generated method stub
		private double s_weight ;
		private double fat;
		private String fatName;
		
		
		void calculate( ) {
			
		if (gender == "m") {
		s_weight = (tall - 100) * 0.9;   //표준체중계산법
		}
		else {
		s_weight = (tall - 100) * 0.85;  //표중체중계산법여자버전
		}
		
		fat = weight/s_weight*100; //비만도
		
		String fatName = "";
		if (fat <= 90) {
		 fatName = "저체중";
		}
		else if (fat <= 110) {
		 fatName = "정상(표준체중)";
		}
		else if (fat <= 120) {
			 fatName = "과체중";
			}
		else if (fat <= 130) {
			 fatName = "경도비만";
			}
		else if (fat <= 150) {
			 fatName = "중도비만";
			}
		else {
			 fatName = "고도비만";
			}
		
		System.out.println("당신은 비만도" + fat + "이고," + fatName + "입니다.");

		}


}
		
public class WorkShop2  {
	public static void main (String[] args) {
		HealthChild healthChild = new HealthChild() ;
		healthChild.input(); //이게 불러오는거 문법
		healthChild.output1();
		healthChild.calculate();

}
}