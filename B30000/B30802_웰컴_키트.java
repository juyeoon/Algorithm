import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 필요한 티셔츠 묶음 수 => (각 사이즈별로 T로 나눈 몫, 나머지가 있으면 +1)의 합
// 펜 주문 묶음 수 => 인원 수 / 한 묶음의 펜 개수
// 펜 주문 낱개 수 => 인원 수 % 한 묶음의 펜 개수
public class B30802_웰컴_키트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int tShirt[] = new int[6]; // 사이즈별 신청자의 수
		for (int i = 0; i < 6; i++) { // tShirt[] 채우기
			tShirt[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken()); // 한 묶음의 티셔츠 수
		int P = Integer.parseInt(st.nextToken()); // 한 묶음의 펜 수
		int shirtSum = 0; // 필요한 티셔츠 묶음 수
		for (int i = 0; i < 6; i++) { // 각 사이즈별로 T로 나눈 몫, 나머지가 있으면 +1
			shirtSum += tShirt[i] / T + (tShirt[i] % T != 0 ? 1 : 0);
		}
		sb.append(shirtSum).append("\n"); // 티셔츠 최소 주문 묶음 수
		sb.append(N / P).append(" ").append(N % P); // 펜 주문 묶음 수, 펜 주문 낱개 수
		System.out.println(sb);
		br.close();
	}
}