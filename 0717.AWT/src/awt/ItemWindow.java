package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemWindow extends Frame {
	public ItemWindow() {
		setBounds(1000,800, 400,300);
		setTitle("이벤트 헨들링");
		
		Panel northPanel = new Panel();
		
		Checkbox cnboolean = new Checkbox("boolean");
		Checkbox cnbyte = new Checkbox("byte");
		Checkbox cnshort = new Checkbox("short");
		Checkbox cnchar = new Checkbox("char");
		Checkbox cnint = new Checkbox("int");
		Checkbox cnlong = new Checkbox("long");
		Checkbox cnfloat = new Checkbox("float");
		Checkbox cndouble = new Checkbox("double");
		
		northPanel.add(cnboolean);
		northPanel.add(cnbyte);
		northPanel.add(cnshort);
		northPanel.add(cnchar);
		northPanel.add(cnint);
		northPanel.add(cnlong);
		northPanel.add(cnfloat);
		northPanel.add(cndouble);
		
		add("North",northPanel);
		
		//중앙에 TextArea 배치
		
		TextArea ta = new TextArea(10, 70);
		add("Center", ta);
		
		//콤보박스 2개 배치
		//콤보박스에 배치할 데이터 만들기
		String [] category = {
				"Programming", "Database",
				"IDE", "Framework"
		};
		String [][] content = {
				{"Java", "JavaScipt","Swift"},
				{"Oracle","MySQL","MongoDB"},
				{"Eclipse","Android Studio","XCode"},
				{"Spring","MyBatis","Hibernat"}
		};
		
		Choice cbcategory = new Choice();
		for(String imsi : category) {
			cbcategory.add(imsi);
		}
		
		Choice cbcontent = new Choice();
		for(String imsi : content[0]) {
			cbcontent.add(imsi);
		}
		
		Button btnSelect = new Button("선택");
		Button btnExit = new Button("종료");
		
		Panel southPanel = new Panel();
		southPanel.add(cbcategory);
		southPanel.add(cbcontent);
		southPanel.add(btnSelect);
		southPanel.add(btnExit);
		
		add("South",southPanel);
		
		//체크박스를 눌렀을 때 호출될 메소드
		ItemListener itemHandler1 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//이벤트가 발생한 인스턴스의 원래의 자료형인 Checkbox로 변환
				//이벤트 처리 메소드에서 e.getSource()는 이벤트가 발생한
				//인스턴스의 주소를 리턴합니다.
				Checkbox cb = (Checkbox)(e.getSource());
				//체크박스에 입력된 텍스트 가져오기
				String label = cb.getLabel();
				//체크 박스 선택 여부 가져오기
				boolean b = cb.getState();
				//ta.append(e.getSource().toString()+"을 눌렀습니다." + "\n");
				ta.append(label + "을 눌렀습니다." + b + "로 변경\n");
			}
		};
		
		//체크박스를 눌렀을 때 호출될 인스턴스 설정
		cnboolean.addItemListener(itemHandler1);
		cnbyte.addItemListener(itemHandler1);
		cnshort.addItemListener(itemHandler1);
		cnchar.addItemListener(itemHandler1);
		cnint.addItemListener(itemHandler1);
		cnlong.addItemListener(itemHandler1);
		cnfloat.addItemListener(itemHandler1);
		cndouble.addItemListener(itemHandler1);
		//체크박스를 모두 연결했습니다.
		
		//카테고리 콤보 박스의 선택이 변경되었을 때
		//호출될 메소드를 가진 Listener
		//ItemListener가 처리
		ItemListener itemHandler2 = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				//cbcategory의 선택된 행 번호 가져오기
				int row = cbcategory.getSelectedIndex();
				//cbcontent의 내용을 전부 삭제
				cbcontent.removeAll();
				//이렇게 지우질 않으니까. 초이스에 선택한 항목이 추가되서 나옴 계속 추가됌
				//행번호에 해당하는 세부 내용을 cbcontent에 추가
				for(String temp : content[row]) {
					cbcontent.add(temp);
				}
			}
			
		};
		
		cbcategory.addItemListener(itemHandler2);
		
		ActionListener action1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int caNum = cbcategory.getSelectedIndex();
				int coNum = cbcontent.getSelectedIndex();
				String categoryText = category[caNum];
				String contentText = content[caNum][coNum];
				//setText는 덮어쓰는 거라 하나만 나온다.
				ta.setText(categoryText + ":" + contentText);
				
			}
			
		};
		
		btnSelect.addActionListener(action1);
		
		//종료 버튼을 누르면 프로그램을 종료 System.exit(0);
		
		ActionListener action2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		};
		
		btnExit.addActionListener(action2);
		
		setVisible(true);
	}
}
