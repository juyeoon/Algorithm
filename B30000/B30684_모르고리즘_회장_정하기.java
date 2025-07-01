import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/30684
// 전체 이름 중 세 글자인 이름들만 대상으로 하여, 사전 순으로 가장 앞선 이름 찾기
// 사전 순 비교는 String의 compareTo() 메서드를 사용
public class B30684_모르고리즘_회장_정하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 학생 수
		String ans = "ZZZ"; // 사전 순 비교를 위한 초기값 설정 (가장 뒤에 오는 값으로 초기화)
		for (int i = 0; i < N; i++) {
			String name = br.readLine(); // 후보 학생 이름
			if (name.length() != 3) { // 이름이 세 글자가 아니라면
				continue; // 다음 사람으로 넘어감
			}
			if (name.compareTo(ans) < 0) { // 현재 이름이 ans보다 사전 순으로 앞선다면
				ans = name; // 현재 이름을 ans로 갱신
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
