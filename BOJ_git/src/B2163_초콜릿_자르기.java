import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최소로 자르기 위한 횟수는 한 조각만 들고 자를 수 있기 때문에
// (한 방향으로 균열 개수) + (한 방향으로 잘랐을 때의 한 조각에 있는 균열 개수) * (한 방향으로 잘랐을 때의 한 조각 개수)
public class B2163_초콜릿_자르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 가로 크기
		int M = Integer.parseInt(s[1]); // 세로 크기
		System.out.println((N - 1) + (M - 1) * N); // 최소 횟수 출력
		br.close();
	}
}