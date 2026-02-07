import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/15819
public class B15819_너의_핸들은 {
	// 우선순위 정하는 함수
	public static int rank(char c) {
		if ('0' <= c && c <= '9') { // 숫자
			return c - '0';
		}
		return 10 + (c - 'a'); // 문자(숫자 뒤에 오도록 10 더함)
	}

	public static final Comparator<String> HANDLE_COMP = (a, b) -> {
		int la = a.length();
		int lb = b.length();
		int len = Math.min(la, lb);
		for (int i = 0; i < len; i++) {
			char ca = a.charAt(i);
			char cb = b.charAt(i);
			int ra = rank(ca); // a 우선 순위
			int rb = rank(cb); // b 우선 순위
			if (ra != rb) { // 최초로 다른 문자 나오면
				return ra - rb; // 작은걸 먼저 오게
			}
		}
		return la - lb; // 한 문자열이 다른 문자열의 접두사면 짦은 문자열이 먼저 오게
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 핸들 개수
		int I = Integer.parseInt(st.nextToken()); // 사전 순 I번째
		List<String> handle = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			handle.add(br.readLine());
		}
		Collections.sort(handle, HANDLE_COMP); // 문제 정의 사전순 정렬
		System.out.println(handle.get(I - 1)); // 마지막 핸들 출력
		br.close();
	}
}
