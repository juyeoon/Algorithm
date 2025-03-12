import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// W * H 크기의 직사각형의 헛간에 L * L 크기의 정사각형이 최대로 들어갈 수 있는 개수는
// (가로 개수) * (세로 개수) = (W / L) * (H / L)
// 소가 N마리 있으므로 N과 (헛간에 최대로 들어가는 소의 수) 중 최솟값을 출력
public class B19698_헛간_청약 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 소의 마리 수
		int W = Integer.parseInt(s[1]); // 헛간 가로
		int H = Integer.parseInt(s[2]); // 헛간 세로
		int L = Integer.parseInt(s[3]); // 소의 공간의 가로와 세로
		System.out.println(Math.min(N, (W / L) * (H / L))); // 출력
		br.close();
	}
}