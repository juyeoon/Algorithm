import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 사다리꼴의 윗변에서 수직으로 떨어지는 선을 그었을 때 만들어지는 직각삼각형으로 피타고라스 정리를 적용하여 해결
// (사다리꼴 빗변의 길이)^2 = (사다리꼴 높이)^2 + (삼각형 밑변)^2
// (사다리꼴 높이)^2 = (사다리꼴 빗변의 길이)^2 - ((윗변 - 밑변)/2)^2
// = K^2 - ((D1 - D2)/2)^2
public class B16479_컵라면_측정하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine()); // 사다리꼴 빗변의 길이
		String s[] = br.readLine().split(" ");
		double D1 = Double.parseDouble(s[0]) / 2; // 사다리꼴의 윗변
		double D2 = Double.parseDouble(s[1]) / 2; // 사다리꼴의 밑변
		System.out.println(K * K - (D1 - D2) * (D1 - D2)); // 출력
		br.close();
	}
}