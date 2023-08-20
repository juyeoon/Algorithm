import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 양말의 번호인 0~9 크기인 배열을 만든 후 숫자가 등장할 때마다 값 갱신
// 배열을 순회하면서 2로 나눈 나머지가 1인 번호를 출력
public class B28431_양말_짝_맞추기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[10]; // 양말 개수 저장 배열
		for (int i = 0; i < 5; i++) { // 양말 개수 세기
			num[Integer.parseInt(br.readLine())]++;
		}
		int ans = 0; // 한짝만 있는 양말
		for (int i = 0; i < 10; i++) { // 배열 순회
			if (num[i] % 2 == 1) { // 한짝만 있으면
				ans = i;
				break;
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}