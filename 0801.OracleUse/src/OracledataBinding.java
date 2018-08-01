import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class OracledataBinding {

	public static void main(String[] args) {
		Connection con =null;
		PreparedStatement pstmt = null;
		
		//키보드로부터 입력을 받을 수 있는 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 : ");
		int deptno = sc.nextInt();
		
		System.out.print("부서이름 : ");
		//이전에 남아있던 Enter를 제거하기 위한 코드입니다.
		sc.nextLine();
		String dname = sc.nextLine();
		
		System.out.print("지역 : ");
		String loc = sc.nextLine();
		
		sc.close();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			//pstmt = con.prepareStatement("insert into dept(deptno, dname, loc)" + "values(" + deptno + ", '" + dname + "' , '" + loc + "' )");
			pstmt = con.prepareStatement("insert into dept(deptno, dname, loc)" + "values(?,?,?)");
			//데이터바인딩
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			int r = pstmt.executeUpdate();
			if(r > 0) {
				System.out.println("삽입 성공");
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
