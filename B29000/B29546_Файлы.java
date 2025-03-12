import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 파일 이름 목록이 있고, 구간의 처음과 끝이 주어졌을 때 구간의 시작부터 끝까지의 파일 이름을 출력하는 문제
// 파일 이름을 배열에 저장하고 구간의 시작과 끝 번호까지 반복문으로 출력
public class B29546_Файлы {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 파일 개수
		String name[] = new String[n]; // 파일 이름 목록
		for (int i = 0; i < n; i++) { // name[] 채우기
			name[i] = br.readLine();
		}
		int m = Integer.parseInt(br.readLine()); // 주어지는 구간 개수
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()); // 구간 시작 번호
			int r = Integer.parseInt(st.nextToken()); // 구간 끝 번호
			for (int j = l - 1; j < r; j++) { // 구간 내의 모든 파일 목록 출력
				sb.append(name[j]).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}