import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// N = a * (a+1) / 2 + b * (b+1) / 2 + c * (c+1) / 2 임을 이용
// N이 최대 1,000일 때 가능한 i * (i+1) 값을 다 저장(1<=i<=44)해 놓은 후
// 합이 N*2와 같은 세 개의 i * (i+1) 값의 조합이 존재하지는지 확인
public class B10448_유레카_이론 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int num[] = new int[45]; // i * (i+1) 값
		for (int i = 1; i < 45; i++) { // num[] 채우기
			num[i] = i * (i + 1);
		}
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N2 = Integer.parseInt(br.readLine()) * 2; // N*2 값
			boolean eureka = false; // 3개의 삼각수의 합으로 나타낼 수 있는지 여부(true: 나타낼 수 있음)
			Loop: for (int i = 1; i < 45; i++) { // a
				for (int j = i; j < 45; j++) { // b
					for (int l = j; l < 45; l++) { // c
						int sum = num[i] + num[j] + num[l]; // a * (a+1) + b * (b+1) + c * (c+1) 값
						if (N2 == sum) { // N*2와 a * (a+1) + b * (b+1) + c * (c+1)가 같으면
							eureka = true; // 3개의 삼각수의 합으로 나타낼 수 있음
							break Loop; // 전체 반복문 탈출
						}
					}
				}
			}
			sb.append(eureka ? "1\n" : "0\n"); // 출력 저장
		}

		bw.write(sb.toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}