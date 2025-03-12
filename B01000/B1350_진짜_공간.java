import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 필요한 디스크 공간 => 필요한 클러스터 개수 * 클러스터 크기
// 필요한 클러스터 개수 => 파일 크기 / 클러스터 크기, 파일 크기 % 클러스터 크기가 0이 아니면 클러스터 한 개 더 필요
public class B1350_진짜_공간 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 파일 개수
		String s[] = br.readLine().split(" "); // 파일 크기 배열
		int cluster = Integer.parseInt(br.readLine()); // 클러스터 크기
		long cnt = 0; // 클러스터 개수
		for (int i = 0; i < N; i++) {
			int size = Integer.parseInt(s[i]); // 파일 크기
			cnt += size / cluster; // 클러스터 개수 갱신
			if (size % cluster != 0) {
				cnt++;
			}
		}
		System.out.println(cnt * cluster); // 필요한 디스크 공간 출력
		br.close();
	}
}