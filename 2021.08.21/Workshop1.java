import java.util.Scanner;

public class Workshop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
		 System.out.print("중간고사 : ");
		 int midexam = scanner.nextInt();
		 System.out.print("기말고사 : ");
		 int finalexam = scanner.nextInt();
		 System.out.print("레포트 : ");
		 int report = scanner.nextInt();
		 System.out.print("출석 : ");
		 int attendance = scanner.nextInt();
	
		 String grade = null;
		 double score = (midexam+finalexam)/2*0.6 + report*0.2 + attendance*0.2;
		 System.out.printf("성적 : %.2f\n", score);
		 
		 if (score >= 90) {
			 grade = "A";
					 System.out.println("학점 = A");
		 }
		 
		 else if (score >= 80) {
			 grade = "B";
					 System.out.println("학점 = B");
		 }	 
		else if (score >= 70) {
			grade = "C";
					System.out.println("학점 = C");
					 }
		 
		else if (score >= 60) {
			 grade = "D";
					 System.out.println("학점 = D");			 
		 }
		else {
			grade = "F";
					System.out.println("학점 = F");
		 }
		 
		 switch (grade) {
		 case "A" , "B":
			 System.out.println("평가 = excellent");
		 break;
		 
		 case "C", "D":
			 System.out.println("평가 =  good");
		 break;
		 
		 case "F":
			 System.out.println("평가 =  poor");
		 break;
		 	
		 default:
			 break;
		 }
	
	}

}
