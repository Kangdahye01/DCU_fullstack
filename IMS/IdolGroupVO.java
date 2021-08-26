package vo; //ValueObject, java패턴에 실존, 값을 저장하는 클래스 
//idolgroup하나의 정보를 저장할수있는 클래스
//아이돌 그룹의 정보를 저장
//정보의 단위(단위의 데이터)를 클래스로 정의해놓은것

public class IdolGroupVO {
	private String name; //식별자
	private String gender;
	private int generation;
	private int year;
	private String nation;
	private String album;
	private String company;
	
	//Accessor
	public String getName() { 
		//이 밑으로는 아이돌 그룹의 정보를 등록해놓음
		//그룹이름,성별,나이대,데뷔년도,국적,소속사 등등
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}