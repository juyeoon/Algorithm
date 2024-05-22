import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// T의 절반과 a와 b로 직각삼각형을 만들 수 있고 피타고라스 정리를 활용하면
// a^2 = b^2 + (T/2)^2
// a^2 - b^2 = (T/2)^2
public class B16483_접시_안의_원 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double T = Double.parseDouble(br.readLine()); // 작은 원의 접선이 큰 원과 만나는 두 점 사이의 거리
		System.out.println(String.format("%.0f", (T / 2) * (T / 2))); // 출력
		br.close();
	}
}