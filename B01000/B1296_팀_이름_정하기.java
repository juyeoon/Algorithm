import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1296
public class B1296_팀_이름_정하기 {
	public static int[] loveCnt(String s) { // "LOVE" 각각의 문자 등장 개수
		int[] ret = new int[4];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'L') {
				ret[0]++;
			} else if (c == 'O') {
				ret[1]++;
			} else if (c == 'V') {
				ret[2]++;
			} else if (c == 'E') {
				ret[3]++;
			}
		}
		return ret;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yeonduName = br.readLine();
		int[] yeonduLove = loveCnt(yeonduName); // 연두 이름에서의 L,O,V,E 개수
		String maxName = ""; // 우승 확률이 가장 높은 팀
		int maxVal = -1; // 우승 확률
		int N = Integer.parseInt(br.readLine()); // 팀 개수
		for (int i = 0; i < N; i++) {
			String name = br.readLine(); // 후보 이름
			int nameVal = 1; // 이름 우승 확률
			int[] nameLove = loveCnt(name); // 이름에서의 L,O,V,E 개수
			// 확률을 구하는 공식에 적용
			for (int j = 0; j < 4; j++) {
				for (int k = j + 1; k < 4; k++) {
					nameVal *= ((yeonduLove[j] + nameLove[j]) + (yeonduLove[k] + nameLove[k])) % 100;
					nameVal %= 100;
				}
			}
			if (maxVal < nameVal) { // 이전 확률보다 높은 확률
				maxVal = nameVal;
				maxName = name;
			} else if (maxVal == nameVal && maxName.compareTo(name) > 0) { // 이전 확률이랑 같을 때 사전 순으로 이름이 앞서면 갱신
				maxVal = nameVal;
				maxName = name;
			}
		}
		System.out.println(maxName); // 우승할 확률이 가장 높은 팀 이름 출력
		br.close();
	}
}
