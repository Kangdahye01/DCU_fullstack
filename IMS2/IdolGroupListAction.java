package action;

import java.util.Scanner;

import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;

public class IdolGroupListAction implements Action {

	@Override
	public void execute(Scanner scanner) throws Exception {
		// TODO Auto-generated method stub
		IdolGroupService idolGroupService = new IdolGroupService();
		IdolGroupVO[] idolGroupArray = idolGroupService.getIdolGroupList();
		
		ConsoleUtil consoleUtil = new ConsoleUtil();
		consoleUtil.printIdolGroupList(idolGroupArray);
	}

}
