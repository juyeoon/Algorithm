import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// switch-case문으로 입력에 따른 출력 조건 분기
public class B30087_진흥원_세미나 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 세미나 수
		for (int i = 0; i < N; i++) {
			switch (br.readLine()) { // 입력
			case "Algorithm":
				sb.append("204\n");
				break;
			case "DataAnalysis":
				sb.append("207\n");
				break;
			case "ArtificialIntelligence":
				sb.append("302\n");
				break;
			case "CyberSecurity":
				sb.append("B101\n");
				break;
			case "Network":
				sb.append("303\n");
				break;
			case "Startup":
				sb.append("501\n");
				break;
			case "TestStrategy":
				sb.append("105\n");
				break;
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}