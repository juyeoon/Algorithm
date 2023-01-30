import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 색에 따른 저항의 값만 저장한 후 마지막 값만큼 0을 더함
public class B1076_저항 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int r[] = new int[3]; // 저항(색)의 값
		for (int i = 0; i < 3; i++) { // input r[]
			String s = br.readLine();
			if (s.equals("black")) {
				r[i] = 0;
			} else if (s.equals("brown")) {
				r[i] = 1;
			} else if (s.equals("red")) {
				r[i] = 2;
			} else if (s.equals("orange")) {
				r[i] = 3;
			} else if (s.equals("yellow")) {
				r[i] = 4;
			} else if (s.equals("green")) {
				r[i] = 5;
			} else if (s.equals("blue")) {
				r[i] = 6;
			} else if (s.equals("violet")) {
				r[i] = 7;
			} else if (s.equals("grey")) {
				r[i] = 8;
			} else {
				r[i] = 9;
			}
		}
		sb.append((r[0] == 0) ? "" : r[0]).append(r[1]); // 십의 자리 수가 0이면 일의 자리 숫자만 추가
		if (r[0] != 0 || r[1] != 0) { // 십의 자리 일의 자리 둘 다 0이면 그대로 0. 아니면 마지막 값만큼 0 더하기
			for (int i = 0; i < r[2]; i++) {
				sb.append("0");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}