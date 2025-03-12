import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 헬멧 최대 방어력과 조끼 최대 방어력을 합쳐서 출력
// 한 종류당 최대 10억이기 때문에 long 사용
public class B15781_헬멧과_조끼 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num[] = new int[2]; // 방어구 개수
		num[0] = Integer.parseInt(st.nextToken()); // 헬멧 개수
		num[1] = Integer.parseInt(st.nextToken()); // 조끼 개수
		long total = 0; // 총 방어력
		for (int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			long max = 0; // 최대 방어력
			for (int j = 0; j < num[i]; j++) {
				max = Math.max(max, Long.parseLong(st.nextToken())); // 최대 방어력 갱신
			}
			total += max; // 총 방어력 갱신
		}
		System.out.println(total); // 출력
		br.readLine();
	}
}