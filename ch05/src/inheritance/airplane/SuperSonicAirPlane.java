package inheritance.airplane;

public class SuperSonicAirPlane extends AirPlane{

	@Override  //메서드 재정의
	public void fly() {
		//조건문 - 비행기가 초음속비행합니다.
		super.fly();  //비행기가 비행합니다.
	}
	
}
