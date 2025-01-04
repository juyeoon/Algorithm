import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/25630
// 팰린드롬이 되려면 앞에서 첫번째, 뒤에서 첫번째 문자가 같아야 하고 앞에서 두번째, 뒤에서 두번째 문자가 같은 식으로
// 진행되어야 하므로 각 위치의 문자가 같지 않은 개수를 출력
public class B25630_팰린드롬_소떡소떡 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char c[] = br.readLine().toCharArray(); // 소떡소떡 배열
		int front = 0; // 앞 인덱스
		int back = N - 1; // 뒤 인덱스
		int cnt = 0; // 바꿔야 하는 개수
		while (front < back) { //
			if (c[front] != c[back]) { // 위치의 문자들이 같지 않으면 카운트
				cnt++;
			}
			front++;
			back--;
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}