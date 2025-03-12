import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 배달원들의 도착 시간을 개들의 루틴(공격시간+쉬는시간)으로 나눈 나머지로 변경(0일때 루틴시간이 되게 변경)
// 계산한 도착시간에 공격시간을 빼서 0이하면 공격시간에 해당
public class B2991_사나운_개 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 개1의 공격적인 시간
		int B = Integer.parseInt(s[1]); // 개1의 쉬는 쉬간
		int C = Integer.parseInt(s[2]); // 개2의 공격적인 시간
		int D = Integer.parseInt(s[3]); // 개2의 쉬는 시간
		s = br.readLine().split(" ");
		for (int i = 0; i < 3; i++) {
			int cnt = 0; // 공격하는 개의 수
			int n = Integer.parseInt(s[i]) % (A + B); // 개1의 루틴으로 나눈 나머지
			if (n == 0) { // 0이면 루틴값으로 변경
				n = A + B;
			}
			if (n - A <= 0) { // 공격 시간 안에 들어가면
				cnt++; // 카운트
			}
			n = Integer.parseInt(s[i]) % (C + D); // 개2의 루틴으로 나눈 나머지
			if (n == 0) { // 0이면 루틴값으로 변경
				n = C + D;
			}
			if (n - C <= 0) { // 공격 시간 안에 들어가면
				cnt++; // 카운트
			}
			sb.append(cnt).append("\n"); // 카운트 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}