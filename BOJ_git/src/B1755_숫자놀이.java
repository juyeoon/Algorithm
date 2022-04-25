import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 우선순위로 정렬
public class B1755_숫자놀이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		// 숫자 범위: 숫자 M이상 N이하
		int M = Integer.parseInt(s[0]); // 수 범위 시작값
		int N = Integer.parseInt(s[1]); // 수 범위 끝값
		// p => 숫자별 우선순위 저장 배열 (인덱스: 숫자, 값: 숫자에 해당하는 우선 순위)
		// 예: p[0]=9 => 숫자 0은 우선순위가 9이다. p[8]=0 => 숫자 8은 우선순위가 0이다.
		int[] p = { 9, 4, 8, 7, 2, 1, 6, 5, 0, 3 };
		int input[][] = new int[N - M + 1][3]; // 범위 안의 숫자와 우선순위를 저장하는 배열. input[][0]:수, input[][1]:우선순위
		for (int i = M, idx = 0; i <= N; i++, idx++) { // 범위만큼 반복(시작값부터 끝값까지)
			if (i < 10) { // 한 자리 수
				input[idx][0] = i; // 숫자
				input[idx][1] = p[i]; // 숫자에 해당하는 우선순위(십의 자리 우선 순위)
				input[idx][2] = -1; // 일의 자리가 제일 앞에 가기 위해서 일의 자리 우선순위에 -1 입력
			} else {
				input[idx][0] = i; // 수
				input[idx][1] = p[i / 10]; // 십의 자리 수에 해당하는 우선순위
				input[idx][2] = p[i % 10]; // 일의 자리 수에 해당하는 우선순위

			}
		}
		Arrays.sort(input, new Comparator<int[]>() { // 우선순위(input[][1], input[][2]) 기준으로 정렬
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[2] - o2[2];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		int cnt = 0; // 10개씩 끊기 위한 카운트 변수
		for (int i = 0; i <= N - M; i++) { // input 행 크기 만큼 반복
			sb.append(input[i][0]).append(" "); // 우선순위 순서로 sb에 수(input[][0]) 추가
			if (++cnt == 10) { // 10개가 추가되면
				sb.append("\n"); // 개행 추가
				cnt = 0; // 개수 초기화
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
