import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 2번 제출 - 성능이 1번보다 뛰어남
// flag를 사용하여 중복을 제거
// 정렬을 하지 않고 반복 순회하면서 최댓값 찾기
public class B24509_상품의_주인은_qus_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine()); // 학생 수
		int score[][] = new int[N][4]; // 학생의 점수를 기록 (인덱스: 학생 번호-1, 저장되는 값: 과목별 점수)
		boolean flag[] = new boolean[N]; // 상품을 받았는지 확인하는 flag (인덱스: 학생 번호-1)

		for (int i = 0; i < N; i++) { // input score[][]
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()) - 1;
			for (int j = 0; j < 4; j++) {
				score[num][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < 4; i++) { // 과목마다 반복
			int max = Integer.MIN_VALUE; // 과목의 최대 점수
			int idx = -1; // 과목의 최대 점수를 받은 학생 번호-1(인덱스)
			for (int j = 0; j < N; j++) { // 최댓값 확인
				if (!flag[j] && score[j][i] > max) { // 상품을 받은 적이 없으면서 현재의 최대점수보다 높은 점수를 받으면
					max = score[j][i]; // 최대 점수 갱신
					idx = j; // 학생 번호 갱신
				}
			}
			flag[idx] = true; // 상품을 받았다고 flag에 체크
			sb.append(idx + 1).append(" "); // sb에 학생 번호 입력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}