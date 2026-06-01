package be_study.inter.inter03;

public class InterfaceMian {

	public static void main(String[] args) {
		
		Iphone p1 = new Iphone ();
		GalaxyPhone p2 = new GalaxyPhone();
		LgPhone p3 = new LgPhone();
		
		Callable c1 = new Iphone();
		Callable c2 = new GalaxyPhone();
		Callable c3 = new LgPhone();
		
		Person p = new Person();
		p.callPhone = p1;
		p.call("1234");
		
		p.callPhone = p2;
		p.call("1234");
		
		p.callPhone = p3;
		p.call("1234");
		
		BluetoothSpeaker bs = new BluetoothSpeaker();
		
		Connectable cc= bs;
		cc= (Connectable) p2;
	}

}
