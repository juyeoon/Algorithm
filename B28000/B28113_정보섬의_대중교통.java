import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 버스가 오는 시각과 지하철이 오는 시각만 고려해도 됨
// 지하철역까지 가는 시간이 무조건 지하철이 오는 시각보다 빠르기 때문(입력 조건)
public class B28113_정보섬의_대중교통 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int A = Integer.parseInt(s[1]); // 버스가 오는 시각
		int B = Integer.parseInt(s[2]); // 지하철이 오는 시각
		if (A == B) { // 같으면
			System.out.println("Anything");
		} else if (A < B) { // 버스가 더 빨리 오면
			System.out.println("Bus");
		} else { // 지하철이 더 빨리 오면 
			System.out.println("Subway");
		}
		br.readLine();
	}
}