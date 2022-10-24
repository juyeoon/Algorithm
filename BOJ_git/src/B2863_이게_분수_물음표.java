import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1. 입력 받은 수를 배열에 넣음
// [0] [3]
// [1] [2]
// 2. 반복문을 4번 반복하여 최댓값과 최댓값일 때의 회전 횟수를 구함
// i: 0~3
// 값: num[(0 + i) % 4] / num[(1 + i) % 4] + num[(3 + i) % 4] / num[(2 + i) % 4]
public class B2863_이게_분수_물음표 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		double[] num = new double[4]; // 입력 받은 수 배열
		// 배열 넣기
		st = new StringTokenizer(br.readLine());
		num[0] = Double.parseDouble(st.nextToken());
		num[3] = Double.parseDouble(st.nextToken());
		st = new StringTokenizer(br.readLine());
		num[1] = Double.parseDouble(st.nextToken());
		num[2] = Double.parseDouble(st.nextToken());

		double maxValue = Double.MIN_VALUE; // 최댓값
		int maxCnt = -1; // 최댓값일 때 회전 횟수
		for (int i = 0; i < 4; i++) { // 4번까지 회전
			double value = num[(0 + i) % 4] / num[(1 + i) % 4] + num[(3 + i) % 4] / num[(2 + i) % 4]; // 회전 했을 때의 값
			if (maxValue < value) { // 현재 최댓값보다 현재 값이 크면 갱신
				maxValue = value;
				maxCnt = i;
			}
		}
		System.out.println(maxCnt); // 최댓값일 때 회전 횟수 출력
		br.close();
	}
}
