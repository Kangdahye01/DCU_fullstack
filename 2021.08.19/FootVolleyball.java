
public class FootVolleyball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] player = {"����1","����2","����3","����4","����5","�ƹ���1","�ƹ���2",
			     "�ƹ���3","�ƹ���4","�ƹ���5","�ƹ���6","�ƹ���7","�ƹ���8","�ƹ���9","�ƹ���10","�ƹ���11","�ƹ���12","�ƹ���13","�ƹ���14"
			     ,"�ƹ���15","�ƹ���16","�ƹ���17","�ƹ���18","�ƹ���19","�ƹ���20","�ƹ���21","�ƹ���22","�ƹ���23","�ƹ���24","�ƹ���25"
			      };
		
		String team[][];
			 team = new String[5][6];
			      
			  int[] leader = new int[5];
			  int[] follower = new int[25];
			  for(int i = 0; i < 5; i++) {
			      leader[i] = (int) (Math.random() *5);
			     for(int j = 0; j < i; j++) {
			         if(leader[i] == leader[j]) {
			             i--;
			         }
			     }
			 }
			      
			  for(int i = 0; i < 25; i++) {
			     follower[i] = (int) (Math.random() *25+5);
			      for(int j = 0; j < i; j++) {
			         if(follower[i] == follower[j]) {
			             i--;
			          }
			     }
		  }
			      
			  for (int i = 0; i < 5; i++) {
			         
			     System.out.println(i+1+"��");
			     System.out.println(player[leader[i]]);
			     System.out.print("����: ");
			  for(int j = 0; j < 5; j++) {
			     System.out.print(player[follower[i * 5 + j]] + " ");
			         }
			         System.out.println();
			      }
			   }
			
	}


