import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 60년 주기(최소공배수)로 모든 직위가 바뀜
public class B6888_Terms_of_Office {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int X = Integer.parseInt(br.readLine()); // 모든 직위가 처음으로 바뀌는 해
		int Y = Integer.parseInt(br.readLine()); // 범위(Y년 이내)
		while (X <= Y) {
			sb.append("All positions change in year ").append(X).append("\n");
			X += 60; // 60년 주기로 바뀜
		}
		System.out.println(sb); // 출력
		br.close();
	}
}