
public class FootVolleyballProfesir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] player = {"조장1","조장2","조장3","조장4","조장5","아무개1","아무개2",
			     "아무개3","아무개4","아무개5","아무개6","아무개7","아무개8","아무개9","아무개10","아무개11","아무개12","아무개13","아무개14"
			     ,"아무개15","아무개16","아무개17","아무개18","아무개19","아무개20","아무개21","아무개22","아무개23","아무개24","아무개25"
			      };
		
		String team[][] = new String[5][6];
	
		//1. 각 2차원 배열객체의 0번 인덱스 영역에 팀장들을 우선 배정
		for (int i = 0; i < team.length; i++) {
			//팀장 이름을 저장하고 있는 인덱스 번호를 0~4까지의 범위에서 랜덤하게 가져온다.
			int leaderIndex = (int)(Math.random() * 5 ); // 팀장의 인덱스가 0~4사이의 값을 가져옴
			
			//난수로 얻어온 인덱스 위치에 있는 문자열이 null이면 즉, 사용된 이름이면 해당 이름을 팀장으로 배정하지 않고, 
			// 이전 실행문으로 돌아가게 처리
			if(player[leaderIndex] == null) {
				i--;
			}
			else { //해당 인덱스에 있는 이름을 아직 사용하지 않았으면, 해당 인덱스의 이름을 팀장으로 배정하고. 해당 인덱스의 값을 null로 할당.
				team[i][0] = player[leaderIndex];
				player[leaderIndex] = null;
				}
			}
		
		//2. 각 팀의 1번 인덱스부터 5번 인덱스 까지의 영역에 각 팀원 배정
		for (int i = 0; i < team.length; i++) {
			for (int j = 1; j < team[i].length; j++) {
				int memberIndex = (int)(Math.random() *25 ) + 5; // 5~29까지의 인덱스가 랜덤하게 배정
				
				if(player[memberIndex] == null) {
					j--;
				}
				else {
					team[i][j] = player[memberIndex];
					player[memberIndex] = null;
				}
				
			}
		}
			
		//3. 각 팀의 팀장과 팀원이름 출력
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + 1 + "팀장 : " + team[i][0]);
			System.out.print("팀원: ");
			for (int j = 1; j < team[i].length; j++) {
				System.out.print(team[i][j] + " ");
			}
			System.out.println();
		}
		}

}


