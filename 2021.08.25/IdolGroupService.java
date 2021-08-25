package service;

import vo.IdolGroupVO;

public class IdolGroupService {
	private IdolGroupVO[] idolGroupList;
	
	public IdolGroupService() {
		// TODO Auto-generated constructor stub
		idolGroupList = new IdolGroupVO[0];
	}

	public boolean registNewIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		// TODO Auto-generated method stub
		boolean registSuccess = true;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(newIdolGroupVO.getName())) {
				registSuccess = false;
				break;
			}
		}
		if(registSuccess) {
			IdolGroupVO[] tempArray = idolGroupList;
			idolGroupList = new IdolGroupVO[tempArray.length + 1];
			
			for (int i = 0; i < tempArray.length; i++) {
				idolGroupList[i] = tempArray[i];
			}
			
			idolGroupList[idolGroupList.length - 1] = newIdolGroupVO;
		}
		return registSuccess;
	}

	public IdolGroupVO[] getIdolGroupList() {
		// TODO Auto-generated method stub
		
		return idolGroupList;
	}

	public IdolGroupVO getDetailIdolGroupVO(String name) {
		// TODO Auto-generated method stub
		IdolGroupVO idolGroupVO = null;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				idolGroupVO = idolGroupList[i];
				break;
			}
		}
		return idolGroupVO;
	}

	public IdolGroupVO getOldIdolGroupVO(String name) {
		// TODO Auto-generated method stub
		IdolGroupVO idolGroupVO = null;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				idolGroupVO = idolGroupList[i];
				break;
			}
		}
		return idolGroupVO;
	}

	public boolean modifyIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		// TODO Auto-generated method stub
		boolean modifySuccess = false;
		//1. 현재 배열에서 인자로 넘어온 idolGropVO객체(수정할 정보를 가지고 있는 객체)
		//의 name 속성값과 동일한 name 속성값을 가지고 있는 idolGroupVO 객체를 찾는다.
		
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals
					(newIdolGroupVO.getName())) {
				//2. 해당 인덱스 영역의 참조하는 객체를 인자로 넘어온 새로운 객체의
				//위치값으로 변경한다.
				idolGroupList[i] = newIdolGroupVO;
				modifySuccess = true;
				break;
				
			}
		}
		return modifySuccess;
	}

	public boolean removeIdolGroupVO(String name) {
		// TODO Auto-generated method stub
		boolean removeSuccess = false;
		//삭제할 IdolGroupVO 객체를 참조하고 있는 배열의 인덱스 검색
		
		//배열의 인덱스 값을 구하는 로직에서는 인덱스값을 저장하는 변수의 초기값은
		//-1로 지정하는 것이 관습이다.
		int index = -1;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			IdolGroupVO[] tempArray = idolGroupList;
			idolGroupList = new IdolGroupVO[tempArray.length - 1];
			
			for (int i = 0; i < tempArray.length; i++) {
				if(i < index) {
					idolGroupList[i] = tempArray[i];
				}
				else if(i > index) {
					idolGroupList[i-1] = tempArray[i];
				}
			}
			removeSuccess = true;
		}
		
		
		return removeSuccess;
	}

	public IdolGroupVO searchIdolGroupVOByName(String name) {
		// TODO Auto-generated method stub
		IdolGroupVO idolGroupVO = null;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				idolGroupVO = idolGroupList[i];
				break;
			}
		}
		return idolGroupVO;
	}

	public IdolGroupVO[] searchIdolGroupVOArrayByGeneration(String generation) {
		// TODO Auto-generated method stub
		//반환되는 배열의 크기가 다양하다.
		//----> 검색된 IdolGroupVO의 개수로 최종 반환할 배열의 크기를 지정해야 한다.
		IdolGroupVO[] searchArray = null;
		int count = 0;
		
		//검색조건에 맞아서 찾아진 IdolGroupVO객체들을 저장할 배열 생성
		IdolGroupVO[] tempArray = 
				new IdolGroupVO[idolGroupList.length];
		
		//idolGroupList 배열에서 조건에 맞는 IdolGroupVO 객체들을 찾아서
		//tempArray에 저장
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getGeneration() == Integer.parseInt(generation)) {
				tempArray[count++] = idolGroupList[i];
			}
		}

		searchArray = new IdolGroupVO[count];
		
		for (int i = 0; i < count; i++) {
			searchArray[i] = tempArray[i];
		}
		
		return searchArray;
	}
}




