import java.util.Scanner;

public class Workshop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
		 System.out.print("�߰���� : ");
		 int midexam = scanner.nextInt();
		 System.out.print("�⸻��� : ");
		 int finalexam = scanner.nextInt();
		 System.out.print("����Ʈ : ");
		 int report = scanner.nextInt();
		 System.out.print("�⼮ : ");
		 int attendance = scanner.nextInt();
	
		 String grade = null;
		 double score = (midexam+finalexam)/2*0.6 + report*0.2 + attendance*0.2;
		 System.out.printf("���� : %.2f\n", score);
		 
		 if (score >= 90) {
			 grade = "A";
					 System.out.println("���� = A");
		 }
		 
		 else if (score >= 80) {
			 grade = "B";
					 System.out.println("���� = B");
		 }	 
		else if (score >= 70) {
			grade = "C";
					System.out.println("���� = C");
					 }
		 
		else if (score >= 60) {
			 grade = "D";
					 System.out.println("���� = D");			 
		 }
		else {
			grade = "F";
					System.out.println("���� = F");
		 }
		 
		 switch (grade) {
		 case "A" , "B":
			 System.out.println("�� = excellent");
		 break;
		 
		 case "C", "D":
			 System.out.println("�� =  good");
		 break;
		 
		 case "F":
			 System.out.println("�� =  poor");
		 break;
		 	
		 default:
			 break;
		 }
	
	}

}
