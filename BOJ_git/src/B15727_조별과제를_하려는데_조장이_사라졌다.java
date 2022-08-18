import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 성우와 민건의 거리 차를 5로 나눈 후 나머지가 있으면 + 1
public class B15727_조별과제를_하려는데_조장이_사라졌다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine()); // 성우의 현재 위치와 민건이의 집까지의 거리
		System.out.println(L % 5 != 0 ? L / 5 + 1 : L / 5);
	}
}