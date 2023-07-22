import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 빈 병(원래 있던 빈 병 수 + 새로 발견한 빈 병 수)의 수가 새 병으로 바꾸는데 필요한 빈 병의 개수보다 작을 때까지 반복
// 반복할 때마다 반복 횟수 카운트 & 빈 병의 개수에서 새 병으로 바꾸는데 필요한 빈 병의 개수를 빼고 바꾼 한 병을 더함
public class B5032_탄산_음료 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int e = Integer.parseInt(s[0]); // 준민이가 가지고 있는 빈 병의 수
		int f = Integer.parseInt(s[1]); // 그날 발견한 빈 병의 수
		int c = Integer.parseInt(s[2]); // 새 병으로 바꾸는데 필요한 빈 병의 개수
		int empty = e + f; // 빈병
		int cnt = 0; // 반복 횟수
		while (empty >= c) { // 빈 병의 수가 새 병으로 바꾸는데 필요한 빈 병의 개수보다 작을 때까지 반복
			cnt++; // 반복 횟수 카운트
			empty = empty - c + 1; // 빈 병의 수 갱신
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}