import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 공약 리스트를 배열에 저장 후 입력 공약이 배열에 포함되는지 확인
public class B29731_2033년_밈_투표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = { "Never gonna give you up", "Never gonna let you down", "Never gonna run around and desert you",
				"Never gonna make you cry", "Never gonna say goodbye", "Never gonna tell a lie and hurt you",
				"Never gonna stop" }; // 공약 배열
		boolean no = true; // 공략이 바뀜 여부 (true: 바뀌지 않음, false: 바뀜) 
		int N = Integer.parseInt(br.readLine()); // 입력 공약 개수
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine(); // 입력 공약
			boolean yes = false; // 입력 공약이 공약에 포함되는지 여부 (true: 포함, false: 불포함)
			for (int j = 0; j < 7; j++) { // 공약 배열 확인
				if (tmp.equals(s[j])) { // 포함되면
					yes = true;
				}
			}
			if(!yes) { // 입력 공약이 공약에 포함되지 않으면
				no = false; // 공약 바뀜
				break;
			}
		}
		System.out.println(no ? "No" : "Yes"); // 출력
		br.close();
	}
}