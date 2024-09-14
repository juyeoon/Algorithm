import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// n년간의 신입 부원의 수가 주어졌을 때 최대의 부원 수를 가지는 연도를 찾는 문제
// n년에 입부한 부원들은 n+3년에 퇴부
// 0부터 2년까지는 입부 부원만 있으므로 최댓값의 초기값을 0~2년 입부 부원의 합으로 정하고
// 3년부터 n-1년까지 i연도의 신입 부원을 더하고 i-3의 신입 부원을 뺀 후 최댓값과 비교하여 최댓값 갱신 
// 끝난 후 최댓값 출력
public class B32089_部員の変遷 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine().trim()).equals("0")) { // EOI
			int n = Integer.parseInt(s); // 신입생을 받는 횟수
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a[] = new int[n]; // 신입생이 들어오는 수
			for (int i = 0; i < n; i++) { // a[] 채우기
				a[i] = Integer.parseInt(st.nextToken());
			}
			int now = a[0] + a[1] + a[2]; // 3년간의 부원의 총 수
			int max = now; // 3년 간은 퇴부하는 부원이 없으므로 최대값과 같음
			for (int i = 3; i < n; i++) { // 이후 연도는 퇴부하는 부원이 있음
				now += a[i] - a[i - 3]; // 올해의 총 부원 수
				max = Math.max(max, now); // 최댓값 갱신
			}
			sb.append(max).append("\n"); // 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}