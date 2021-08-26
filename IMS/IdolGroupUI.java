//IMS(IdolManagementSystem, Model2개발방식)
//UI(UserInterface), 사용자가 사용하며 보는 화면을 출력
//1. 사용자 요청을 받음
//비즈니스로직, 사용자가 요청한것을 실질적으로 구현(처리)해주는 로직
//원래 추가적으로 도와주는 다른 것들이 있으나, 배우지 않았으므로 메모리에만 저장
//DB에 IdolGroup의 정보를 저장할수있어야 하지만, DB가 없기 때문에, 메모리에만 추가하는것.

package UI; //vo 패키지
import java.util.Scanner; //파일들을 사용하기 위한 API들을 import
import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;
import vo.SearchVO;

public class IdolGroupUI { //class명 선언

	public static void main(String[] args) { //메소드 선언
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //스캐너를 import(입력값을 받아주기 위함)
		sc.useDelimiter(System.getProperty("line.separator"));
		//System.getProperty : API, 띄워쓰기 인식. 시스템 속성값을 반환
		//line.separator : 라인 구분하는 인식자
		boolean stop = false; //반복구문을 멈추기 위함
		IdolGroupService idolGroupService //새로운 객체를 생성
		= new IdolGroupService();
		ConsoleUtil consoleUtil = new ConsoleUtil(); //새로운 객체 생성
		do { //do-while 구문 사용
			System.out.println("======IdolGroupManagement=======");//화면에 출력되는것
			System.out.println("1. 아이돌그룹등록"); //C(Create)
			System.out.println("2. 아이돌그룹목록보기"); //R(Read)
			System.out.println("3. 아이돌그룹정보상세보기"); //R(Read)
			System.out.println("4. 아이돌그룹정보수정");
			System.out.println("5. 아이돌그룹정보삭제");
			System.out.println("6. 아이돌그룹정보검색");
			System.out.println("7. 프로그램종료");

			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt(); //메뉴 번호를 입력받음

			switch (menuNum) { //switch구문을 통한 번호 입력의 경우 생성
			case 1: { //1번을 입력했을때,
				IdolGroupVO newIdolGroupVO =  //새로운IdolGroupVO를 사용
						consoleUtil.getNewIdolGroupVO(sc); //ConsoleUtil에서 새로운 아이돌 그룹을 신청
				boolean registerSuccess =  //등록이 성공한다면,
						idolGroupService.registNewIdolGroupVO(newIdolGroupVO); //배열에 새로운 아이돌그룹을 등록
				if(registerSuccess) { //만약에 등록에 성공하면
					consoleUtil.printRegisterSuccessMessage(newIdolGroupVO.getName());
				}//콘솔에 등록성공 구문을 새로운 그룹명과 함께 출력
				else {
					consoleUtil.printRegisterFailMessage(newIdolGroupVO.getName());
				}//실패하면 실패구문 출력
				break;//반복문 탈출
			}

			case 2:
				IdolGroupVO[] idolGroupList = idolGroupService.getIdolGroupList();
				//기존에 메모리에 저장된 VO를 읽어옴
				//DB에서 자료를 가져오면 비즈니스로직으로 처리
				consoleUtil.printIdolGroupList(idolGroupList);
				//consoleUtil에서 그룹목록을 가져옴
				break;

			case 3:
				String name = consoleUtil.getName("상세내용을 볼 아이돌 그룹 이름 :", sc);
				//label 부분만 인자 처리함 ("상세내용을 볼 아이돌 그룹 이름 :") 만 변경
				//이름 얻어오는것이 뒤의 3가지 메뉴에서도 필요함
				//label만 바뀌고 나머지는 같음
				IdolGroupVO idolGroupVO = //리턴타입 설정
						idolGroupService.getDetailIdolGroupVO(name);
				//해당 이름을 갖고있는 아이돌 그룹 정보를 가져옴
				consoleUtil.printDetailIdolGroupVO(idolGroupVO);
				//이름을 가져와서 출력
				break;
				//반복문 탈출

			case 4:
				name = consoleUtil.getName("수정할 아이돌그룹명 :", sc);
				//사용자로부터 받은 이름을
				//consoleUtil에서 이름을 찾아옴
				IdolGroupVO oldIdolGroupVO = idolGroupService.getoldIdolGroupVO(name);
				//Service 쪽 요청해야함 VO이기 때문				
				IdolGroupVO newIdolGroupVO = consoleUtil.getNewIdolGroupVO(oldIdolGroupVO,sc);
				//수정하고싶은 정보를 사용자로부터 입력 받음
				//사용자가 입력하기 때문에 consoleUtil
				//옛날것도 출력해줘야하기 때문에 첫번째 인자로 던져주고
				//두번째것도 받아옴
				boolean modifySuccess = idolGroupService.modifyIdolGroupVO(newIdolGroupVO); 
				//정보를 받아옴
				if(modifySuccess) { //성공했다면
					consoleUtil.printModifySuccessMessage(newIdolGroupVO.getName());
				}
				else { //실패했다면
					consoleUtil.printModifyFailMessage(newIdolGroupVO.getName());
				}
				break;
			case 5 :
				name = consoleUtil.getName("삭제할 그룹명을 입력하세요. : ", sc);
				//삭제할 그룹명을 받음
				boolean removeSuccess = idolGroupService.removeIdolGroupVO(name);
				//삭제할 이름을 DB에서 가져옴
				if(removeSuccess) {
					consoleUtil.printRemoveSuccessMessage(name);
				}
				else {
					consoleUtil.printRemoveFailMessage(name);
				}
				break;
			case 6 :
				//1. 검색에 필요한 정보(검색조건,검색값)를 사용자로부터 입력받는다.
				SearchVO searchVO = consoleUtil.getSearchVO(sc);
				
				//2. 검색 조건에 따라서 아이돌 그룹 검색
				//이름으로 검색할때는 리턴타입이 IdolGroupVO 이고,
				//나이대로 검색하면 리턴타입이 IdolGroupVO[] 이므로
				//리턴타입이 달라서 하나의 메소드로 처리 불가
				if(searchVO.getSearchCondition().contentEquals("이름")) {
					//만약 사용자가 검색한 이름과 등록된이름이 같다면
					IdolGroupVO serachIdolGroupVO = 
							idolGroupService.searchIdolGroupVOByName(searchVO.getSearchValue());
					consoleUtil.printSearchIdolGroupVO(serachIdolGroupVO);
					//VO기 때문에 서비스에서 검색한것과 같은 이름을 찾고 출력
				}
				else {
					//변수나 메소드이름을 줄때 무리하게 줄여서 의미가 모호해지는것 보단
					//이름이 긴게 나음
					IdolGroupVO[] searchIdolGroupVOArray =
							idolGroupService.searchIdolGroupVOArrayByGeneration
							(searchVO.getSearchValue());
							consoleUtil.printSearchIdolGroupVOArray(searchIdolGroupVOArray);
				}
				break;
			}
		} while (!stop); //반복문 멈춤
	}

}
