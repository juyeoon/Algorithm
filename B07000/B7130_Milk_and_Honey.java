import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/7130
// 소와 벌을 배치했을 때의 행복 중 큰 값을 선택해 더하기
public class B7130_Milk_and_Honey {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long M = Long.parseLong(st.nextToken()); // 우유 단위당 행복
		long H = Long.parseLong(st.nextToken()); // 꿀 단위당 행복
		int N = Integer.parseInt(br.readLine()); // 필드 수
		long total = 0; // 전체 최대 행복 합
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			long C = Long.parseLong(st.nextToken()); // 해당 필드가 수용 가능한 소 마릿수
			long B = Long.parseLong(st.nextToken()); // 해당 필드가 수용 가능한 벌 마릿수
			total += Math.max(C * M, B * H); // 해당 필드에서 소를 둘 때의 행복과 벌을 둘 때의 행복 중 큰 값을 선택
		}
		System.out.println(total); // 출력
		br.close();
	}
}
