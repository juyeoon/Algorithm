import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15814
// 문자열을 문자 배열로 전환 후 입력 받은 위치를 인덱스로 받아 swap
public class B15814_야바위_대장 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char c[] = br.readLine().toCharArray(); // 입력 받은 문자열
		int N = Integer.parseInt(br.readLine()); // swap 횟수
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 인덱스 1
			int b = Integer.parseInt(st.nextToken()); // 인덱스 2
			char tmp = c[a]; // swap
			c[a] = c[b];
			c[b] = tmp;
		}
		for (char d : c) { // 출력 저장
			sb.append(d);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
