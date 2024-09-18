import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주어진 수가 한 자리수가 될 때까지 연산
// 각 자리 수 곱하기 => 10으로 나눈 나머지를 곱하고 10으로 나눔 => 0이 될 떄까지 반복
public class B4564_숫자_카드놀이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0")) { // EOI
			int n = Integer.parseInt(s); // 처음 자연수
			while (n > 9) { // 한 자리가 될때까지 반복
				sb.append(n).append(" "); // 현재 값 출력 저장
				int tmp = 1; // 연산 결과
				while (n > 0) { // 각 자리 수 곱하기
					tmp *= n % 10;
					n /= 10;
				}
				n = tmp; // n을 연산 결과로 갱신
			}
			sb.append(n).append("\n"); // 마지막 한자리 수 출력 저장
		}
		System.out.println(sb); // 출력
		br.close();
	}
}