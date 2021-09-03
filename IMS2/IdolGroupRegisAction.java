package action;

import java.util.Scanner;
//넓은 의미의 Controller
//비지니스 로직은 Service 클래스에 구현
//Action 클래스는 Service 클래스에서 비지니스 로직을 처리하기 위한 전후처리 작업을 함.
//예를들면 : 등록을 하려면 등록할 정보를 받는 작업 등
//비지니스 로직이 처리가 된 후 사용자에게 보여주는 화면을 만드는 작업 -> action

import service.IdolGroupService;
//import service.IdolGroupService;
import util.ConsoleUtil;

public class IdolGroupRegisAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		vo.IdolGroupVO newIdolGroupVO = consoleUtil.getNewIdolGroupVO(scanner);
		
		IdolGroupService idolGroupService = new IdolGroupService() ;
		
		boolean registSuccess = idolGroupService.registIdolGroupVO(newIdolGroupVO);
		
		if(registSuccess) {
			consoleUtil.printRegistSuccessMessage(newIdolGroupVO.getName());
		}
		else {
			consoleUtil.printRegistFailMessage(newIdolGroupVO.getName());
		}
	}

}
