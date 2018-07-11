package datastructure;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("menu", "아메리카노");
		map.put("price", 3000);
		map.put("tem", "ice");
		//동일한 키로 다시 저장하면 업데이트가 됩니다.
		map.put("tem","hot");
		
		//tem 키의 값을 출력하기
		System.out.println(map.get("tem"));
		//없는 키의 이름을 사용하면 null을 리턴
		System.out.println(map.get("Tem"));
		
		//모든 데이터 조회 - 저장할 때 사용한 Key를 몰라도 조회가능
		//모든 키를 Set으로 저장
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}

	}

}
