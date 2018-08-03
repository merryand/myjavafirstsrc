package singleton;

public class T {
	
	//�ܺο��� ��ü�� �������� ���ϵ��� �����ڸ� private�� ����
	private T() {}
	
	//1���� ���� �������ֱ� ���� static ���� ����
	private static T obj;
	
	//��ü�� ������ ���� �����ϰ� ������ �׳� �����ϴ� static �޼ҵ� ����
	
	public static T getInstance() {
		if(obj == null) {
			obj = new T();
		}
		return obj;
	}

}
