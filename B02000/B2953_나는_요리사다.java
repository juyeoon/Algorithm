import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 한 줄을 더한 뒤 최댓값과 비교하여 최댓값, 최댓값을 가진 사람 갱신을 반복
public class B2953_나는_요리사다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int max = Integer.MIN_VALUE; // 최고점
		int maxid = 0; // 최고점을 가진 사람 번호
		for (int i = 1; i <= 5; i++) { // 5명이라서 5번 반복
			st = new StringTokenizer(br.readLine());
			int sum = 0; // 한 줄의 합
			for (int j = 0; j < 4; j++) { // 합 구하기
				sum += Integer.parseInt(st.nextToken());
			}
			if (max < sum) { // 저장된 최고점보다 높으면
				max = sum; // 최고점 갱신
				maxid = i; // 번호 갱신
			}
		}
		System.out.println(maxid + " " + max); // 출력
		br.close();
	}
}