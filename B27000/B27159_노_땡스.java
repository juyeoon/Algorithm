import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오름차순으로 입력받은 정수를 뒤에서부터 하나씩 확인
// 현재 카드의 앞 카드가 1만큼 작은 카드가 아니면 현재 카드가 그룹에서 가장 작은 수이기 때문에 현재 수를 합에 더함
public class B27159_노_땡스 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 카드의 개수
		int sum = 0; // 합
		String s[] = br.readLine().split(" "); // 카드의 정수
		for (int i = N - 1; i > 0; i--) { // 뒤에서부터 확인
			int num = Integer.parseInt(s[i]); // 현재 카드 정수
			if (num - 1 != Integer.parseInt(s[i - 1])) { // 앞에 있는 카드가 연속된 카드가 아니면
				sum += num; // 합에 현재 카드 더하기
			}
		}
		sum += Integer.parseInt(s[0]); // 처음 카드 더하기
		System.out.println(sum); // 출력
		br.close();
	}
}