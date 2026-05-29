package be_study.inherit.inherit3;

public class MikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Mike m1 = new Mike();
			m1.type = "마이크";
			m1.volumUp();
			m1.check();
			
			WirelessMike m2 = new WirelessMike();
			m2.type = "무선마이크";
			m2.check();
			m2.volumUp();
			
			BluetoothMike m3= new BluetoothMike();
			m3.volumUp();
			m3.isConnected = false;
			m3.battery = 50;
			System.out.println("---BluetoothMike m3---");
			m3.check();
			m3.volumUp();
			m3.volumUp(5);
		}

}
