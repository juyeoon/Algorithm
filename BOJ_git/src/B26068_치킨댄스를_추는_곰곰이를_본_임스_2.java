import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 앞의 "D-"를 뺀 후 int형으로 형변환 후 90과 비교
public class B26068_치킨댄스를_추는_곰곰이를_본_임스_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 기프티콘 개수
		int cnt = 0; // 90일 이하인 기프티콘 개수
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(br.readLine().substring(2)) <= 90) { // 90일 이내인 것
				cnt++;
			}
		}
		System.out.println(cnt); // 90일 이하인 기프티콘 개수 출력
		br.close();
	}
}