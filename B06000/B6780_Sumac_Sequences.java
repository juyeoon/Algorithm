import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6780
// 수열이 tn+2 = tn − tn+1 (n ≥ 1)을 만족하고 tm−1 < tm일 때 종료될 때 수열의 길이를 구하는 문제
// t1과 t2가 작은 수이기 때문에 단순히 일반식을 구현하여 반복하면 해결할 수 있음
public class B6780_Sumac_Sequences {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t1 = Integer.parseInt(br.readLine()); // 첫 번째 항
		int t2 = Integer.parseInt(br.readLine()); // 두 번째 항
		int leng = 2; // 수열의 길이
		while (t1 >= t2) { // 수열 종료 조건
			int t3 = t1 - t2; // 그 다음 항 구하기
			t1 = t2; // 재설정
			t2 = t3;
			leng++; // 길이 더하기
		}
		System.out.println(leng); // 출력
		br.close();
	}
}
