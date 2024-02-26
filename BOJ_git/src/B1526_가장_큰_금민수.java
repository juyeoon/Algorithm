import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 정답이 입력값과 같은 길이 or 같은 길이-1의 길이를 가짐
// 입력값의 앞에서부터 정답의 해당 자리에 4와 7 중 무엇이 가능한지 확인
// i) 입력값의 현재 자리의 수가 7보다 크면 => 현재 자리는 7 뒤도 전부 7
// ii) 현재 자리 수가 7이면 => 현재 자리는 7 뒤는 확인 필요
// iii) 현재 자리 수가 4와 7 사이이면(포함x) => 현재 자리는 4 뒤는 전부 7
// iv) 현재 자리 수가 4이면 => 현재 자리는 4 뒤는 확인 필요
// v) 현재 자리 수가 4 미만이면 => 정답값의 현재 자리에서 앞으로 가면서 봤을 때 제일 가까운 7의 자리의 답이 4 그 뒤는 전부 7
// 만약 앞에 7이 없는 경우 => 입력값의 길이-1의 길이를 가지며 전부 7로 이루어짐
public class B1526_가장_큰_금민수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String N = br.readLine(); // 입력값
		int leng = N.length(); // 입력값의 길이
		int ans[] = new int[leng]; // 정답
		boolean allSeven = false; // true : 최대값(정답)이 입력값의 길이-1의 길이를 가지며 전부 7로 이루어져 있을 때
		Loop: for (int i = 0; i < leng; i++) { // 입력값의 자리 앞에서 하나씩 확인
			int num = N.charAt(i) - '0'; // 입력값의 현재 자리의 숫자
			if (num > 7) { // 7보다 크면 현재 자리는 7 뒤도 전부 7
				while (i < leng) {
					ans[i++] = 7;
				}
				break Loop;
			} else if (num == 7) { // 7이면 현재 자리는 7 뒤는 다시 확인
				ans[i] = 7;
			} else if (4 < num && num < 7) { // 4와 7 사이(포함 x)이면 현재 자리는 4 뒤는 전부 7
				ans[i] = 4;
				while (++i < leng) {
					ans[i] = 7;
				}
				break Loop;
			} else if (num == 4) { // 4이면 현재 자리는 4 뒤는 다시 확인
				ans[i] = 4;
			} else { // 3 이하면 앞으로 제일 가까운 7이 4 그 뒤는 전부 7
				while (--i >= 0) {
					if (ans[i] == 7) {
						ans[i] = 4;
						while (++i < leng) {
							ans[i] = 7;
						}
						break Loop;
					}
				}
				if (i < 0) { // 앞에 7이 없으면 입력값의 길이-1의 길이를 가지며 전부 7로 이루어짐
					allSeven = true;
					break Loop;
				}
			}
		}
		// 출력 저장
		if (allSeven) {
			for (int i = 1; i < leng; i++) {
				sb.append(7);
			}
		} else {
			for (int i = 0; i < leng; i++) {
				sb.append(ans[i]);
			}
		}
		bw.write(sb.toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}