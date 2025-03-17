import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17530
// 각 후보들의 투표수가 주어졌을 때 첫번째 후보인 Carlos가 당선됐는지 확인하는 문제
// 반복문으로 확인하여 더 많은 사람이 있으면 당선 실패
public class B17530_Buffoon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 후보 수
		int C = Integer.parseInt(br.readLine()); // Carlos 투표수
		boolean S = true; // Carlos 당선 여부(true: 당선)
		for (int i = 1; i < N; i++) { // Carlos 뒤 후보부터 확인
			if (Integer.parseInt(br.readLine()) > C) { // 투표수가 더 많은 사람이 있으면 당선 실패
				S = false;
				break;
			}
		}
		System.out.println(S ? "S" : "N"); // 출력
		br.close();
	}
}
