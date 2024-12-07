import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32775
// 항공기를 이용하여 역 a -> 공항 a -> 공항 b -> 역 b 루트로 이동한 시간 Ma+Fab+Mb가
// 철도를 이용하여 역 a -> 역 b로 이동한 시간 Sab보다 적고
// Sab가 4시간 이상이면 항공기, 그 외에는 철도 이용
public class B32776_가희와_4시간의_벽_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Sab = Integer.parseInt(br.readLine()); // 철도를 이용하여 이동한 시간
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Ma = Integer.parseInt(st.nextToken()); // 역 a -> 공항 a 이동 시간
		int Fab = Integer.parseInt(st.nextToken()); // 항공기를 이용하여 이동한 시간
		int Mb = Integer.parseInt(st.nextToken()); // 공항 b -> 역 b 이동 시간
		if (Sab <= 4 * 60 || Sab <= (Ma + Fab + Mb)) { // 철도를 이용할 조건 하나라도 만족하면 철도
			System.out.println("high speed rail");
		} else { // 아니면 항공기
			System.out.println("flight");
		}
		br.close();
	}
}
