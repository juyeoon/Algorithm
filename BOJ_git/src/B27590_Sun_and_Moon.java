import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 태양과 달이 특정 위치에 동시에 오는 날이 몇 년 뒤에 가장 빨리 오는지 구하는 문제
// 태양이 특정 위치에 오는 가장 빠른 연도는 태양이 특정 위치에 오는 주기(ys) - 태양이 몇 년 전에 특정 위치에 있었는지(ds) (달도 동일)
// 그 다음으로 빠른 연도는 위에서 구한 가장 빠른 연도 + ys. 그 다음 연도는 이전 연도 + ys (달도 동일)
// 태양과 달이 처음으로 특정 위치에 오는 날을 구하고 비교했을 때
// 태양의 값이 더 크면 달의 값에 달의 주기 더함. 달의 값이 더 크면 태양의 값에 태양의 주기 더함.을 반복하는데 같으면 반복 멈춤
// 같았을 때의 태양이나 달의 값을 출력
public class B27590_Sun_and_Moon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ds = Integer.parseInt(st.nextToken()); // 태양이 몇 년 전에 특정 위치에 있었는지
		int ys = Integer.parseInt(st.nextToken()); // 태양이 특정 위치에 오는 주기
		st = new StringTokenizer(br.readLine());
		int dm = Integer.parseInt(st.nextToken()); // 달이 몇 년 전에 특정 위치에 있었는지
		int ym = Integer.parseInt(st.nextToken()); // 달이 특정 위치에 오는 주기
		int S = ys - ds; // 태양이 특정 위치에 오는 해 (초기값: 처음으로 오는 해)
		int M = ym - dm; // 달이 특정 위치에 오는 해 (초기값: 처음으로 오는 해)
		while (S != M) {
			if (S > M) { // 태양의 값이 더 크면
				M += ym;
			} else if (S < M) { // 달의 값이 더 크면
				S += ys;
			} else { // 같으면 반복문 탈출
				break;
			}
		}
		System.out.println(S); // 출력
		br.close();
	}
}