package datastructure;

import java.util.ArrayList;
import java.util.Random;

public class Slot {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("!");
		list.add("?");
		list.add("@");
		list.add("#");
		list.add("&");
		list.add("%");
		
		String slot = "";
		Random r =new Random();
		//리스트에 있는 모양 3개를 랜덤하게 추출해서 slot에 추가	
	for(int i =0; i<3; i=i+1) {
		slot = slot + list.get(r.nextInt(list.size()));
	}
	System.out.println(slot);
	//3개의 문자가 동일한 지 확인
	if(slot.charAt(0) == slot.charAt(1) && slot.charAt(1) == slot.charAt(2)) {
		System.out.println(slot.charAt(0)+"이 3개");
	}
	//앞의 2개 문자만 동일한 지 확인
	else if(slot.charAt(0) == slot.charAt(1)) {
		System.out.println(slot.charAt(0)+ "이 앞에 2개");
	}
	//그 이외의 경우
	else {
		System.out.println("꽝 다음 기회에!!!");
	}

	}

}
