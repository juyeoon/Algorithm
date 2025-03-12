import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31655
// 유럽이나 미국의 날짜 형식이 주어졌을 때 어느 형식인지 판별하는 문제
// '/'를 기준으로 문자열을 나눈 후 맨 앞의 수(a)와 가운데 수(b)를 저장
// a가 12를 넘으면 a가 일 => EU
// b가 12를 넘으면 b가 일 => US
// a와 b 모두 12 이하면 => either
public class B31655_International_Dates {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "/"); // '/'를 기준으로 나누기
		int a = Integer.parseInt(st.nextToken()); // 맨 앞의 수
		int b = Integer.parseInt(st.nextToken()); // 가운데 수
		if (a > 12) {
			System.out.println("EU");
		} else if (b > 12) {
			System.out.println("US");
		} else {
			System.out.println("either");
		}
		br.close();
	}
}
