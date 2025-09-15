import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34323
// M+1 할인 시 M+1개의 가격 => 물건 가격 * M개
// N% 할인 시 M+1개의 가격 => (M+1개) * 물건 가격 * 할인 적용
// = (M+1개) * 물건 가격 * (100 - 할인율) / 100
// * 실수형 계산이 들어가므로 나누기 계산할 때 주의
public class B34323_할인이_필요해 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken()); // 할인율
		long M = Long.parseLong(st.nextToken()); // M+1의 M
		long S = Long.parseLong(st.nextToken()); // 물건 가격
		long salePercent = (M + 1) * S * (100 - N) / 100; // 퍼센트 할인 시 가격
		long salePlusOne = S * M; // M+1 할인 시 가격
		System.out.println(Math.min(salePercent, salePlusOne)); // 출력
		br.close();
	}
}
