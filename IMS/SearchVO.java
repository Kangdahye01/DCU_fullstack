package vo;

public class SearchVO {
	private String searchCondition; //검색조건
	private String searchValue; //검색값
	
	public SearchVO(String searchCondition, String searchValue) { 
		//손쉽게 객체를 초기화하고 정의
		this.searchCondition = searchCondition;
		this.searchValue = searchValue;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
}
