import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 35479 - 루미의 진정한™ 보라색 찾기 2 
// https://www.acmicpc.net/problem/35479
public class B35479_루미의_진정한_보라색_찾기_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		double r = (double) R / 255;
		double g = (double) G / 255;
		double b = (double) B / 255;
		double K = 1 - Math.max(r, Math.max(g, b));
		double C = 0.0;
		double M = 0.0;
		double Y = 0.0;
		if (K != 1) {
			C = (1 - r - K) / (1 - K);
			M = (1 - g - K) / (1 - K);
			Y = (1 - b - K) / (1 - K);
		}
		System.out.printf("%.4f %.4f %.4f %.4f", C, M, Y, K);
		br.close();
	}
}
