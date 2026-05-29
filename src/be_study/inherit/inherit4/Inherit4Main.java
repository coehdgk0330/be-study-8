package be_study.inherit.inherit4;

import java.util.ArrayList;
import java.util.List;

import be_study.inherit.inherit3.BluetoothMike;
import be_study.inherit.inherit3.Mike;
import be_study.inherit.inherit3.WirelessMike;

public class Inherit4Main {

	public static void main(String[] args) {
		
		//타입변환
		//메소드 재정의
		//다형성
		
		int n = 10;
		double d = 10.5;
		double de2 = 50;
		
		Mike m1 =new Mike();
		BluetoothMike bm1 = new BluetoothMike();
		WirelessMike wm1 = new WirelessMike();
		
		m1.volumUp();
		bm1.volumUp();
		wm1.volumUp();
		
		//부모타입 변수 = 자식타입 객체
		Mike m4 = new BluetoothMike();
		Mike m5 = new WirelessMike();
		
		m4.volumUp();
		m5.volumUp();
		m5.check();
		
		
		//다형성
		int a = 10;
		int b = 20;
		int c = 30;
		int[] intArr = {10 , 20 , 30};	//한번에 관리 배열 같은 타입
				//int t = 10;	int t = 20;	int t = 30;
		
		BluetoothMike[]bArr = {bm1, new BluetoothMike(),new BluetoothMike()};
		
		Mike[] arr = {m1, bm1, wm1};
		Mike[] arr2 = {new Mike(), new BluetoothMike(), new WirelessMike()};
		Mike[] arr3 =new Mike[3];
		arr3[0] = new Mike();
		arr3[1] = new BluetoothMike();
		arr3[2] = new WirelessMike();
		
		ArrayList<Mike> mList = new ArrayList<Mike>();
		mList.add(new Mike());
		mList.add(new BluetoothMike());
		mList.add(new WirelessMike());
		
		for(Mike m : mList) {
			m.volumUp();
		}
		
		List<Mike> mList2 = new ArrayList<Mike>();
	}

}
