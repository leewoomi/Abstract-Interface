package shareData;

//위치정보를 가져오는 데이터
public class Location {

	public double latitude;
	public double longitude;

	public void getLocation() {
		// 생성자를 이용한 데이터 전달
		// Map map = new Map(latitude, longitude);
		
		//setter를 이용한 데이터 전달
		Map map = new Map();
		map.setLatitude(latitude);
		map.setLongitude(longitude);
		map.showMap();
	}
}
