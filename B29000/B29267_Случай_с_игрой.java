import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 현재 카트리지 수와 저장(save)된 카트리지 수를 저장하여 시뮬레이터 구현
public class B29267_Случай_с_игрой {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 행동 수
		int K = Integer.parseInt(st.nextToken()); // 한 상자의 카트리지 수
		int now = 0; // 현재 카트리지 수
		int save = 0; // 저장된 카트리지 수
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			switch (s) {
			case "save": // 저장
				save = now; // 현재 카트리지 수를 `save`에 저장
				break;
			case "load": // 불러오기
				now = save; // 현재 카트리지 수를 `save`에 저장된 값으로 변경
				break;
			case "shoot": // 쏘기
				now--; // 현재 카트리지 수 - 1
				break;
			case "ammo": // 장전
				now += K; // 현재 카트리지 수 + K
				break;
			}
			sb.append(now).append("\n"); // 현재 카트리지 수를 출력에 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}