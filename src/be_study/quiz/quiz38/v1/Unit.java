package be_study.quiz.quiz38.v1;

public abstract class Unit {
	int x, y;
	
	void stop() {
		System.out.println("현재 위치에 정지");
	}
	
	abstract void move(int x , int y );
}
	//base code
	class Marine extends Unit { // 보병
	
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x + ", " + y +"까지 걸어서 이동");
	} 
	
	void stimPack() { /* .*/} //스팀팩을 사용한다
	}
	
	
	class Tank extends Unit{ // 탱크
	
	void move(int x, int y) { 
		this.x=x;
		this.y=y;
		System.out.println(x + ", " + y +"까지 바퀴를 굴려서 이동");
	}
	
	void changeMode() { /* . */} //공격모드를 변환한다
	}
	
	
	class Dropship extends Unit{ // 수송선
	
	void move(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println(x + ", " + y +"날아서 이동");
	} 
	
	void load() { /* .*/ } //선택된 대상을 태운다
	void unload() { /* .*/ }; //선택된 대상을 내린다
	}

