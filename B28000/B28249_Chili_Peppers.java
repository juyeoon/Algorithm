import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 문자열에 따라 switch-case문으로 각 매운맛의 합을 구한 후 출력
public class B28249_Chili_Peppers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 추가하는 고추의 수
		int sum = 0; // 총 매운맛
		for (int i = 0; i < N; i++) {
			switch (br.readLine()) { // 고추 이름
			case "Poblano":
				sum += 1500;
				break;
			case "Mirasol":
				sum += 6000;
				break;
			case "Serrano":
				sum += 15500;
				break;
			case "Cayenne":
				sum += 40000;
				break;
			case "Thai":
				sum += 75000;
				break;
			case "Habanero":
				sum += 125000;
				break;
			}
		}
		System.out.println(sum); // 출력
		br.close();
	}
}