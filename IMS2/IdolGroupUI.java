package ui;

import java.util.Scanner;

import action.Action;
import action.IdolGroupDetailAction;
import action.IdolGroupListAction;
import action.IdolGroupModifyAction;
import action.IdolGroupRegisAction;
import action.IdolGroupRemoveAction;
import action.IdolGroupSearchAction;
import controller.IdolGroupController;
import util.ConsoleUtil;
import vo.IdolGroupVO;
import vo.SearchVO;

public class IdolGroupUI {
    public static IdolGroupVO[] idolGroupArray = new IdolGroupVO[0];
    //�� ��ü�� ��� ��Ű������ ������ �����ؾ� �Ѵ�. -> �׷��� public���� ����. 
    //��ü�� �ȸ���� �ٷ� ���� �����ϱ� ���ؼ� static�� ���Ŵ�. 
    //��� Ŭ�������� �����ϱ� ���ؼ� static�� ������.  ->static�� �ǹ̴� '����'��� �����.
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));//�پ�� �ϰԸ���� �ڵ�
		//System.getProperty : �ý��� �Ӽ����� ��ȯ
		
		IdolGroupController idolGroupController
		= new IdolGroupController();
		//��ü ������� ��û�� �޾Ƽ� �����ϴ� Ŭ����
		
		boolean stop = false;
		
		//�������� ����ؼ� ��ûó�� ��
		Action action = null;
		
		
		
		do {
			System.out.println("=====���̵��׷����======");
			System.out.println("1. ���̵��׷���"); //C(Create)
			System.out.println("2. ���̵��׷��Ϻ���");//R(Read)
			System.out.println("3. ���̵��׷����� �󼼺���");//R(Read)
			System.out.println("4. ���̵��׷����� ����");
			System.out.println("5. ���̵��׷����� ����");
			System.out.println("6. ���̵��׷����� �˻�");
			System.out.println("7. ���α׷�����");
			
			System.out.print("�޴���ȣ : ");
			int menuNumber = scanner.nextInt();
			
			switch (menuNumber) {
			case 1: {
				action = new IdolGroupRegisAction();
				break;
			}
			case 2:
				action = new IdolGroupListAction();
				break;
			case 3:
				action = new IdolGroupDetailAction();
				break;
			case 4:
				action = new IdolGroupModifyAction();
				break;
			case 5: //���� ���̽�
				action = new IdolGroupRemoveAction();
				break;
			case 6:
				action = new IdolGroupSearchAction();
				break;
			case 7:
				stop = true;
				action = null;
			default:
				break;
			}
		
			if(action != null) {
				try {
					idolGroupController.processRequest(action, scanner);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (!stop);
	}

}






