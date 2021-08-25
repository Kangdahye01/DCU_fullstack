package util;

import java.util.Scanner;

import vo.IdolGroupVO;
import vo.SearchVO;

public class ConsoleUtil {

	public IdolGroupVO getNewIdolGroupVO(Scanner scanner) {
		// TODO Auto-generated method stub
		IdolGroupVO newIdolGroupVO = new IdolGroupVO();
		System.out.println("====새 아이돌그룹정보====");
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.print("성별 : ");
		String gender = scanner.next();
		System.out.print("나이대 : ");
		int generation = scanner.nextInt();
		System.out.print("대뷔년도 : ");
		int year = scanner.nextInt();
		System.out.print("국가 : ");
		String nation = scanner.next();
		System.out.print("소속사 : ");
		String company = scanner.next();
		System.out.print("앨범 : ");
		String album = scanner.next();
		
		newIdolGroupVO.setAlbum(album);
		newIdolGroupVO.setCompany(company);
		newIdolGroupVO.setGender(gender);
		newIdolGroupVO.setGeneration(generation);
		newIdolGroupVO.setName(name);
		newIdolGroupVO.setNation(nation);
		newIdolGroupVO.setYear(year);
		return newIdolGroupVO;
	}

	public void printRegistSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 그룹 등록 성공");
	}
	public void printRegistFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 그룹 등록 실패");
	}

	public void printIdolGroupList(IdolGroupVO[] idolGroupList) {
		// TODO Auto-generated method stub
		if(idolGroupList.length == 0) {
			System.out.println("등록된 아이돌그룹 정보가 없습니다.");
		}
		else {
			System.out.println("아이돌 그룹목록");
			for (int i = 0; i < idolGroupList.length; i++) {
				System.out.println("그룹명 : " + idolGroupList[i].getName() + 
						"소속사 : " + idolGroupList[i].getCompany() + 
						"앨범 : " + idolGroupList[i].getAlbum() +
						"나이대 : " + idolGroupList[i].getGeneration());
			}
		}
	}

	public String getName(String label, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print(label);
		return scanner.next();
	}

	public void printDetailIdolGroupVO(IdolGroupVO idolGroupVO) {
		// TODO Auto-generated method stub
		if(idolGroupVO == null) {
			System.out.println("해당 아이돌 그룹이 존재하지 않습니다.");
		}
		else {
			System.out.println("해당 아이돌 그룹 정보");
			System.out.println("그룹명 : " + idolGroupVO.getName() + 
					"소속사 : " + idolGroupVO.getCompany() + 
					"앨범 : " + idolGroupVO.getAlbum() +
					"나이대 : " + idolGroupVO.getGeneration());
		}
	}

	public IdolGroupVO getNewIdolGroupVO(IdolGroupVO oldIdolGroupVO, Scanner scanner) {
		// TODO Auto-generated method stub
		IdolGroupVO newIdolGroupVO = new IdolGroupVO();
		System.out.println("====새 아이돌그룹정보====");
		
		System.out.println("이전 성별 : " + oldIdolGroupVO.getGender());
		System.out.print("성별 : ");
		String gender = scanner.next();
		
		System.out.println("이전 나이대 : " + oldIdolGroupVO.getGeneration());
		System.out.print("나이대 : ");
		int generation = scanner.nextInt();
		
		System.out.println("이전 데뷰년도 : " + oldIdolGroupVO.getYear());
		System.out.print("대뷔년도 : ");
		int year = scanner.nextInt();
		
		System.out.println("이전 국가 : " + oldIdolGroupVO.getNation());
		System.out.print("국가 : ");
		String nation = scanner.next();
		
		System.out.println("이전 소속사 : " + oldIdolGroupVO.getCompany());
		System.out.print("소속사 : ");
		String company = scanner.next();
		
		System.out.println("이전 앨범 : " + oldIdolGroupVO.getAlbum());
		System.out.print("앨범 : ");
		String album = scanner.next();
		
		newIdolGroupVO.setAlbum(album);
		newIdolGroupVO.setCompany(company);
		newIdolGroupVO.setGender(gender);
		newIdolGroupVO.setGeneration(generation);
		newIdolGroupVO.setName(oldIdolGroupVO.getName());
		newIdolGroupVO.setNation(nation);
		newIdolGroupVO.setYear(year);
		return newIdolGroupVO;
	}

	public void printModifySuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 아이돌 그룹 정보 수정 성공");
	}
	public void printModifyFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 아이돌 그룹 정보 수정 실패");
	}

	public void printRemoveSuccessMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 아이돌 그룹 삭제 성공");
	}
	public void printRemoveFailMessage(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 아이돌 그룹 삭제 실패");
	}

	//검색에 필요한 값들을 사용자로부터 입력받아서 반환
	public SearchVO getSearchVO(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print("검색조건 (이름 | 나이대) : ");
		String searchCondition = scanner.next();
	
		
		if(searchCondition.contentEquals("이름")) {
			System.out.print("검색할 이름 : ");
		}
		else if(searchCondition.contentEquals("나이대")) {
			System.out.print("검색할 나이대 : ");
		}
		
		String searchValue = scanner.next();
		
		
		return new SearchVO(searchCondition, searchValue);
	}

	public void printSearchIdolGroupVO(IdolGroupVO searchIdolGroupVO) {
		// TODO Auto-generated method stub
		if(searchIdolGroupVO == null) {
			System.out.println("검색된 정보가 없습니다.");
		}
		else {
			System.out.println("이름으로 검색한 결과");
			System.out.println("그룹명 : " + searchIdolGroupVO.getName() + 
					"소속사 : " + searchIdolGroupVO.getCompany() + 
					"앨범 : " + searchIdolGroupVO.getAlbum() +
					"나이대 : " + searchIdolGroupVO.getGeneration());
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
