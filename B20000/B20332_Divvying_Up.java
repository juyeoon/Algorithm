import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/20332
// 여러 상금이 주어졌을 때 3명의 참가자가 동일한 총 상금을 구할 수 있는지 확인하는 문제
// 모든 상금의 총합을 구한 후 3으로 나누어 떨어지면 상금 분배 가능
public class B20332_Divvying_Up {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 대회 수
		String[] prize = br.readLine().split(" "); // 상금
		long total = 0; // 모든 상금의 총합
		for (int i = 0; i < n; i++) { // 합 구하기
			total += Long.parseLong(prize[i]);
		}
		if (total % 3 == 0) { // 공평하게 분배 가능
			System.out.println("yes");
		} else { // 불가능
			System.out.println("no");
		}
		br.close();
	}
}
