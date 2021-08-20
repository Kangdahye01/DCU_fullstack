
public class FootVolleyballProfesir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] player = {"����1","����2","����3","����4","����5","�ƹ���1","�ƹ���2",
			     "�ƹ���3","�ƹ���4","�ƹ���5","�ƹ���6","�ƹ���7","�ƹ���8","�ƹ���9","�ƹ���10","�ƹ���11","�ƹ���12","�ƹ���13","�ƹ���14"
			     ,"�ƹ���15","�ƹ���16","�ƹ���17","�ƹ���18","�ƹ���19","�ƹ���20","�ƹ���21","�ƹ���22","�ƹ���23","�ƹ���24","�ƹ���25"
			      };
		
		String team[][] = new String[5][6];
	
		//1. �� 2���� �迭��ü�� 0�� �ε��� ������ ������� �켱 ����
		for (int i = 0; i < team.length; i++) {
			//���� �̸��� �����ϰ� �ִ� �ε��� ��ȣ�� 0~4������ �������� �����ϰ� �����´�.
			int leaderIndex = (int)(Math.random() * 5 ); // ������ �ε����� 0~4������ ���� ������
			
			//������ ���� �ε��� ��ġ�� �ִ� ���ڿ��� null�̸� ��, ���� �̸��̸� �ش� �̸��� �������� �������� �ʰ�, 
			// ���� ���๮���� ���ư��� ó��
			if(player[leaderIndex] == null) {
				i--;
			}
			else { //�ش� �ε����� �ִ� �̸��� ���� ������� �ʾ�����, �ش� �ε����� �̸��� �������� �����ϰ�. �ش� �ε����� ���� null�� �Ҵ�.
				team[i][0] = player[leaderIndex];
				player[leaderIndex] = null;
				}
			}
		
		//2. �� ���� 1�� �ε������� 5�� �ε��� ������ ������ �� ���� ����
		for (int i = 0; i < team.length; i++) {
			for (int j = 1; j < team[i].length; j++) {
				int memberIndex = (int)(Math.random() *25 ) + 5; // 5~29������ �ε����� �����ϰ� ����
				
				if(player[memberIndex] == null) {
					j--;
				}
				else {
					team[i][j] = player[memberIndex];
					player[memberIndex] = null;
				}
				
			}
		}
			
		//3. �� ���� ����� �����̸� ���
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + 1 + "���� : " + team[i][0]);
			System.out.print("����: ");
			for (int j = 1; j < team[i].length; j++) {
				System.out.print(team[i][j] + " ");
			}
			System.out.println();
		}
		}

}


