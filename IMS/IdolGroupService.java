package service; //service 패키지
//SpringFrameWork에서 사용
//비즈니스 로직 구현
//메모리에 배열객체를 만들고, 배열객체를 CRUD작업을 실행
//CRUD란? Create,Read,Update,Delete작업
//IdolGroupVO과 IdolGroupService를 상호간에 사용
//IdolGroupVO로 배열을 사용


import vo.IdolGroupVO; //IdolGroupVO를(다른 패키지)import

public class IdolGroupService { //클래스명 선언
	private IdolGroupVO[] idolGroupList;	//접근제한을 동일 클래스에서만 한정
	//IdolGroup이라는 이름으로 새로운 배열 생성

	public IdolGroupService() { //메소드를 만듦
		// TODO Auto-generated constructor stub
		idolGroupList = new IdolGroupVO[0]; //새로운 배열을 만듦

	}

	public boolean registNewIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		//IdolGroup사용하여 배열에 신규 등록
		// TODO Auto-generated method stub
		boolean registerSuccess = true; //성공적으로 등록한다면
		for (int i = 0; i < idolGroupList.length; i++) { //반복문을 사용해서 배열의 길이를 늘려줌
			if(idolGroupList[i].getName().contentEquals(newIdolGroupVO.getName())) {
				//만약에 배열안에 있는 이름과 새로추가하려는 이름이 똑같다면
				registerSuccess = false; //실패
				break;//반복문 탈출
			}	
		}

		if(registerSuccess) { //만약 등록에 성공한다면
			IdolGroupVO[] tempArray = idolGroupList; //임시배열에 등록
			idolGroupList = new IdolGroupVO[tempArray.length + 1]; 
			//추가되면 기존에 있던 배열에 길이를 1 추가
			//계속 추가되며 크기가 커짐

			for (int i = 0; i < tempArray.length; i++) { //반복
				idolGroupList[i] = tempArray[i]; //기존의 리스트에 임시로 넣은 배열 추가
			}

			idolGroupList[idolGroupList.length - 1] = newIdolGroupVO; //길이를 1 감소시키고 새로운 VO에 등록
		}
		return registerSuccess; //성공값을 반환해줌
	}

	public IdolGroupVO[] getIdolGroupList() { //메소드를 새로 만듦
		// TODO Auto-generated method stub
		return idolGroupList;
	}
	public IdolGroupVO getDetailIdolGroupVO(String name) {
		IdolGroupVO idolGroupVO = null; //못찾으면 초기값 null 리턴
		for (int i = 0; i < idolGroupList.length; i++) { //반복문을 사용해서 배열의 길이를 늘려줌
			if(idolGroupList[i].getName().contentEquals(name)) {
				//만약에 배열안에 있는 이름과 검색하려는 이름이 똑같다면
				idolGroupVO = idolGroupList[i]; //찾아낸것을 참조
				break;//반복문 탈출
			}	
		}
		return idolGroupVO;//참조한것을 리턴
	}

	public IdolGroupVO getoldIdolGroupVO(String name) {
		IdolGroupVO idolGroupVO = null; //못찾으면 초기값 null 리턴
		for (int i = 0; i < idolGroupList.length; i++) { //반복문을 사용해서 배열의 길이를 늘려줌
			if(idolGroupList[i].getName().contentEquals(name)) {
				//만약에 배열안에 있는 이름과 검색하려는 이름이 똑같다면
				idolGroupVO = idolGroupList[i]; //찾아낸것을 참조
				break;//반복문 탈출
			}	
		}
		return idolGroupVO;	
	}

	public boolean modifyIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		// TODO Auto-generated method stub
		//수정작업하는 메소드
		boolean modifySuccess = false;
		//1. 현재 배열에서 인자로 넘어온 idolGroupVO 객체(수정할 정보를 가지고 있는 객체)
		//의 name 속성값과 동일한 name 속성값을 가지고 있는 idolGroupVO객체를 찾음

		for (int i = 0; i < idolGroupList.length; i++) { //이름을 찾기 위해 반복
			if(idolGroupList[i].getName().contentEquals(newIdolGroupVO.getName())){
				//만약에 배열에 있는 기존 이름과 수정하고자하는 이름이 같다면
				//2. 해당 index영역의 참조하는 객체를 인자로 넘어온 새로운 객체의 위치값으로 변경
				idolGroupList[i] = newIdolGroupVO; //정보변경
				modifySuccess = true; //성공했다면
				break;//반복문 탈출
			}
		}
		return modifySuccess; //성공한 값으로 리턴
	}

	public boolean removeIdolGroupVO(String name) {
		boolean removeSuccess = false;
		//삭제할 IdolGroupVO 객체를 참조하고 있는 배열의 index 검색

		//배열의 index값을 구하는 로직에서는 index값을 저장하는 변수의 초기값은
		//-1로 지정하는것이 관습
		int index = -1;
		for (int i = 0; i < idolGroupList.length; i++) { //반복하며 삭제할 대상을 찾음
			if(idolGroupList[i].getName().contentEquals(name)) {
				//만약 삭제할 대상과 데이터안의 이름이 같다면
				index = i;
				break;
			}
		}
		if(index != -1) { //index가 -1이 아니면
			IdolGroupVO[] tempArray = idolGroupList; //tempArray에 원래의 값을 백업
			idolGroupList = new IdolGroupVO[tempArray.length-1];
			for (int i = 0; i<tempArray.length;i++) {
				if(i < index) {
					idolGroupList[i] = tempArray[i];
				}
				else if(i > index) {
					idolGroupList[i-1] = tempArray[i];
				}
			}
			//새로운 배열 객체 생성 (기존 크기의 배열보다 1작은 객체)
			removeSuccess = true; //삭제 성공
		}
		//메소드 안에서 선언한 변수는 로컬변수(지역변수)
		//클래스 안에서 선언한 변수는 멤버변수
		//여기서는 tempArray가 로컬변수
		//로컬변수는 heap 영역에 남지 않고 메모리에 반납
		return removeSuccess;
	}

	public IdolGroupVO searchIdolGroupVOByName(String name) {
		IdolGroupVO idolGroupVO = null; //못찾으면 초기값 null 리턴
		for (int i = 0; i < idolGroupList.length; i++) { //반복문을 사용해서 배열의 길이를 늘려줌
			if(idolGroupList[i].getName().contentEquals(name)) {
				//만약에 배열안에 있는 이름과 검색하려는 이름이 똑같다면
				idolGroupVO = idolGroupList[i]; //찾아낸것을 참조
				break;//반복문 탈출
			}
		}
		return idolGroupVO;
	}

	public IdolGroupVO[] searchIdolGroupVOArrayByGeneration(String generation) {
		// TODO Auto-generated method stub
		//반환되는 배열의 크기가 다양
		//----> 검색된 IdolGroupVO의 갯수로 최종 반환할 배열의 크기를 지정해야 함
		IdolGroupVO[] searchArray = null; //새로운 배열 생성
		int count = 0;// 배열갯수는0으로 초기화
		//검색 조건에 맞아서 찾아진 IdolGroupVO 객체 들을 저장할 배열 생성
		IdolGroupVO[] tempArray = new IdolGroupVO[idolGroupList.length];
		
		//idolGroupList 배열에서 조건에 맞는 IdolGroupVO 객체들을 찾아서
		//tempArray에 저장하는 작업
		for (int i = 0; i < idolGroupList.length; i++) {
			if(idolGroupList[i].getGeneration() == Integer.parseInt(generation)) {
				tempArray[count++] = idolGroupList[i];
				//배열의 순서대로 검색
			}
		}
		searchArray = new IdolGroupVO[count];
		
		for (int i = 0; i < count; i++) {
			searchArray[i] = tempArray[i];
		}
		
		return searchArray;
	}
}

