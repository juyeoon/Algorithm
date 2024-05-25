import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 난이도를 int 배열에 저장 후 3명의 동아리 부원의 사용 기술 횟수와 난이도를 곱한 값을 전부 합한 후 최댓값 갱신
public class B23348_스트릿_코딩_파이터 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int level[] = new int[3]; // 난이도
		for (int i = 0; i < 3; i++) { // level[] 채우기
			level[i] = Integer.parseInt(st.nextToken());
		}
		int N = Integer.parseInt(br.readLine()); // 참가한 동아리의 수
		int max = Integer.MIN_VALUE; // 가장 높은 점수
		for (int i = 0; i < N; i++) { // 동아리마다 계산
			int sum = 0; // 동아리 팀원의 점수 합
			for (int j = 0; j < 3; j++) { // 동아리 팀원마다 계산
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < 3; k++) { // 난이도마다 계산
					sum += Integer.parseInt(st.nextToken()) * level[k];
				}
			}
			max = Math.max(sum, max); // 최댓값 갱신
		}
		System.out.println(max); // 출력
		br.close();
	}
}