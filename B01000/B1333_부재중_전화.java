import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1333
// boolean 배열을 사용해서 노래가 나오는 시각(idx: 시각)을 각각 표시
// D씩 건너뛰면서 false인 idx가 존재하는지 확인
// 존재: 해당 idx 출력
// 존재 x: 노래를 다 듣고 난 후에 처음으로 전화벨이 울리는 시각 출력
public class B1333_부재중_전화 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 노래 개수
		int L = Integer.parseInt(st.nextToken()); // 한 곡의 길이 (모든 노래 동일)
		int D = Integer.parseInt(st.nextToken()); // 전화벨이 울리는 주기
		int leng = N * L + 5 * (N - 1); // 노래 시작부터 앨범 끝까지의 길이
		boolean song[] = new boolean[leng]; // 노래가 나오는지 여부(true: 나옴)
		int idx = 0; // song idx
		for (int i = 0; i < N; i++) { // 노래 개수
			for (int j = 0; j < L; j++) { // 한 곡의 길이
				song[idx] = true; // 노래가 나온다고 표시
				idx++;
			}
			idx += 5; // 5초 쉬기
		}
		int ans = -1; // 노래가 나오지 않을때 전화벨이 울리는 시각
		for (int i = 0; i < song.length; i += D) { // D초씩 확인
			if (!song[i]) { // 노래가 나오지 않으면
				ans = i; // 답 갱신
				break;
			}
		}
		if (ans == -1) { // 끝까지 전화벨 소리를 못 들으면
			ans = (int) Math.ceil(leng / (D * 1.0)) * D; // 앨범이 끝나고 처음 울리는 전화벨의 시각
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
