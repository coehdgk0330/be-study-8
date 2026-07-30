package be_study.quiz.quiz54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Quiz54Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant1 = {
		"leo", "kiki", "eden"
		};
		String[] completion1 = {
		"eden", "kiki"
		};

		String[] participant2 = {
		"marina", "josipa", "nikola", "vinko", "filipa"
		};
		String[] completion2 = {
		"marina", "josipa", "nikola", "filipa"
		};


		String[] participant3 = {
		"mislav", "stanko", "ana", "mislav"
		};
		String[] completion3 = {
		"mislav", "stanko", "ana"
		};

		String result1 = solution(participant1, completion1); //leo
		String result2 = solution(participant2, completion2); //vinko
		String result3 = solution(participant3, completion3); //mislav

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		}
	
	public static String solution(String[] participant, String[] completion){
		
//		List<String>list1 = new ArrayList<String>();
//		for(String s : participant) {
//			list1.add(s);
//		}
//		
//		System.out.println(list1);
//		
//		for(String s : completion) {
//			list1.remove(s);
//		}
//		
//		System.out.println(list1);
//		
//		return list1.get(0);
		
		//2. Set
		
//		Set<String> set = new HashSet<String>();
//		for(String s : completion) {
//			set.add(s);
//		}
//		
//		String result = null;
//		for(String s : participant) {
//			if(set.contains(s)) {
//				set.remove(s);
//			}else {
//				result = s;
//				break;
//			}
//		}
//		
//		return result;
		
		//3. Map
		
		Map<String, Integer> map = new HashMap<String , Integer>();
		
		for(String s : participant){
			
			map.put(s, map.getOrDefault(s, 0)+1);
//			if(map.containsKey(s)) {
//				map.put(s,map.get(s)+1); 
//			}else {
//				map.put(s, 1);
//			}
		}
		
		for(String s : completion) {
			map.put(s, map.get(s)-1);
			
			if(map.get(s)==0) {
				map.remove(s);
			}
		}
		
		String result = null;
		for(String key : map.keySet()) {
			if(map.get(key)==1) {
				result=key;
				break;
			}
		}
		return result;
	}
}
