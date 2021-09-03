package action;

import java.util.Scanner;

import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;

public class IdolGroupRemoveAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		String name = consoleUtil.getName("������ ���̵� �׷� �̸� : ", scanner);
		IdolGroupService idolGroupService = new IdolGroupService();
		boolean IdolGroupRemoveAction = idolGroupService.removeIdolGroupVO(name);
		
		if(IdolGroupRemoveAction) {
			consoleUtil.printRemoveSuccessMessage(name);
		}
		else {
			consoleUtil.printRemoveFailMessage(name);
		}
		
	}

}
