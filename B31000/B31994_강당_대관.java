import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대 인원수와 그 인원수를 가지는 세미나 이름을 갱신해나가며 최대 인원수를 가지는 세미나 이름 출력
public class B31994_강당_대관 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		String semina = ""; // 최대 인원수를 가지는 세미나
		int max = 0; // 최대 인원수
		for (int i = 0; i < 7; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken(); // 현재 세미나
			int num = Integer.parseInt(st.nextToken()); // 현재 인원수
			if (num > max) { // 최댓값이면 갱신
				semina = name;
				max = num;
			}
		}
		System.out.println(semina); // 출력
		br.close();
	}
}