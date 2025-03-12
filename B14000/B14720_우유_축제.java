import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 마실 우유의 종류와 같은 우유를 파는 상점까지 걷기(다른 상점 무시)
// 마실 우유의 종류와 같은 우유를 파는 상점에 도착하면 마실 우유 갱신
public class B14720_우유_축제 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0; // 마실 수 있는 우유의 최대 개수
		int need = 0; // 다음으로 마실 우유의 번호
		String s[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int now = Integer.parseInt(s[i]); // 현재 가게에서 파는 우유의 번호
			if (need == now) { // 마실 우유와 현재 가게에서 파는 우유의 번호가 같으면
				cnt++; // 개수 추가
				need = (need + 1) % 3; // 마실 우유 번호 갱신
			}
		}
		System.out.println(cnt); // 마실 수 있는 우유의 최대 개수 출력
		br.close();
	}
}