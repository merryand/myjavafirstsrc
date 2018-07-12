package datastructure;

import java.util.TreeMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		// 이름과 나이 및 소속 회사를 저장하는 Map을 생성
		TreeMap<String,Object> map = new TreeMap<>();
		map.put("model", "갤럭시 S");
		map.put("number",8);
		map.put("company","삼성");
		
		map.put("model", "G");
		map.put("number",6);
		map.put("company","LG");
		
		map.put("model", "아이폰");
		map.put("number",9);
		map.put("company","애플");
		
		//전체를 한꺼번에 출력 - toString이 재정의 되어 있음.
		System.out.println(map);
		//순서에 상관없이 항목별로 출력
		System.out.println("========================");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key);
		}

	}

}
