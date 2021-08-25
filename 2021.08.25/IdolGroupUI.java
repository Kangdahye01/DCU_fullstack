package ui;

import java.util.Scanner;

import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;
import vo.SearchVO;

public class IdolGroupUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		//System.getProperty : 시스템 속성값을 반환
		
		boolean stop = false;
		IdolGroupService idolGroupService
		= new IdolGroupService();
		ConsoleUtil consoleUtil = new ConsoleUtil();
		
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
				IdolGroupVO newIdolGroupVO =
					consoleUtil.getNewIdolGroupVO(scanner);	
				boolean registSuccess = 
						idolGroupService.registNewIdolGroupVO(newIdolGroupVO);
				if(registSuccess) {
					consoleUtil.printRegistSuccessMessage(newIdolGroupVO.getName());
				}
				else {
					consoleUtil.printRegistFailMessage(newIdolGroupVO.getName());
				}
				break;
			}
			
			case 2:
				IdolGroupVO[] idolGroupList = 
				idolGroupService.getIdolGroupList();
				consoleUtil.printIdolGroupList(idolGroupList);
				break;
			case 3:
				String name = 
				consoleUtil.getName("상세내용을 볼 아이돌그룹이름 :", scanner);
				IdolGroupVO idolGroupVO = 
						idolGroupService.getDetailIdolGroupVO(name);
				consoleUtil.printDetailIdolGroupVO(idolGroupVO);
				break;
			case 4:
				name = 
				consoleUtil.getName("수정할 아이돌그룹이름 :", scanner);
				
				IdolGroupVO oldIdolGroupVO = 
						idolGroupService.getOldIdolGroupVO(name);
				IdolGroupVO newIdolGroupVO = 
						consoleUtil.getNewIdolGroupVO(oldIdolGroupVO, scanner);
				boolean modifySuccess = 
						idolGroupService.modifyIdolGroupVO(newIdolGroupVO);
				if(modifySuccess) {
					consoleUtil.printModifySuccessMessage(newIdolGroupVO.getName());
				}
				else {
					consoleUtil.printModifySuccessMessage(newIdolGroupVO.getName());
				}
				break;
			case 5:
				name = consoleUtil.getName("삭제할 아이돌 그룹 이름 : ",
						scanner);
				boolean removeSuccess = 
						idolGroupService.removeIdolGroupVO(name);
				if(removeSuccess) {
					consoleUtil.printRemoveSuccessMessage(name);
				}
				else {
					consoleUtil.printRemoveFailMessage(name);
				}
				break;
			case 6:
				//1.검색에 필요한 정보(검색조건, 검색값)를 사용자로부터 입력 받는다.
				SearchVO searchVO = consoleUtil.getSearchVO(scanner);
				
				//2. 검색조건에 따라서 아이돌 그룹 검색
				//이름으로 검색할때는 리턴타입이 IdolGroupVO 이고
				//나이대로 검색하면 리터타입이 IdolGroupVO[] 이므로
				if(searchVO.getSearchCondition().contentEquals("이름")) {
					IdolGroupVO searchIdolGroupVO = 
							idolGroupService.searchIdolGroupVOByName(searchVO.getSearchValue());
					consoleUtil.printSearchIdolGroupVO(searchIdolGroupVO);
				}
				else {
					//변수나 메소드이름을 줄때 무리하게 줄여서 의미가 모호해지는 것보다는
					//이름이 긴게 낮게
					IdolGroupVO[] searchIdolGroupVOArray =
	idolGroupService.searchIdolGroupVOArrayByGeneration
	(searchVO.getSearchValue());
	consoleUtil.printSearchIdolGroupVOArray(searchIdolGroupVOArray);
				}
				break;
			default:
			}
		} while (!stop);
	}

}






