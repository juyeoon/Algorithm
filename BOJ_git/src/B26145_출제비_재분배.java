import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/26145
// N명의 출제자, M명의 검수자 (총 N + M명의 운영진)
// 출제자들은 각자 출제비를 받고, 일부를 다른 운영자에게 나눠줌
// 모든 운영자가 받은 총 금액을 구하는 문제
// 출제자 i가 운영자 j에게 Tij원을 주면 i 출제자의 금엑에서 T를 차감, j 운영자의 금액에 T를 추가
public class B26145_출제비_재분배 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 출제자 수
		int M = Integer.parseInt(st.nextToken()); // 검수자 수
		int NM = N + M; // 총 운영진 수
		int money[] = new int[NM]; // 운영진 받게되는 돈
		int S[] = new int[N]; // 각 출제자가 받은 출제비
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(st.nextToken()); // 출제비 초기화
			money[i] = S[i]; // 받은 돈 초기화
		}
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < NM; j++) {
				int T = Integer.parseInt(st.nextToken());
				money[i] -= T; // 출제자가 나눠준 금액 차감
				money[j] += T; // 받는 운영자는 금액 추가
			}
		}
		for (int i : money) {
			sb.append(i).append(" "); // 출력 저장
		}
		System.out.println(sb.toString().trim()); // 출력
		br.close();
	}
}
