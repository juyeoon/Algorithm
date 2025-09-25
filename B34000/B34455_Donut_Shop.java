import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/34455
// 처음 도넛 수가 주어지고 이벤트마다 추가 or 판매되는 도넛 수가 주어졌을 때
// 가게를 닫을 때 남아잇는 도넛의 수를 구하는 문제
public class B34455_Donut_Shop {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int D = Integer.parseInt(br.readLine()); // 매장이 처음 문을 열 때 도넛의 수
		int E = Integer.parseInt(br.readLine()); // 하루 동안 발생하는 이벤트 수
		for (int i = 0; i < E; i++) {
			char c = br.readLine().charAt(0); // 도넛 추가 or 판매
			int Q = Integer.parseInt(br.readLine()); // 이벤트와 관련된 도넛의 수량
			if (c == '+') {
				D += Q;
			} else {
				D -= Q;
			}
		}
		System.out.println(D); // 가게가 문을 닫을 때 남아 있는 도넛의 수
		br.close();
	}
}
