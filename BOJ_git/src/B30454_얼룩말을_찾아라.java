import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/30454
// 각 얼룩말에 대하여 흰 -> 검으로 바꾸는 순간 카운트 하여 검은줄을 저장
// 모든 얼룩말에 대하여 검은줄의 최대 개수와 검은줄 개수에 따른 얼룩말의 수를 저장
// 모든 얼룩말을 다 확인한 후 검은줄 최대 개수와 최대 개수를 가지는 얼룩말의 수를 출력
public class B30454_얼룩말을_찾아라 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 얼룩말의 개체수
		int L = Integer.parseInt(st.nextToken()); // 얼룩말의 몸통 길이
		int maxLine = 0; // 검은 줄 최대 개수
		int lineCnt[] = new int[L / 2 + 2]; // 검은줄 개수에 따른 얼룩말의 수
		for (int i = 1; i <= N; i++) { // 검은줄 세기
			char c[] = br.readLine().toCharArray();
			int cnt = 0; // 검은 줄 개수
			boolean one = false; // 검은줄 카운트 중인지 (true: 검은줄 카운트 중)
			for (int j = 0; j < L; j++) {
				if (c[j] == '0' && one) { // 검 -> 흰
					cnt++;
					one = false;
				} else if (c[j] == '1' && !one) { // 흰 -> 검
					one = true;
				}
			}
			if (one) { // 마지막이 검은줄로 끝나면 카운트 하나 더
				cnt++;
			}
			lineCnt[cnt]++; // 검은줄 개수에 따른 얼룩말 수 갱신
			maxLine = Math.max(maxLine, cnt); // 검은줄 최대 개수 갱신
		}
		System.out.println(maxLine + " " + lineCnt[maxLine]); // 검은줄 최대 개수와 최대 개수를 가진 말의 수 출력
		br.close();
	}
}
