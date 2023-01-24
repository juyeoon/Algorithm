import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// replace로 숫자 바꾸기
// 최솟값 - 6을 5로 바꾼 값
// 최댓값 - 5를 6으로 바꾼 값
public class B2864_5와_6의_차이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s[] = br.readLine().split(" ");
		sb.append(Integer.parseInt(s[0].replace('6', '5')) + Integer.parseInt(s[1].replace('6', '5'))); // 최솟값
		sb.append(" ");
		sb.append(Integer.parseInt(s[0].replace('5', '6')) + Integer.parseInt(s[1].replace('5', '6'))); // 최댓값
		System.out.println(sb); // 출력
		br.close();
	}
}