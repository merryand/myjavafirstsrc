package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;


public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("체크박스 테스트");
		setLocation(100,100);
		setSize(500,500);
		
		Panel panel = new Panel();
		
		Checkbox cb1 = new Checkbox("독서");
		Checkbox cb2 = new Checkbox("음악감상");
		Checkbox cb3 = new Checkbox("게임");
		Checkbox cb4 = new Checkbox("프로그래밍");
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(cb4);
		
		//라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("남자",group,true);
		Checkbox woman = new Checkbox("여자",group,false);
		panel.add(man);
		panel.add(woman);
		
		Choice ch = new Choice();
		ch.add("봄");
		ch.add("여름");
		ch.add("가을");
		ch.add("겨울");
		panel.add(ch);
		
		//5개를 보여주고 여러 개를 선택할 수 있도록 해주는 List
		List list = new List(5, true);
		list.add("C&C++");
		list.add("C#");
		list.add("Java");
		list.add("JavaScript");
		list.add("Objective-C");
		list.add("Python");
		list.add("Swift");
		list.add("Kotlin");
		list.add("Scala");
		
		panel.add(list);
		//list의 remove(int idx)를 이용하면 idx 번째를 지울 수 있습니다.
		//1번째 있는 C&C++과 5번째에 있는 Objective-C를 제거
		//여러 개를 지울 때는 뒤에서부터 삭제해야 합니다. (인덱스에 영향을 안 주는 방향으로)
		list.remove(4);
		list.remove(0);
		//list.remove(4);
		//list.remove(3);
		
		add(panel);
		
		setVisible(true);
	}

}
