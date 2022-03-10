import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// IOIOI...가 연속으로 몇 번 나오는지 확인 후 N에 맞게 계산(O를 기준으로 생각)
// 이전 코드가 틀린 이유:연속으로 나온 문자열이 I로 끝났을 때와 O로 끝났을 때 계산식이 다름 
// 100점 -> 마지막이 O일때의 상황을 따로 처리
public class B5525_IOIOI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // I와 O이 교대로 나오는 문자열(PN)에서 O개수
		int M = Integer.parseInt(br.readLine()); // 확인할 문자열의 길이
		String str = br.readLine(); // 확인할 문자열
		int ans = 0; // 출력할 정답(PN이 문자열에서 나타나는 횟수)
		int i = 0; // 전체 문자열을 순회하는 인덱스
		while (i < M) { // i가 문자열의 길이보다 작을때만 반복
			if (str.charAt(i) == 'I') { // 현재 위치의 문자가 I이면
				boolean flag = true; // 앞의 문자가 I인지 O인지 확인하는 flag(true: I, false: O)
				int j = i + 1; // I와 O가 교대로 나오는지 확인하면서 사용할 인덱스(i는 이미 I이므로 i+1부터 확인)
				int cnt = 1; // I와 O가 교대로 나온 횟수
				while (j < M) { // j가 문자열의 길이보다 작을때만 반복
					// 앞의 문자와 현재 위치의 문자가 같으면 while문 탈출
					if ((flag && str.charAt(j) == 'I') || (!flag && str.charAt(j) == 'O')) {
						break;
					}
					// 앞의 문자와 현재 위치의 문자가 다르면
					flag = !flag; // flag 반전
					cnt++; // cnt(횟수) 증가
					j++; // j(현재 위치) 증가
				}
				if (cnt >= 2 * N + 1) { // cnt(횟수)가 PN 길이보다 클 때만 확인
					// flag가 false면 O으로 끝남 -> 유효한 O개수 = (cnt - 1) / 2
					// flag가 true면 1로 끝남 -> 유효한 O개수 = cnt / 2
					ans += flag ? cnt / 2 - (N - 1) : (cnt - 1) / 2 - (N - 1);
				}
				i += cnt; // 확인한만큼은 스킵하여 그 다음 위치를 현재 위치가 되게 i를 변경
			} else { // 현재 위치의 문자가 O이면
				i++; // 다음 문자를 확인하게 i++
			}
		}
		System.out.println(ans);
		br.close();
	}
}
