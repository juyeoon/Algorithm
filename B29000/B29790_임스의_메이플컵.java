import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 출제 조건 만족 여부와 레벨 조건 만족 여부를 각각 boolean 값으로 확인 후 값에 따라 출력
public class B29790_임스의_메이플컵 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]); // 문제 해결 개수
		int U = Integer.parseInt(s[1]); // 유니온 레벨
		int L = Integer.parseInt(s[2]); // 최고 레벨
		boolean solve = false; // 백준의 대회 문제 출제 조건 만족 여부(true: 만족)
		boolean level = false; // 레벨 조건 만족 여부 (true: 만족)
		if (N >= 1000) { // 백준의 대회 문제 출제 조건 만족 여부
			solve = true;
		}
		if (U >= 8000 || L >= 260) { // 레벨 조건 만족 여부
			level = true;
		}
		if (solve && level) { // 출제 조건, 레벨 조건 둘 다 만족
			System.out.println("Very Good");
		} else if (solve && !level) { // 출제 조건 만족, 레벨 조건 불만족
			System.out.println("Good");
		} else { // 그 외
			System.out.println("Bad");
		}
		br.close();
	}
}