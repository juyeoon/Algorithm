import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/30032
// 각 알파벳의 뒤집은 모양을 배열에 저장 후 방향과 알파벳에 맞게 출력
public class B30032_알파벳_뒤집기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 문자 개수
		int D = Integer.parseInt(st.nextToken()); // 알파벳 뒤집는 방향
		char[][] rot = { { 'd', 'b', 'q', 'p' }, { 'q', 'p', 'd', 'b' }, { 'b', 'd', 'p', 'q' } }; // 뒤집은 알파벳
		for (int i = 0; i < N; i++) {
			char[] c = br.readLine().toCharArray(); // 뒤집을 알파벳
			for (int j = 0; j < N; j++) { // 뒤집기
				if (c[j] == rot[0][0]) {
					sb.append(rot[D][0]);
				} else if (c[j] == rot[0][1]) {
					sb.append(rot[D][1]);
				} else if (c[j] == rot[0][2]) {
					sb.append(rot[D][2]);
				} else {
					sb.append(rot[D][3]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
