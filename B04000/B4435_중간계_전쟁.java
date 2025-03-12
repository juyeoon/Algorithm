import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 간달프와 사우론 군대의 종족 점수를 각각의 배열에 저장 후 
// 입력 받은 값과 하나씩 곱하여 총 합 구하여 비교
public class B4435_중간계_전쟁 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		int gandalf[] = { 1, 2, 3, 3, 4, 10 }; // 간달프 군대 종족 점수
		int sauron[] = { 1, 2, 2, 2, 3, 5, 10 }; // 사우론 군대 종족 점수
		for (int tc = 1; tc <= T; tc++) {
			int gSum = 0; // 간달프 군대 총 점수
			int sSum = 0; // 사우론 군대 총 점수
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 6; i++) { // 간달프 군대 총 점수 구하기
				gSum += gandalf[i] * Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 7; i++) { // 사우론 군대 총 점수 구하기
				sSum += sauron[i] * Integer.parseInt(st.nextToken());
			}
			sb.append("Battle ").append(tc).append(": ");
			if (gSum > sSum) { // 간달프 > 사우론
				sb.append("Good triumphs over Evil\n");
			} else if (gSum < sSum) { // 간달프 < 사우론
				sb.append("Evil eradicates all trace of Good\n");
			} else { // 간달프 == 사우론
				sb.append("No victor on this battle field\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}