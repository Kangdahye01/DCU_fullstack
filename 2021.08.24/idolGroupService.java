package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import vo.IdolGroupVO;

public class IdolGroupService {
	private IdolGroupVO[] idolGroupList;
	
	public IdolGroupService() {
		idolGroupList = new IdolGroupVO[0];
	}

	public boolean registNesIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		boolean registSuccess = true;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(newIdolGroupVO.getName())) { // 등록하려는 이름과 배열에 같은 이름이 있는지 확인
				registSuccess = false; // 동일한 이름이 있을 경우 등록실패처리
				break;
			}
		}
		if (registSuccess) { // 등록이 됐을 경우
			IdolGroupVO[] tempArray = idolGroupList;
			idolGroupList = new IdolGroupVO[tempArray.length + 1];
			
			for (int i = 0; i < tempArray.length; i++) {
				idolGroupList[i] = tempArray[i];
			}
			idolGroupList[idolGroupList.length-1] = newIdolGroupVO; // 마지막배열에 등록한 이름 저장
		}
		return registSuccess;
	}

	public IdolGroupVO[] getIdolGroupList() {
		return idolGroupList ;
	}

	public IdolGroupVO getDetailIdolGroupVO(String name) {
		IdolGroupVO idolGroupVO = null;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) { // 등록하려는 이름과 배열에 같은 이름이 있는지 확인
				idolGroupVO = idolGroupList[i]; // 동일한 이름이 있을 경우 등록실패처리
				break;
			}
		}
		return idolGroupVO;
	}

	public IdolGroupVO getOldIdolGroupVO(String name) {
		IdolGroupVO idolGroupVO = null;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) { // 등록하려는 이름과 배열에 같은 이름이 있는지 확인
				idolGroupVO = idolGroupList[i]; // 동일한 이름이 있을 경우 등록실패처리
				break;
			}
		}
		return idolGroupVO;

	}

	public boolean modifyIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		// TODO Auto-generated method stub
		boolean modifySuccess = false;
		//1. 현재 배열에서 인자로 넘어온 idolGroupVO 객체 (수정할 정보를 가지고 있는 객체)의 name 속성값과 동일한 name 속성값을 가지고 있는
		//idolGroupVO 객체를 찾는다. 
		
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(newIdolGroupVO.getName())) {
				//2. 해당 이덱스 영역의 참조하는 객체를 인자로 넘어온 새로운 객체의 위치값으로 변경한다.
				idolGroupList[i] = newIdolGroupVO;
				modifySuccess = true;
				break;
			} 
		}
		return modifySuccess;
	}

	public boolean  removeIdolGroupVO(String name) {
		// TODO Auto-generated method stub
		boolean removeSuccess = false;
		//삭제할 IdolGroupVO 객체를 참조하고 있는 배열의 인덱스 검색
		//배열의 인덱스 값을 구하는 로직에서는 인덱스값을 저장하는 변수의 초기값은 -1로 지정하는 것이 관습이다. 
		int index = -1;
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getName().contentEquals(name)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			IdolGroupVO[] tempArray = idolGroupList;
			idolGroupList = new IdolGroupVO[tempArray.length-1];
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

}
