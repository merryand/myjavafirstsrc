package stringtemp2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String [] station = {"광화문", "종로 3가", "을지로 4가"};
		//빠른 열거는 시작점에서 시작
		for (int i =0; i <station.length; i = i+1) {
			System.out.println(station[i]);
		}
		//출력하고 다음으로 넘어가서 대기 (전진 밖에 못함)
		for (String temp:station) {
			System.out.println(temp);
		}
	}
	ArrayList<String> al = new ArrayList<>();
	HashMap<String,String> hm = new HashMap<>();
	
	//0이면 남자 1이면 여자
	final int MAN = 0;
	final int WOMAN = 1;
	//이걸 이렇게
	enum GENDER {
		MAN, WOMAN
	}
	
	
	}

