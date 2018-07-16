package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;


public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("üũ�ڽ� �׽�Ʈ");
		setLocation(100,100);
		setSize(500,500);
		
		Panel panel = new Panel();
		
		Checkbox cb1 = new Checkbox("����");
		Checkbox cb2 = new Checkbox("���ǰ���");
		Checkbox cb3 = new Checkbox("����");
		Checkbox cb4 = new Checkbox("���α׷���");
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(cb4);
		
		//���� ��ư �����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("����",group,true);
		Checkbox woman = new Checkbox("����",group,false);
		panel.add(man);
		panel.add(woman);
		
		Choice ch = new Choice();
		ch.add("��");
		ch.add("����");
		ch.add("����");
		ch.add("�ܿ�");
		panel.add(ch);
		
		//5���� �����ְ� ���� ���� ������ �� �ֵ��� ���ִ� List
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
		//list�� remove(int idx)�� �̿��ϸ� idx ��°�� ���� �� �ֽ��ϴ�.
		//1��° �ִ� C&C++�� 5��°�� �ִ� Objective-C�� ����
		//���� ���� ���� ���� �ڿ������� �����ؾ� �մϴ�. (�ε����� ������ �� �ִ� ��������)
		list.remove(4);
		list.remove(0);
		//list.remove(4);
		//list.remove(3);
		
		add(panel);
		
		setVisible(true);
	}

}
