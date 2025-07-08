import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31825
// 문자열을 char 배열로 입력 받고 
// 묶음 개수 출력 => 배열을 순회하면서 앞의 문자와 다르면 카운트 하여 카운트 출력
// 문자 밀기 => 배열을 순회하면서 ++연산자로 다음 문자로 바꾸고, 바꾼 값이 'Z'보다 크면 'A'로 바꿔줌(순회)
public class B31825_알파벳과_쿼리_Easy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 문자열의 길이
		int Q = Integer.parseInt(st.nextToken()); // 쿼리 개수
		char[] S = br.readLine().toCharArray(); // 문자열
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int query = Integer.parseInt(st.nextToken()); // 쿼리 번호
			int l = Integer.parseInt(st.nextToken()) - 1; // 시작 위치(인덱스)
			int r = Integer.parseInt(st.nextToken()) - 1; // 끝 위치(인덱스)
			if (query == 1) { // 알파벳 묶음의 개수를 출력 => 앞의 문자와 다르면 카운트
				int cnt = 1; // 묶음 개수
				for (int j = l + 1; j <= r; j++) {
					if (S[j] != S[j - 1]) { // 문자 바뀜
						cnt++;
					}
				}
				sb.append(cnt).append("\n"); // 묶음 개수 출력 저장
			} else { // 모든 알파벳을 각각 알파벳 순서로 다음인 알파벳으로 변경
				for (int j = l; j <= r; j++) {
					S[j]++;
					if (S[j] > 'Z') { // Z -> A
						S[j] = 'A';
					}
				}
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
