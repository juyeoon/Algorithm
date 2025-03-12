import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/11800
// 조검에 맞게 구현
public class B11800_Tawla {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 주사위 눈 1
			int b = Integer.parseInt(st.nextToken()); // 주사위 눈 2
			String result = ""; // 결과를 저장할 변수
			if (a == b) { // 주사위 값이 같은 경우
				switch (a) { // 주사위 값에 따라 고유한 별칭을 정하기 위한 조건문
				case 1:
					result = "Habb Yakk";
					break;
				case 2:
					result = "Dobara";
					break;
				case 3:
					result = "Dousa";
					break;
				case 4:
					result = "Dorgy";
					break;
				case 5:
					result = "Dabash";
					break;
				case 6:
					result = "Dosh";
					break;
				}
			} else {
				// 주사위 값이 다른 경우, 더 큰 값부터 별칭을 부름
				if (a > b) {
					result = getAlias(a) + " " + getAlias(b);
				} else {
					result = getAlias(b) + " " + getAlias(a);
				}
				// 5와 6이 나오는 경우 "Sheesh Bang" 대신 "Sheesh Beesh"로 부름
				if ((a == 5 && b == 6) || (a == 6 && b == 5)) {
					result = "Sheesh Beesh";
				}
			}
			sb.append("Case ").append(tc).append(": ").append(result).append("\n"); // 출력 저장

		}
		System.out.println(sb); // 출력
		br.close();
	}

	// 주사위 값에 맞는 별칭을 반환하는 메서드
	public static String getAlias(int n) {
		switch (n) {
		case 1:
			return "Yakk";
		case 2:
			return "Doh";
		case 3:
			return "Seh";
		case 4:
			return "Ghar";
		case 5:
			return "Bang";
		case 6:
			return "Sheesh";
		default:
			return "";
		}
	}
}
