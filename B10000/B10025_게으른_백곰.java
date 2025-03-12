import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 슬라이딩 윈도우 사용
// 좌표 최댓값만큼의 크기의 배열을 생성한 후 좌표마다 얼음 값 입력
// 얼음이 닿을 수 있는 범위 크기와 범위 시작값을 구한 후
// 한 칸씩 뒤로 옮기면서 합을 구함 => 합 = 이전 합 - 빠지는 값 + 추가되는 값(슬라이딩 윈도우, 누적합)
// 합과 최댓값을 비교하여 최댓값 갱신
public class B10025_게으른_백곰 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 얼음 양동이 개수
		int K = Integer.parseInt(st.nextToken()); // 좌우로 닿을 수 있는 거리
		int position[] = new int[10000001]; // 얼음 양동이 위치(인덱스), 개수(값_
		for (int i = 0; i < N; i++) { // position[] 채우기
			st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			position[x] = g;
		}
		int size = K * 2 + 1; // 슬라이딩 윈도우 크기(얼음 합을 구할 범위 크기)
		int sum = 0; // 범위 안의 얼음의 합
		for (int i = 0; i < size; i++) { // 초기 sum 값 구하기 ([0,size))
			sum += position[i];
		}
		int max = sum; // 얼음 최대 합 초기값
		int end = 1000000 - K * 2; // 반복문의 끝
		for (int start = 1; start <= end; start++) { // start => 범위 시작 위치
			sum += position[start + K * 2] - position[start - 1]; // 범위 안의 얼음 합 구하기(이전 합+추가되는 값-빠지는 값)
			max = Math.max(max, sum); // 최댓값 갱신
		}
		System.out.println(max); // 최댓값 출력
		br.close();
	}
}