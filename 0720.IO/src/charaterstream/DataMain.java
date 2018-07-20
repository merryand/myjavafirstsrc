package charaterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\503-24\\Documents\\java\\access_log.txt"));
			//������ �����Ǹ� �ߺ� ������� �����ϱ� ���� �ڷᱸ��
			ArrayList<String> iplist = new ArrayList<>();
			//������ �����Ǹ� �ߺ� ���� ����
			Set<String>ipset = new HashSet<String>();
			while (true) {
				// �� ���� �б�
				String line = br.readLine();
				//���� �����Ͱ� ������ ����
				if (line == null) {
					break;
				}
				//�������� ����
				String [] ar = line.split(" ");
				//System.out.println(ar[0]);
				//���� �ڷῡ�� 0��° �ڷ��� ip�� ����Ʈ�� ����
				iplist.add(ar[0]);
				//ip�� �¿� ����
				ipset.add(ar[0]);
			}
			//System.out.println(iplist);
//			for(String ip : iplist) {
//				System.out.println(ip);
//			}
			System.out.println(ipset);
			for(String set : ipset) {
				System.out.println(set);
			}
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
