import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/33046
// 원형 큐의 변형
// 모든 주사위의 합을 구하고 4로 나누어 마지막 번호를 구하고 번호가 1번부터 시작하므로 1 더한 값 출력
public class B33046_Alea_Iacta_Est {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		sum += Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		sum += 2; // 주사위를 굴린 사람부터 시작하기 때문에 좌동과 가동의 번호도 추가
		System.out.println(sum % 4 + 1); // 0번부터 생각했기 때문에 1 추가
		br.close();
	}
}
