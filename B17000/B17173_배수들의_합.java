import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 자연수 Ki들을 배열에 저장 후 2부터 N까지의 값을 배열의 값으로 나누었을 때 하나라도 나누어 떨어지면 합에 저장
public class B17173_배수들의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] num = new int[M]; // 정수 Ki
		for (int i = 0; i < M; i++) { // num[] 채우기
			num[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0; // 배수들의 합
		for (int i = 2; i <= N; i++) { // 2부터 N까지 확인
			for (int j = 0; j < M; j++) { // num[] 순회
				if (i % num[j] == 0) { // 하나라도 배수면
					sum += i; // 합에 더하기
					break;
				}
			}
		}
		System.out.println(sum); // 출력
		br.close();
	}
}