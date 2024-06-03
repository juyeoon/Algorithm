import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력값을 배열에 저장 후 배열의 네 값이 같을 때까지 차이를 구하기
// 차이 구할 땐 임시 배열에 저장 후 원래 배열로 변경
public class B4084_Viva_la_Diferencia {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0 0")) { // EOI
			st = new StringTokenizer(s, " ");
			int num[] = new int[4]; // 네 개의 정수
			for (int i = 0; i < 4; i++) { // num[] 채우기
				num[i] = Integer.parseInt(st.nextToken());
			}
			int cnt = 0; // 계산 횟수
			while (!(num[0] == num[1] && num[1] == num[2] && num[2] == num[3])) { // 수렴하기 전까지 반복
				int diff[] = new int[4]; // 차이 계산 배열
				for (int i = 0; i < 3; i++) { // diff[] 계산
					diff[i] = Math.abs(num[i] - num[i + 1]);
				}
				diff[3] = Math.abs(num[3] - num[0]);
				num = diff; // diff을 num으로 변경
				cnt++; // 카운트
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}