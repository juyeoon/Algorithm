import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11549 - Identifying tea
// https://www.acmicpc.net/problem/11549
public class B11549_Identifying_tea {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine(); // 차 종류
		String s[] = br.readLine().split(" ");
		int cnt = 0; // 정답을 맞춘 참가자의 수
		for (String str : s) {
			if (str.equals(T))
				cnt++; // 입력받은 답이 정답이면 정답 참가자수 + 1
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}