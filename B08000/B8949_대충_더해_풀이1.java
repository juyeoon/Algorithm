import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀이1
// 두 수 A, B를 String으로 받은 후 각 자리 수를 charAt-'0'으로 더한 후 결과값을 지금까지의 결과값 앞에 더하기
// 두 수 중 길이가 짧은 것만큼 반복
// 남은 부분은 substring으로 결과값 앞에 더하고 출력
public class B8949_대충_더해_풀이1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		String ans = ""; // 결과값
		int aIdx = s[0].length() - 1; // 수 A의 idx
		int bIdx = s[1].length() - 1; // 수 B의 idx
		while (aIdx >= 0 && bIdx >= 0) { // 두 수의 짧은 길이만큼 반복
			ans = ((s[0].charAt(aIdx) - '0') + (s[1].charAt(bIdx) - '0')) + ans; // 결과값 앞에 자리수 더한 값 추가
			aIdx--;
			bIdx--;
		}
		if (aIdx != -1) { // 수 A에 남은 부분이 있으면
			ans = s[0].substring(0, aIdx + 1) + ans;
		} else if (bIdx != -1) { // 수 B에 남은 부분이 있으면
			ans = s[1].substring(0, bIdx + 1) + ans;
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
