import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/14592
public class B14592_2017_아주대학교_프로그래밍_경시대회_Small {
	public static ArrayList<Integer> ans; // 최대 최소를 가지는 번호
	public static int[][] num; // 각 참가자들의 기록

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 참가자 수
		ans = new ArrayList<>();
		num = new int[N + 1][3];
		for (int i = 1; i <= N; i++) { // ans와 num 입력값
			ans.add(i);
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < 3; i++) { // 확인
			if (i == 0) { // 총합이 높은 사람 찾기
				findMaxArr(i);
			} else { // 수가 낮은 사람 찾기
				findMinArr(i);
			}
			if (ans.size() == 1) { // 한 사람으로 추려지면 끝내기
				break;
			}
		}
		System.out.println(ans.get(0)); // 출력
		br.close();
	}

	// 최댓값을 가지는 참가자 목록 찾기
	public static void findMaxArr(int i) { // 0번 항목
		int max = Integer.MIN_VALUE; // max값
		ArrayList<Integer> maxi = new ArrayList<>(); // max를 가지는 참가자
		for (Integer j : ans) { // max 찾기
			if (max == num[j][i]) { // max값과 같은 값을 가지면 목록에 추가
				maxi.add(j);
			} else if (max < num[j][i]) { // max값보다 크면 갱신
				maxi = new ArrayList<>();
				max = num[j][i];
				maxi.add(j);
			}
		}
		ans = maxi; // 우승 후보 목록 갱신
	}

	// 최솟값 가지는 참가자 목록 찾기
	public static void findMinArr(int i) { // 1번 항목, 2번 항목
		int min = Integer.MAX_VALUE; // min값
		ArrayList<Integer> mini = new ArrayList<>(); // min을 가지는 참가자
		for (Integer j : ans) { // min 찾기
			if (min == num[j][i]) { // min값과 같은 값을 가지면 목록에 추가
				mini.add(j);
			} else if (min > num[j][i]) { // min값보다 크면 갱신
				mini = new ArrayList<>();
				min = num[j][i];
				mini.add(j);
			}
		}
		ans = mini; // 우승 후보 목록 갱신
	}
}
