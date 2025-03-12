import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 평균 => 입력을 다 더한 다음 10으로 나누기
// 최빈값 => 입력이 1이상 1000보다 작은 10의 배수이므로 101 크기의 횟수를 저장하여 값이 가장 큰 인덱스(+"0") 출력
public class B2592_대표값 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 합
		int cnt[] = new int[101]; // 나타나는 횟수 저장(인덱스: 수/10, 값: 횟수)
		for (int i = 0; i < 10; i++) { // 입력 숫자 10개
			int tmp = Integer.parseInt(br.readLine());
			sum += tmp; // 합 갱신
			cnt[tmp / 10]++; // 횟수 갱신
		}
		int mode = 0; // 최빈값(/10)
		int cntMax = 0; // 최대 등장 횟수
		for (int i = 1; i < 100; i++) { // 횟수 배열 순회
			if (cnt[i] > cntMax) { // 최대 등장 횟수보다 횟수가 크면
				cntMax = cnt[i]; // 최대 등장 횟수 갱신
				mode = i; // 최빈값 갱신
			}
		}
		System.out.println(sum / 10 + "\n" + mode + "0"); // 평균, 최빈값 출력
		br.close();
	}
}