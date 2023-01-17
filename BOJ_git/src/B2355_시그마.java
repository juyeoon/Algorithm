import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 수 하나는 int 범위지만 계산할 때 넘어갈 수 있으므로 long으로 입력 받기
// 입력이 크기 순이 아니므로 long 배열에 저장 후 sort
// 1부터 큰 수까지의 합 - 1부터 (작은 수-1)까지의 합 구하기
public class B2355_시그마 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		long num[] = new long[2]; // 입력 받은 두 수
		for (int i = 0; i < 2; i++) {
			num[i] = Long.parseLong(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 정렬
		System.out.println(num[1] * (num[1] + 1) / 2 - num[0] * (num[0] - 1) / 2); // 1부터 큰 수까지의 합 - 1부터 (작은 수-1)까지의 합 출력
		br.close();
	}
}