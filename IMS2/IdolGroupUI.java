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
    //이 객체는 모든 패키지에서 접근이 가능해야 한다. -> 그래서 public으로 줬음. 
    //객체를 안만들고 바로 직접 접근하기 위해서 static을 쓴거다. 
    //모든 클래스에서 공유하기 위해서 static을 지정함.  ->static의 의미는 '공유'라고 보면됨.
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));//뛰어쓰기 하게만드는 코드
		//System.getProperty : 시스템 속성값을 반환
		
		IdolGroupController idolGroupController
		= new IdolGroupController();
		//전체 사용자의 요청을 받아서 제어하는 클래스
		
		boolean stop = false;
		
		//다형성을 사용해서 요청처리 함
		Action action = null;
		
		
		
		do {
			System.out.println("=====아이돌그룹관리======");
			System.out.println("1. 아이돌그룹등록"); //C(Create)
			System.out.println("2. 아이돌그룹목록보기");//R(Read)
			System.out.println("3. 아이돌그룹정보 상세보기");//R(Read)
			System.out.println("4. 아이돌그룹정보 수정");
			System.out.println("5. 아이돌그룹정보 삭제");
			System.out.println("6. 아이돌그룹정보 검색");
			System.out.println("7. 프로그램종료");
			
			System.out.print("메뉴번호 : ");
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
			case 5: //삭제 케이스
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






