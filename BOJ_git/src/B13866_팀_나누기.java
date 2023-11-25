import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 입력값 네 수를 오름차순으로 정렬한 후 (가장 큰 값 + 가장 작은 값)과 나머지 두 값의 합의 차를 출력
public class B13866_팀_나누기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int num[] = new int[4]; // 입력값
		for (int i = 0; i < 4; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순 정렬
		System.out.println(Math.abs((num[0] + num[3]) - (num[1] + num[2]))); // 출력
		br.close();
	}
}
