
public class FootVolleyball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] player = {"조장1","조장2","조장3","조장4","조장5","아무개1","아무개2",
			     "아무개3","아무개4","아무개5","아무개6","아무개7","아무개8","아무개9","아무개10","아무개11","아무개12","아무개13","아무개14"
			     ,"아무개15","아무개16","아무개17","아무개18","아무개19","아무개20","아무개21","아무개22","아무개23","아무개24","아무개25"
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
			         
			     System.out.println(i+1+"팀");
			     System.out.println(player[leader[i]]);
			     System.out.print("팀원: ");
			  for(int j = 0; j < 5; j++) {
			     System.out.print(player[follower[i * 5 + j]] + " ");
			         }
			         System.out.println();
			      }
			   }
			
	}


