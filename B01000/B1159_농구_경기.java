import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 각 알파벳마다 횟수를 배열에 저장한 후, 5이상인 인덱스를 알파벳으로 치환 후 출력
public class B1159_농구_경기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int a[] = new int[26]; // 알파벳 등장 횟수 저장 ([0]: a, ...)
		int N = Integer.parseInt(br.readLine()); // 선수 수
		for (int i = 0; i < N; i++) {
			a[br.readLine().charAt(0) - 97]++; // 등장 횟수 갱신
		}
		for (int i = 0; i < 26; i++) { // 배열 순회
			if (a[i] >= 5) { // 5 이상인 알파벳
				sb.append((char) (i + 97)); // sb에 추가
			}
		}
		System.out.println(sb.length() == 0 ? "PREDAJA" : sb); // 출력. sb 길이가 0이면 5이상인 알파벳이 없는 것
		br.close();
	}
}