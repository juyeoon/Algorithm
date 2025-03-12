import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/4864
// 배열에 누적합을 저장
// 처음부터 10000까지 다 저장하지 않고 입력 받은 수까지 계산하여 출력
// 만약 입력 수까지 계산이 되지 않았으면 마지막으로 계산한 값부터 입력 수까지 계산하여 출력
public class B4864_Gold_Coins {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		int sum[] = new int[10001]; // idx까지의 누적합
		int lastIdx = 0; // 계산한 마지막 값
		int lastSum = 0; // 마지막 계산할 때 더한 값
		while (!(s = br.readLine()).equals("0")) { // EOI
			int n = Integer.parseInt(s); // n일
			sb.append(n).append(" ");
			if (n > lastIdx) { // n이 아직 계산되지 않았을 때
				while (n >= lastIdx) { // 계산될 때까지 반복
					lastSum++; // 더할 값 갱신
					for (int i = 0; i < lastSum; i++) { // 더할 값만큼 더할 값 더하기
						if (++lastIdx > 10000) { // 배열 인덱스 범위 확인
							break;
						}
						sum[lastIdx] += sum[lastIdx - 1] + lastSum; // 누적합 구하기
					}
				}
			}
			sb.append(sum[n]).append("\n"); // n까지 계산이 되었을 때 출력
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
