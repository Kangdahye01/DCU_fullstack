//패턴에 있는 클래스는 아님
//유틸성의 클래스 (보조적인 클래스)
//화면에는 없음
//사용자가 보는 화면에 사용하긴 하지만, 하나에 다 넣으면
//UI에서 너무 가독성이 떨어지고 코드가 길어짐
//이 클래스를 별도로 만들어서 UI의 가독성을 높이고 클래스를 보존

package util;

import java.util.Scanner;

import vo.IdolGroupVO;
import vo.SearchVO;

public class ConsoleUtil {

	public IdolGroupVO getNewIdolGroupVO(Scanner sc) {
		// TODO Auto-generated method stub
		IdolGroupVO newIdolGroupVO = new IdolGroupVO();
		System.out.println("====새 아이돌 그룹 정보====");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("성별 : ");
		String gender = sc.next();
		System.out.print("나이대 : ");
		int generation = sc.nextInt();
		System.out.print("데뷔년도 : ");
		int year = sc.nextInt();
		System.out.print("국가 : ");
		String nation = sc.next();
		System.out.print("앨범 : ");
		String album = sc.next();
		System.out.print("소속사 : ");
		String company = sc.next();

		newIdolGroupVO.setAlbum(album);
		newIdolGroupVO.setCompany(company);
		newIdolGroupVO.setGender(gender);
		newIdolGroupVO.setGeneration(generation);
		newIdolGroupVO.setName(name);
		newIdolGroupVO.setNation(nation);
		newIdolGroupVO.setYear(year);
		return newIdolGroupVO;
	}

	public void printRegisterSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 그룹 등록 성공");
	}
	public void printRegisterFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 그룹 등록 실패");
	}

	public void printIdolGroupList(IdolGroupVO[] idolGroupList) {
		//배열 0번 index부터 반복하며 data출력
		if(idolGroupList.length == 0) {
			//이름이 하나도 등록 안되어 있다면,
			System.out.println("등록된 아이돌 그룹 정보가 없습니다.");
		}
		else { //이름이 등록되어 있다면
			System.out.println("아이돌 그룹 목록"); //이름 출력
			for (int i = 0; i < idolGroupList.length; i++) { //반복해서 이름들 출력
				System.out.println("그룹명: " + idolGroupList[i].getName() + 
						" 소속사 :" + idolGroupList[i].getCompany() + 
						"앨범 :" + idolGroupList[i].getAlbum() +
						"나이대 : " + idolGroupList[i].getGeneration());
			}
		}
	}

	public String getName(String label, Scanner sc) {
		//label을 받아옴
		System.out.println(label);//label을 출력
		return sc.next(); //반환된 값을 바로 리턴
	}

	public void printDetailIdolGroupVO(IdolGroupVO idolGroupVO) { //메소드 생성
		if(idolGroupVO == null) {//만약 검색해서 나오지 않으면(DB에 없으면)
			System.out.println("해당 아이돌 그룹이 존재하지 않습니다.");
		}
		else {
			System.out.println("해당 아이돌 그룹 정보."); //해당 그룹의 상세정보 검색
			System.out.print("그룹명: " + idolGroupVO.getName() + 
					" 소속사 : " + idolGroupVO.getCompany() + 
					" 앨범 : " + idolGroupVO.getAlbum() +
					" 나이대 : " + idolGroupVO.getGeneration());
		}
	}

	public IdolGroupVO getNewIdolGroupVO(IdolGroupVO oldIdolGroupVO, Scanner sc) {
		//수정하고싶은 정보를 사용자로부터 입력 받음
		IdolGroupVO newIdolGroupVO = new IdolGroupVO();
		System.out.println("====새 아이돌 그룹 정보====");
		//		System.out.print("이름 : ");//이름은 식별자이기 때문에 수정하면 안됨
		//		String name = sc.next();

		//이전정보를 받아서 수정
		System.out.println("이전 성별 :" + oldIdolGroupVO.getGender());
		System.out.print("성별 : ");
		String gender = sc.next();

		System.out.println("이전 나이대 :" + oldIdolGroupVO.getGeneration());
		System.out.print("나이대 : ");
		int generation = sc.nextInt();

		System.out.println("이전 데뷔년도 :" + oldIdolGroupVO.getYear());
		System.out.print("데뷔년도 : ");
		int year = sc.nextInt();

		System.out.println("이전 국가 :" + oldIdolGroupVO.getNation());
		System.out.print("국가 : ");
		String nation = sc.next();

		System.out.println("이전 앨범 :" + oldIdolGroupVO.getAlbum());
		System.out.print("앨범 : ");
		String album = sc.next();

		System.out.println("이전 소속사 :" + oldIdolGroupVO.getCompany());
		System.out.print("소속사 : ");
		String company = sc.next();

		newIdolGroupVO.setAlbum(album);
		newIdolGroupVO.setCompany(company);
		newIdolGroupVO.setGender(gender);
		newIdolGroupVO.setGeneration(generation);
		newIdolGroupVO.setName(oldIdolGroupVO.getName());
		//사용자로부터 받는 부분이 없기 때문에
		//이전의 이름을 그대로 받아와서 사용 (식별자라 변경불가)
		newIdolGroupVO.setNation(nation);
		newIdolGroupVO.setYear(year);
		return newIdolGroupVO; //수정후 리턴
	}

	public void printModifySuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 정보 수정 성공");

	}

	public void printModifyFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 정보 수정 실패");
	}

	public String getDelName(String label, Scanner sc) {
		//label을 받아옴
		System.out.println(label);//label을 출력
		return sc.next(); //반환된 값을 바로 리턴
	}



	public void printDeleteSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 삭제 성공");
	}

	public void printDeleteFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 삭제 실패");
	}

	public void printRemoveSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name +"그룹 삭제 완료");
	}
	public void printRemoveFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name +"그룹 삭제 실패");
	}

	//검색에 필요한 값들을 사용자로부터 입력받아 반환해주는 method
	public SearchVO getSearchVO(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("검색 조건 (이름 | 나이대) : ");//출력
		String searchCondition = sc.next();//사용자가 입력한 조건

		if(searchCondition.equals("이름")) { //searchCondition이 이름인 경우
			System.out.println("검색할 그룹명 : ");
		}
		else if(searchCondition.equals("나이대")) { //searchCondition이 나이대인 경우
			System.out.println("검색할 나이대 : ");
		}
		String searchValue =  "";//사용자가 입력한 값
		return new SearchVO(searchCondition, searchValue);
	}

	public void printSearchIdolGroupVO(IdolGroupVO searchIdolGroupVO) {
		// TODO Auto-generated method stub
		if(searchIdolGroupVO == null) {
			System.out.println("검색된 정보가 없습니다.");
			//검색된 이름이 없으면 출력
		}
		else {
			System.out.println("이름으로 검색한 결과");
			System.out.print("그룹명: " + searchIdolGroupVO.getName() + 
					" 소속사 : " + searchIdolGroupVO.getCompany() + 
					" 앨범 : " + searchIdolGroupVO.getAlbum() +
					" 나이대 : " + searchIdolGroupVO.getGeneration());
			//메소드에 전달된 파라미터 변수의 이름으로 변경함
		}
	}
		public void printSearchIdolGroupVOArray(IdolGroupVO[] searchIdolGroupVOArray) {
			// TODO Auto-generated method stub
			if(searchIdolGroupVOArray.length == 0) {
				System.out.println("검색된 아이돌그룹 정보가 없습니다.");
			}
			else {
				System.out.println("검색된 아이돌 그룹목록");
				for (int i = 0; i < searchIdolGroupVOArray.length; i++) {
					System.out.println("그룹명 : " + searchIdolGroupVOArray[i].getName() + 
							"소속사 : " + searchIdolGroupVOArray[i].getCompany() + 
							"앨범 : " + searchIdolGroupVOArray[i].getAlbum() +
							"나이대 : " + searchIdolGroupVOArray[i].getGeneration());
				}
			}
		}
	}

