import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OracleInsert {

	public static void main(String[] args) {
		//�����ͺ��̽� ���� ����
		Connection con = null;
		//SQL ���� ����
		PreparedStatement pstmt = null;
		try {
			//����̹� Ŭ���� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//�����ͺ��̽� ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			//SQL ���� ��ü�� ����
			//������ ����
			//pstmt = con.prepareStatement("insert into dept(deptno, dname, loc)" + "values(60,'����','�λ�')");
			//������ ����
			//pstmt = con.prepareStatement("delete from dept where deptno = 50");
			//������ ������Ʈ
			pstmt = con.prepareStatement("update dept set loc='����' where deptno = 60");
			//SQL�� ���� - select�� ������ ���� ����
			//r�� ����Ǵ� ���� ������� ���� ����
			int r = pstmt.executeUpdate();
			//�������� ���
			if(r>0) {
				System.out.println("���� ����");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {}
		}

	}

}
