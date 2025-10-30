import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34584
// 무조건 take it 해야하는 경우가 아닌 모든 경우에는 double it
// 무조건 take it 해야하는 경우 : 제시해야 할 금액이 소지금을 넘어갈 때
public class B34584_Take_It_or_Double_It {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()); // 시작 금액
		int d = Integer.parseInt(st.nextToken()); // 소지금
		System.out.println((x * 2 > d) ? "take it" : "double it"); // 출력
		br.close();
	}
}
