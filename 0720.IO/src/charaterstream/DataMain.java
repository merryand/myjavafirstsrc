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
			//접속한 아이피를 중복 상관없이 저장하기 위한 자료구조
			ArrayList<String> iplist = new ArrayList<>();
			//접속한 아이피를 중복 없이 저장
			Set<String>ipset = new HashSet<String>();
			while (true) {
				// 한 줄을 읽기
				String line = br.readLine();
				//읽은 데이터가 없으면 종료
				if (line == null) {
					break;
				}
				//공백으로 분할
				String [] ar = line.split(" ");
				//System.out.println(ar[0]);
				//읽은 자료에서 0번째 자료인 ip를 리스트에 저장
				iplist.add(ar[0]);
				//ip를 셋에 저장
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
			System.out.println("예외 : " + e.getMessage());
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
