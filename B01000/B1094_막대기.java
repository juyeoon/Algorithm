import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 64cm의 길이를 절반으로 나누면서 막대 하나만 남게 유지
// 원하는 길이까지의 남은 길이(X)가 현재 막대의 길이(half)보다 크면 => 절반 길이만큼 남은 길이를 빼고, 절반 막대 둘 중 하나의 막대를 붙일 막대로 빼놓기(카운트) => 막대 하나만 남음
// X가 half보다 작으면 => 절반 막대 둘 중 하나를 버림 => 막대 하나만 남음
// X가 half와 같으면 => 절반 막대 둘 중 하나의 막대를 붙일 막대로 빼놓기(카운트) => 더 이상 진행할 필요 X
public class B1094_막대기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // 원하는 길이 Xcm
		int cnt = 0; // 풀로 붙여서 만들 막대의 수
		int half = 64; // 반으로 나눈 막대의 길이
		if (X == 64) { // 원하는 길이가 64cm면
			cnt = 1; // 1 출력
		} else { // 원하는 길이가 64cm미만이면
			while (half > 1) { // 반으로 나눈 막대의 길이가 1이 될때까지 반복
				half /= 2; // 막대 반으로 나누기
				if (X > half) { // X가 절반의 막대보다 크면
					cnt++; // 절반 크기의 막대를 붙여야하기 때문에 카운트
					X -= half; // 원하는 길이에서 절반 크기의 막대 길이 빼기
				} else if (X == half) { // 절반 크기의 막대가 남은 길이와 같으면
					cnt++; // 카운트
					break; // 반복문 탈출
				}
			}
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}
