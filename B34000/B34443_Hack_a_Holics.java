import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34443
// 해커톤에 참석했을 때 학생들이 수상할 것으로 기대할 수 있는 상품의 누적 금전적 가치를 계산하는 문제
public class B34443_Hack_a_Holics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 학생들이 참석할 해커톤의 수
		int C = Integer.parseInt(br.readLine()); // 학생들을 해커톤에 보내는 데 사용할 금액
		int P = Integer.parseInt(br.readLine()); // 상품의 평균 금전적 가치
		System.out.println(N * P);
		br.close();
	}
}
