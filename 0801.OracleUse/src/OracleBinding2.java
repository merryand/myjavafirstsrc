import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class OracleBinding2 {

	public static void main(String[] args) {
		//1. ������ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ���ȣ(����) : ");
		int deptno = sc.nextInt();
		//System.out.println("�Է¹��� �μ���ȣ : " + deptno);
		sc.close();
		
		//2. �Է¹��� �����͸� ������ �����ͺ��̽��� �����ϱ�
		//�ʿ��� ���� ����
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//����̹� Ŭ������ �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("�ε� ����");
			
			//�����ͺ��̽� ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			
			//autocommit ����
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement("delete from dept where deptno = ?");
			pstmt.setInt(1,deptno);
			
			//SQL ����
			//�����ϰ� ���� ������� ���� ������ �����մϴ�.
			//���ǿ� �´� �����Ͱ� ������ �����ϴ� �� �ƴϰ�
			//�����ϴ� ���� ������ 0�Դϴ�.
			//�����ϸ� ���ܰ� �߻��ϹǷ� catch�� ���ϴ�.
			int r = pstmt.executeUpdate();
			if(r >0) {
				System.out.println("��������");
			//�۾��� �����ϸ� commit�� ȣ��
			con.commit();
			}else
				System.out.println("���ǿ� �´� �����Ͱ� �����ϴ�.");
		}catch(Exception e) {
			try {
			con.rollback();
			}catch(Exception f) {
				System.out.println(f.getMessage());
			}
			//������ ������ ���
			System.out.println(e.getMessage());
			//���ܰ� �߻��� ������ ������
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			}catch(Exception e) {}
		}
	}

}
