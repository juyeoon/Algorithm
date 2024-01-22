import java.io.*;

// 1부터 N까지의 홀수의 합은 홀수 개수의 제곱
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine()); // N
            if(N % 2 == 1){ // 홀수이면 +1 (홀수 개수 구할 때 N/2 하기 위해서)
                N++;
            }
            sb.append(N / 2 * N / 2).append("\n"); // 홀수의 합 
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
