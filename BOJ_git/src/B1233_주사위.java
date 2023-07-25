import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 합의 등장 횟수를 저장하는 배열을 사용하여 합의 최빈값 찾기
public class B1233_주사위 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int S1 = Integer.parseInt(s[0]); // 첫번째 주사위 면 개수
		int S2 = Integer.parseInt(s[1]); // 두번째 주사위 면 개수
		int S3 = Integer.parseInt(s[2]); // 세번째 주사위 면 개수
		int leng = S1 + S2 + S3 + 1; // 합의 등장 횟수를 저장하는 배열의 길이
		int cnt[] = new int[leng]; // 합의 등장 횟수 저장
		for (int i = 1; i <= S1; i++) { // 등장 횟수 구하기
			for (int j = 1; j <= S2; j++) {
				for (int k = 1; k <= S3; k++) {
					cnt[i + j + k]++;
				}
			}
		}
		int maxVal = 0; // 최빈값을 가지는 합
		int maxCnt = 0; // 최대 등장 횟수
		for (int i = 1; i < leng; i++) { // 배열 순회
			if (maxCnt < cnt[i]) {
				maxVal = i;
				maxCnt = cnt[i];
			}
		}
		System.out.println(maxVal); // 출력
		br.close();
	}
}