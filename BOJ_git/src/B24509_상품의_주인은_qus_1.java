import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 1번 제출 - 성능면에서 2번보다 떨어짐
// LinkedList에 int[]를 넣고 int[1]로 정렬하면서 최댓값 저장 및 삭제하고 다시 int[2]로 정렬하는 걸 int[4]까지 반복
public class B24509_상품의_주인은_qus_1 {
	static int idx; // 반복하여 정렬할 때 필요 (과목 인덱스)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;

		int N = Integer.parseInt(br.readLine()); // 학생 수
		List<int[]> list = new LinkedList<>(); // 학생의 점수를 기록 // list의 요소 - 학생의 점수 배열
		for (int i = 0; i < N; i++) { // input list
			st = new StringTokenizer(br.readLine());
			int[] temp = new int[5];
			for (int j = 0; j < 5; j++) {
				temp[j] = Integer.parseInt(st.nextToken());
			}
			list.add(temp);
		}
		for (idx = 1; idx <= 4; idx++) { // 과목마다 반복
			Collections.sort(list, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[idx] == o2[idx]) { // 점수가 같으면
						return o1[0] - o2[0]; // 학생 번호가 앞인 학생이 위로
					}
					return o2[idx] - o1[idx]; // 점수가 높은 학생이 위로
				}
			});
			sb.append(list.get(0)[0]).append(" "); // 가장 높은 점수를 가진 학생 번호를 sb에 입력
			list.remove(0); // 최고 점수 학생 list에서 제거(중복을 피하기 위함)
		}
		System.out.println(sb); // 출력
		br.close();
	}
}