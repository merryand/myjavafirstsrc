package charaterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {
		// 키보드로부터 줄 단위로 입력을 받을 수 있는 클래스의 참조형 변수 선언
		//finall절에서 close를 할 수 있도록 try밖에서 변수를 선언합니다.
		
		BufferedReader br = null;
		
		try {
			br =new BufferedReader(new InputStreamReader(System.in));
			System.out.print("이름 : ");
			//문자열 한 줄 읽어오기
			String name = br.readLine();
			
			System.out.print("나이 : ");
			String age = br.readLine();
			
			System.out.print("키 : ");
			String height = br.readLine();
			
			//3개의 데이터를 하나로 저장하기 위한 인스턴스를 생성
			Member member = new Member();
			member.setName(name);
			//정수로 변환해서 저장
			member.setAge(Integer.parseInt(age));
			//실수로 변환해서 저장
			member.setHeight(Double.parseDouble(height));
			
			//맵을 이용해서 저장
			//맵이랑 해쉬맵이랑 임포트를 각각 했어
			//맵에 넣을 때 데이터 타입 변환을 안 했는데 경고가 안 나왔음
			//VO에 타입변환 안 하고 넣을려고 할 때는 경고가 떴음
			Map<String,Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height", Double.parseDouble(height));
			
			//출력할 때는 VO 클래스나 Map이 별 차리가 없습니다.
			//VO클래스에 오버라이드한 toString 모양으로 나온다.
			System.out.println(member);
			//맵은 안해도 되나보다
			System.out.println(map);
			
			//사용할 때는 조금 다릅니다.
			//나이를 1씩 더하기
			int r = member.getAge() + 1;
			//Map에서 데이터를 가져와서 사용할 때 강제 형 변환을 해야 합니다.
			r = (Integer)map.get("age") + 1;
			
		}catch(Exception e){
			System.out.println("예외 : " + e.getMessage());
		}finally{
			try {
				if(br != null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
