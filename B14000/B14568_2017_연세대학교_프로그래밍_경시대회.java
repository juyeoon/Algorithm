import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 영훈과 남규의 사탕 수는 연관이 있기 때문에 택희 먼저 제외한 값으로 영훈과 남규의 사탕 수 계산
// 택희 => 2부터 2씩 증가, 영훈과 남규의 합의 최솟값은 4이므로 N-4개까지 가능
// 영훈 => 남규보다 2개 이상으로 적은 사탕을 가져야 하므로 1부터 (택희 개수을 제외한 개수)/2-1까지 가질 수 있음
// 택희 값에 대해 남규가 가지는 값의 경우의 수의 합을 출력
public class B14568_2017_연세대학교_프로그래밍_경시대회 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine()); // 사탕 개수
		int sum = 0; // 나누어 갖는 방법의 수
		for (int i = 2; i <= N - 4; i += 2) { // i => 택희 개수
			int yn = N - i; // 영훈이와 남규가 갖는 사탕의 수
			sum += yn / 2 - 1; // 영훈이가 가질 수 있는 사탕의 수 최댓값 ~ 1개
		}
		bw.write(String.valueOf(sum)); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}