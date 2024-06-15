import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이중 for문으로 수 찍기
// 행 마지막에 공백을 찍으면 안 되기 때문에 열 첫번째 수는 바깥 for문에, 두번째 수부터는 " "+수로 안쪽 for문에 작성
// 마지막 개행을 없애기 위해 StringBuilder의 setLength로 현재 length - 1로 마지막 개행 삭제
public class B18883_N_M_찍기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 행 수
		int M = Integer.parseInt(st.nextToken()); // 열 수
		int cnt = 1; // 입력할 수
		for (int i = 0; i < N; i++) { // 행
			sb.append(cnt++); // 첫번째 수
			for (int j = 1; j < M; j++) { // 열
				sb.append(" ").append(cnt++); // 두번째 수부터
			}
			sb.append("\n");
		}
		sb.setLength(sb.toString().length() - 1); // 마지막 개행 삭제
		System.out.println(sb); // 출력
		br.close();
	}
}