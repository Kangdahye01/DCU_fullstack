package action;

import java.util.Scanner;

import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;

public class IdolGroupModifyAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		String name = consoleUtil.getName("������ ���̵� �׷� �̸� : ", scanner);
		IdolGroupService idolGroupService = new IdolGroupService();
		IdolGroupVO oldIdolGroupVO = idolGroupService.getoldIdolGroupVO(name);
		IdolGroupVO newIdolGroupVO = consoleUtil.getNewIdolGroupVO(oldIdolGroupVO, scanner);
		
		boolean modifySuccess = idolGroupService.modifyIdolGroupVO(newIdolGroupVO);
		
		if(modifySuccess) {
			consoleUtil.printModifySuccessMessage(name);
		}
		else {
			consoleUtil.printModifyFailMessage(name);
		}
	}

}
