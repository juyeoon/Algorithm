import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/16674
// 정수 N을 문자열로 받아 자릿수를 하나씩 확인
// 숫자가 2, 0, 1, 8로만 이루어져 있는지 확인. 아니라면 관련 없는 수 → 0 출력
// 2, 0, 1, 8로만 이루어져 있다면 이 네 숫자가 모두 포함되었는지 확인
// 모두 포함되어 있지 않다면 관련 있는 수 → 1 출력
// 모두 포함되어 있다면, 각 숫자의 개수를 비교
// 개수가 모두 같으면 묶여있는 수 → 8 출력
// 개수가 다르면 밀접한 수 → 2 출력
public class B16674_2018년을_되돌아보며 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine(); // 입력된 수를 문자열로 받음
		int[] cnt = new int[10]; // 숫자 0~9까지 등장 횟수를 저장하는 배열
		boolean only2018 = true; // 2, 0, 1, 8 이외의 숫자가 있는지 확인하는 플래그
		for (char c : n.toCharArray()) {
			int digit = c - '0';
			// 2, 0, 1, 8 이외의 숫자가 나오면 관련 없는 수
			if (digit != 2 && digit != 0 && digit != 1 && digit != 8) {
				only2018 = false;
				break;
			}
			cnt[digit]++; // 해당 숫자 카운트 증가
		}
		if (!only2018) {
			System.out.println(0); // 관련 없는 수
		} else {
			// 2, 0, 1, 8이 모두 포함되어 있는지 확인
			if (cnt[2] > 0 && cnt[0] > 0 && cnt[1] > 0 && cnt[8] > 0) {
				// 네 숫자의 개수가 모두 같은지 확인
				if (cnt[2] == cnt[0] && cnt[0] == cnt[1] && cnt[1] == cnt[8]) {
					System.out.println(8); // 묶여있는 수
				} else {
					System.out.println(2); // 밀접한 수
				}
			} else {
				System.out.println(1); // 관련 있는 수
			}
		}
		br.close();
	}
}
