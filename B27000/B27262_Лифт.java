import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 엘리베이터로 이동할 때 걸리는 시간
// = (엘리베이터가 있는 층에서 1층까지의 층 개수) * 엘리베이터가 한 층을 이동하는 시간
// + (1층에서 n층까지의 층 개수) * 엘리베이터가 한 층을 이동하는 시간
// 계단으로 오를 때 걸리는 시간 = (1층에서 n층까지의 층 개수) * 계단으로 한 층을 이동하는 시간
public class B27262_Лифт {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); // 도착 목표 층
		int k = Integer.parseInt(s[1]); // 현재 엘리베이터가 있는 층
		int a = Integer.parseInt(s[2]); // 계단으로 한 층을 오르는 시간
		int b = Integer.parseInt(s[3]); // 엘리베이터가 한 층을 이동하는 시간
		int ele = (k - 1) * b + (n - 1) * b; // 엘리베이터를 탈 때 걸리는 시간
		int stair = (n - 1) * a; // 계단으로 오를 때 걸리는 시간
		System.out.println(ele + " " + stair); // 출력
		br.close();
	}
}