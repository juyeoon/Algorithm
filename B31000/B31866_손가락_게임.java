import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/31866
// 손가락 개수를 가위바위보로 바꾼 후 무효인 경우를 걸러내고 가위바위보를 적용해서 승부를 내는 함수를 적용하여 결과 확인
public class B31866_손가락_게임 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int j = Integer.parseInt(st.nextToken());
		int i = Integer.parseInt(st.nextToken());
		char rspJ = toRSP(j); // 준성이 낸 가위바위보
		char rspI = toRSP(i); // 익준이 낸 가위바위보
		char ans = '='; // 출력값
		if (rspJ == rspI) { // 같은 표식이면 무승부
			ans = '=';
		} else if (rspJ == 'X') { // 준성 무효
			ans = '<';
		} else if (rspI == 'X') { // 익준 무효
			ans = '>';
		} else { // 가위바위보 적용
			if (doRSP(rspJ, rspI)) { // 준성이 이기는지
				ans = '>';
			} else if (doRSP(rspI, rspJ)) { // 익준이 이기는지
				ans = '<';
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}

	// 손가락 개수를 가위바위보로 변환
	public static char toRSP(int num) {
		if (num == 0) {
			return 'R';
		}
		if (num == 2) {
			return 'S';
		}
		if (num == 5) {
			return 'P';
		}
		return 'X';
	}

	// a가 b를 이기면 true
	public static boolean doRSP(char a, char b) {
		return (a == 'R' && b == 'S') || (a == 'S' && b == 'P') || (a == 'P' && b == 'R');

	}
}
