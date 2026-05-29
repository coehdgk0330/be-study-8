package be_study.inherit.inherit3;

public class BluetoothMike extends Mike {
	//블루투스 마이크는 마이크다
	boolean isConnected; //연결여부 상태
	int battery; //배터리 잔량
	
	//별도의 각자 필요한 메소드 확장
	public void connect() {
		//블루투스 연결합니다
	}
	
	//기존에 있던 메소드 활용 -> check();
	
	//기존 메소드 업그레이드 (재정의)
	
	public void volumUp() {
		System.out.println("BluetoothMike volumUp() 재정의");
	}
	public void volumUp(int v) {
		System.out.println(v+"만큼 볼륨 증가 BluetoothMike volumUp(int v) 재정의 ");
	}
	
	//부모클래스 final 메소드 재정의 불가능
//	public void moMathod(){
// }
	
	
	
}
