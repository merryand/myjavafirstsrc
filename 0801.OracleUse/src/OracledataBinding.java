import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class OracledataBinding {

	public static void main(String[] args) {
		Connection con =null;
		PreparedStatement pstmt = null;
		
		//Ű����κ��� �Է��� ���� �� �ִ� ��ü ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ���ȣ : ");
		int deptno = sc.nextInt();
		
		System.out.print("�μ��̸� : ");
		//������ �����ִ� Enter�� �����ϱ� ���� �ڵ��Դϴ�.
		sc.nextLine();
		String dname = sc.nextLine();
		
		System.out.print("���� : ");
		String loc = sc.nextLine();
		
		sc.close();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			//pstmt = con.prepareStatement("insert into dept(deptno, dname, loc)" + "values(" + deptno + ", '" + dname + "' , '" + loc + "' )");
			pstmt = con.prepareStatement("insert into dept(deptno, dname, loc)" + "values(?,?,?)");
			//�����͹��ε�
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			int r = pstmt.executeUpdate();
			if(r > 0) {
				System.out.println("���� ����");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			}catch(Exception e) {}
		}
		

	}

}
