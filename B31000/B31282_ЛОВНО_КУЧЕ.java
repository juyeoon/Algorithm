import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사냥개보다 토끼가 N만큼 앞에 있고 토끼가 한 점프에 M, 사냥개는 K만큼 움직일 때, 사냥개가 토끼를 잡을 수 있는 최소 점프 횟수를 구하는 문제
// 사냥개 위치 + 사냥개의 한 점프의 이동거리 * 점프 횟수  >= 토끼의 위치 + 토끼의 한 점프의 이동거리 * 점프 횟수
// 0 + K * x >= M * x + N
// x >= N / (K - N)
// 정수 출력이므로 N / (K - N)을 올림한 값 출력
public class B31282_ЛОВНО_КУЧЕ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		double N = Double.parseDouble(s[0]); // 사냥개와 토끼가 떨어진 길이
		int M = Integer.parseInt(s[1]); // 토끼 점프 거리
		int K = Integer.parseInt(s[2]); // 사냥개 이동 거리
		System.out.println((int) (Math.ceil(N / (K - M)))); // 출력
		br.close();
	}
}