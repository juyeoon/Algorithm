import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6768
// 특정 선수의 등번호(골 스코어러)가 주어질 때, 몇 개의 가능한 조합이 골을 만들 수 있는지 구하는 문제
// => 등번호 J에 대해, 등번호가 1 이상 J-1 이하인 3명의 선수를 선택하는 방법의 수
// => J가 3 보다 클 때 (J - 1) * (J - 2) * (J - 3) / 6
// J가 3 이하일 때는 가능한 조합은 0
public class B6768_Dont_pass_me_the_ball {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int J = Integer.parseInt(br.readLine()); // 등번호
		if (J <= 3) {
			System.out.println(0);
		} else {
			System.out.println((J - 1) * (J - 2) * (J - 3) / 6);
		}
		br.close();
	}
}
