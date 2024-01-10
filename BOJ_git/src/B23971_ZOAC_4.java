import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 강의실이 수용할 수 있는 최대 인원 수 = 세로에 앉을 수 있는 최대 인원 * 가로에 앉을 수 있는 최대 인원
// = 행 수 / (1(앉을 사람) + 세로로 비워야 하는 수) + (나머지가 있으면 1 아니면 0)
// + 열 수  / (1(앉을 사람) + 가로로 비워야 하는 수) + (나머지가 있으면 1 아니면 0)
public class B23971_ZOAC_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int H = Integer.parseInt(s[0]); // 행 수
		int W = Integer.parseInt(s[1]); // 열 수
		int N = Integer.parseInt(s[2]); // 세로로 비워야 하는 수
		int M = Integer.parseInt(s[3]); // 가로로 비워야 하는 수
 		int R = H / (1 + N) + (H % (1 + N) == 0 ? 0 : 1); // 세로에 앉을 수 있는 최대 인원
		int C = W / (1 + M) + (W % (1 + M) == 0 ? 0 : 1); // 가로에 앉을 수 있는 최대 인원
		System.out.println(R * C); // 출력
		br.close();
	}
}