package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AdderssBook extends JFrame {
	//컬럼 이름 배열
	String [] columns = {"이름","전화번호","주소"};
	//데이터 배열
	String [] [] data = {
			{"홍길동", "01077446633","서울시 종로구 관철동"},
			{"김철수","01099773355","서울시 관악구 신림동"},
			{"오영희","01077882233","서울시 강북구 화곡동"},
			};
	
	public AdderssBook () {
		setBounds(800,800,1500,500);
		setTitle("연락처");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//테이블 모델 만들기
		DefaultTableModel model = new DefaultTableModel(data,columns);
		//테이블 모델 이용해서 테이블을 만들기
		JTable table = new JTable(model);
		//데이터가 없이 일단 만들 때는 아래 방식.
		//table.setModel(model);
		//출력영역의 크기보다 table이 커지더라도 스크롤 바를 이용할 수 있도록 Scroll을 생성
		JScrollPane scrollPane = new JScrollPane(table);
		//스크롤 패인을 프레임에 부착
		add(scrollPane);
		//지금은 바운스를 써서 안되는데 아래 걸 넣으면 크기를 자동 조절해준다는 것 같다.
		//pack();
		
		
		//메뉴 바를 생성
		JMenuBar menuBar = new JMenuBar();
		
		JMenu file = new JMenu("파일(a)");
		//단축키 설정
		file.setMnemonic('a');
		
		JMenuItem item1 = new JMenuItem("열기");
		file.add(item1);
		
		JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("저장");
		file.add(item2);
		
		JRadioButtonMenuItem item3 = new JRadioButtonMenuItem("편집");
		file.add(item3);
		
		menuBar.add(file);
		
		//메뉴 바를 윈도우에 부착
		setJMenuBar(menuBar);
		
		JLabel lblName = new JLabel("이름");
		JTextField tfName = new JTextField(10);
		JLabel lblPhone = new JLabel("전화번호");
		JTextField tfPhone = new JTextField(15);
		JLabel lblAddress = new JLabel("주소");
		JTextField tfAddress = new JTextField(30);
		
		JButton btnInsert = new JButton("삽입");
		JButton btnDelete = new JButton("삭제");
		
		JPanel southPanel = new JPanel();
		southPanel.add(lblName);
		southPanel.add(tfName);
		southPanel.add(lblPhone);
		southPanel.add(tfPhone);
		southPanel.add(lblAddress);
		southPanel.add(tfAddress);
		southPanel.add(btnInsert);
		southPanel.add(btnDelete);
		
		add("South",southPanel);
		
		setVisible(true);
		
		//삽입 버튼의 클릭 이벤트(ActionListener) 처리
		ActionListener insertListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//텍스트 필드에 입력된 내용 가져오기
				String name = tfName.getText();
				String phone = tfPhone.getText();
				String address = tfAddress.getText();
				
				//좌우 공백 제거하기
				name = name.trim();
				phone = phone.trim();
				address = address.trim();
				
				//name의 필수 입력
				//이름이 입력되지 않은 경우 길이가 0, null이 아님 주의.
				//null이면 컴포넌트가 없어야 null로 인식하나보다.
				if(name.length() == 0) {
					JOptionPane.showConfirmDialog(null, "이름은 필수 입력", "이름", JOptionPane.WARNING_MESSAGE);
					//아래쪽을 더 이상 수행하지 않도록 리턴
					//클래스 바깥으로 나가는 거라네
					return;
				}
				
				//테이블의 데이터를 편집하기 위해서 테이블의
				//데이터 모델을 가져옵니다.
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				//데이터를 추가하기 위해서 추가할 데이터 배열을 생성
				String [] row = {name, phone, address};
				//모델에 추가
				model.addRow(row);
				//테이블을 갱신
				table.updateUI();
				
				//텍스트 클리어 필드
				tfName.setText("");
				tfPhone.setText("");
				tfAddress.setText("");
				
				//메시지 박스 출력
				JOptionPane.showMessageDialog(null, "데이터 삽입 성공","삽입작업",JOptionPane.PLAIN_MESSAGE);
				
			}
			
		};
		btnInsert.addActionListener(insertListener);
		
		ActionListener deleteListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//선택한 행 번호 찾기
				int idx = table.getSelectedRow();
				//테이블에서 행을 선택하지 않았다면
				//if(!(idx >=0 && idx<table.getRowCount())) {
				if(idx<0 || idx>=table.getRowCount()) {
					JOptionPane.showMessageDialog(null, "행을 선택하세요!", "삭제 실패",JOptionPane.WARNING_MESSAGE);
					//더 이상 진행하면 안됌
					return;
				}
				
				//테이블의 모델 가져오기
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				//선택한 행에 해당하는 데이터 지우기
				model.removeRow(idx);
				table.updateUI();
				JOptionPane.showMessageDialog(null, "데이터 삭제 성공","삭제",JOptionPane.WARNING_MESSAGE);
				
				
			}
			
		};
		
		btnDelete.addActionListener(deleteListener);
		
		/*
		//메시지 다이얼로그 출력
		JOptionPane.showMessageDialog(null,"메세지 다이얼로그","대화상자",JOptionPane.QUESTION_MESSAGE);
		//선택 다이얼로그 출력
		int r = JOptionPane.showConfirmDialog(null, "메세지 다이얼로그", "대화상자", JOptionPane.YES_NO_OPTION);
		System.out.println(r);
		//한줄 입력받는 다이얼로그 출력
		String s = JOptionPane.showInputDialog(null,"메세지 다이얼로그","대화상자",JOptionPane.YES_NO_OPTION);
		System.out.println(s);
		*/
		
	}
}
