import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 좌표가 수직선 위에 있기 때문에 인접한 좌표 사이의 거리가 각각 몇 번 더해지는지를 구함
// 좌표 a와 좌표 b의 거리와 좌표 b와 좌표 a의 거리가 같기 때문에 모든 조합(순서 없음)에 대한 거리의 합을 구한 후 * 2를 하여 출력
// 모든 조합에 대한 거리의 합 =>
// 가장 작은 좌표와 인근한 좌표의 거리는 총 N-1번 더해짐
// 2번째로 작은 좌표와 3번째로 작은 좌표의 거리는 총 (N-2)*2번 더해짐
// 인근한 좌표들의 거리를 1부터 N-1까지 넘버링하면
// 거리의 합은 (거리 * 횟수) = (diff[i] + diff[N - i]) * (N - i) * i
// i는 1부터 N/2까지
// N이 짝수이면 가운데 거리 값은 2번 더해지므로 한 번을 뺌
// 이렇게 구한 값을 *2하여 출력
public class B2399_거리의_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine()); // 좌표 개수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x[] = new int[N]; // 좌표 배열
		for (int i = 0; i < N; i++) { // x[] 채우기
			x[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(x); // 배열을 오름차순으로 정렬
		long diff[] = new long[N]; // x배열 요소들 간의 차이
		for (int i = N - 1; i > 0; i--) { // diff[] 구하기
			diff[i] = x[i] - x[i - 1];
		}
		// 모든 조합에 대한 거리의 합 구하기
		int end = N / 2;
		long sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += (diff[i] + diff[N - i]) * (N - i) * i;
		}
		if (N % 2 == 0) {
			sum -= diff[end] * (N - end) * end;
		}

		bw.write(String.valueOf(sum * 2)); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}