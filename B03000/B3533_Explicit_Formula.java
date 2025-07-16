import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3533
// 쌍과 삼중조합 중 하나의 변수가 1인 경우의 개수를 세어야 함(문제에 명시)
// 쌍과 삼중조합은 합(or)로 계산되므로 하나라도 1이면 결과가 1
// 따라서 모두 0인 조합을 센 후 전체 경우의 수에서 모두 0인 조합의 경우의 수를 빼기
// 결과가 1인 쌍의 개수 = 45 - nC2 (n은 0인 변수의 개수)
// 결과가 1인 삼중조합의 개수 = 120 - nC3 (n은 0인 변수의 개수)
// 최종 함수 결과 (결과가 1인 쌍 개수 + 결과가 1인 삼중조합 개수) % 2가 1이면 1, 아니면 0 출력
public class B3533_Explicit_Formula {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int zeroCnt = 0; // 10개의 변수 중 0인 개수
		for (int i = 0; i < 10; i++) { // zeroCnt 세기
			if (Integer.parseInt(st.nextToken()) == 0) {
				zeroCnt++;
			}
		}
		int onePairsCnt = 45 - (zeroCnt * (zeroCnt - 1) / 2); // 결과가 1인 쌍의 개수
		int oneTripletsCnt = 120 - (zeroCnt * (zeroCnt - 1) * (zeroCnt - 2) / 6); // 결과가 1인 삼중조합의 개수
		System.out.println(((onePairsCnt + oneTripletsCnt) % 2 == 1) ? 1 : 0); // 함수 결과 출력
		br.close();
	}
}
