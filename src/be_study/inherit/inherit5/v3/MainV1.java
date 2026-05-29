package be_study.inherit.inherit5.v3;

import java.util.ArrayList;
import java.util.List;

public class MainV1 {

	public static void main(String[] args) {
		

		List<Cleaner> list = new ArrayList<>();
		
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		
		for(Cleaner c : list) {
			c.doClean();
			// 실행시 각자 재정의된 기능을 실행
		}
		
		//동일한 사용법으로 다양한 실행 결과를 도출
		//다형성
		
		//list.get(0).removeDust();
		
		
	
		
//		DustCleaner[] dustArr = new DustCleaner[3];
//		dustArr[0]= new DustCleaner();
//		dustArr[1]= new DustCleaner();
//		dustArr[2]= new DustCleaner();
		
		//ArrayList<FloorCleaner> floorList= new ArrayList<FloorCleaner>();
		List<FloorCleaner>floorList = new ArrayList<>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		
		List<WindowCleaner>windowList = new ArrayList<>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		
//		for(int i=0; i<dustArr.length; i ++) {
//			dustArr[i].removeDust();
//		}
		
//		for(int i=0; i<floorList.size(); i ++) {
//			floorList.get(i).cleanFloor();
//		}
//		
//		
//		for(WindowCleaner wc : windowList) {
//			wc.washWindow();
//		}
//		
	}

}
