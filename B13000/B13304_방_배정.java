import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 같은 방을 쓸 수 있는 학생들끼리 묶어 학생 수 카운트 (1,2학년/3,4학년 여/3,4학년 남/5,6학년 여/5,6학년 남)
// (각 그룹을 최대인원수로 나눈값 + 나머지가 있으면 +1)의 총 합 출력
public class B13304_방_배정 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 참가 학생 수
		int K = Integer.parseInt(st.nextToken()); // 한 방 최대 인원 수
		int all12 = 0; // 1, 2학년 수
		int girl34 = 0; // 3, 4학년 여학생 수
		int boy34 = 0; // 3, 4학년 남학생 수
		int girl56 = 0; // 5, 6학년 여학생 수
		int boy56 = 0; // 5, 6학년 남학생 수
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken()); // 성별
			int Y = Integer.parseInt(st.nextToken()); // 학년
			if (Y == 1 || Y == 2) { // 1, 2학년
				all12++;
			} else if (Y == 3 || Y == 4) { // 3, 4학년
				if (S == 0) { // 여학생
					girl34++;
				} else { // 남학생
					boy34++;
				}
			} else { // 5, 6학년
				if (S == 0) { // 여학생
					girl56++;
				} else { // 남학생
					boy56++;
				}
			}
		}
		int room = 0; // 필요한 방의 개수
		room += all12 / K + (all12 % K == 0 ? 0 : 1);
		room += girl34 / K + (girl34 % K == 0 ? 0 : 1);
		room += boy34 / K + (boy34 % K == 0 ? 0 : 1);
		room += girl56 / K + (girl56 % K == 0 ? 0 : 1);
		room += boy56 / K + (boy56 % K == 0 ? 0 : 1);
		System.out.println(room); // 출력
		br.close();
	}
}