import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32515
// 같은 기저를 사용한 자리만 비교가 유효
// 정훈이의 키값과 이안의 측정값이 같으면 정상 -> 새로운 키에 추가
// 다르면 태균이가 도청
public class B32515_BB84 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 기저와 키의 길이
		char[] jBasis = br.readLine().toCharArray(); // 정훈의 기저
		char[] jkey = br.readLine().toCharArray(); // 정훈의 키
		char[] iBasis = br.readLine().toCharArray(); // 이안의 기저
		char[] iresult = br.readLine().toCharArray(); // 이안의 측정값
		for (int i = 0; i < N; i++) {
			if (jBasis[i] == iBasis[i]) { // 기저가 같음
				if (jkey[i] == iresult[i]) { // 키와 측정값이 같음
					sb.append(jkey[i]); // 새로운 키에 추가
				} else { // 키와 측정값이 다름
					sb.setLength(0); // 이전 결과 리셋
					sb.append("htg!");
					break;
				}

			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
