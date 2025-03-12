import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 사람의 번호를 0~7(빼기 1)로 생각 (마지막에 8로 나누어서 나머지를 사용하기 위함)
// 'T'가 등장하면 번호에 1씩 더함
// 문제를 다 푼 후의 번호를 8로 나눈 나머지(0~7)에 1을 더하여 사람 번호 출력
// 문제 푸는 시간이 3분 30초를 지나면 (그 시점의 번호%8+1) 출력
public class B9517_아이_러브_크로아티아 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int num = Integer.parseInt(br.readLine()) - 1; // 시작 번호 - 1 (0~7)
		int N = Integer.parseInt(br.readLine()); // 문제 개수
		int time = 0; // 지금까지 지난 시간
		for (int i = 0; i < N; i++) { // 문제 수 만큼 반복
			st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken()); // 문제 푸는 시간
			char Z = st.nextToken().charAt(0); // 문제 해결 여부
			time += T; // 지난 시간 갱신
			if (time >= 210) { // 시간이 3분 30초가 지나면
				break; // 반복문 탈출
			}
			if (Z == 'T') { // 'T'일 때만 다음 사람으로
				num++;
			}
		}
		System.out.println(num % 8 + 1); // 8로 나눈 나머지 + 1이 번호
		br.readLine();
	}
}
