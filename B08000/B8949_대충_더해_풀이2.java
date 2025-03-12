import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀이2
// 수  A, B를 int형으로 변환 후 %10으로 맨 뒷자리끼리 더한 후 배열에 저장
// 두 수의 모든 수를 더할 때까지(A > 0 || B > 0) 반복
// 마지막으로 사용한 인덱스부터 역순으로 출력
public class B8949_대충_더해_풀이2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[0]); // 수 A
		int B = Integer.parseInt(s[1]); // 수 B
		int ans[] = new int[7]; // 각 자리 수를 더한 값
		int idx = 6; // ans의 idx
		while (A > 0 || B > 0) { // 둘 모두 0이 되면 계산 종료
			ans[idx--] = A % 10 + B % 10; // 맨 뒷 자리 더하기
			A /= 10; // 맨 뒷자리 제거
			B /= 10; // 맨 뒷자리 제거
		}
		while (++idx < 7) { // 계산한 결과 출력 저장
			sb.append(ans[idx]);
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
