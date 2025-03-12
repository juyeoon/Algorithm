import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// https://www.acmicpc.net/problem/31908
// HashMap으로 반지 특성은 key, 학생 이름은 List<String>을 value로 저장
// 특성이 -면 continue. Map을 다 생성한 이후에는
// key를 순회하면서 학생 이름이 2개만 카운트하고 출력
public class B31908_커플링_매치 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 학생 수
		HashMap<String, List<String>> ring = new HashMap<>(); // 반지 특성 map
		for (int i = 0; i < N; i++) { // map 채우기
			String s[] = br.readLine().split(" ");
			if (s[1].equals("-")) {
				continue;
			}
			ring.putIfAbsent(s[1], new ArrayList<>()); // 새 key 생성
			ring.get(s[1]).add(s[0]); // 이름 추가
		}
		int cnt = 0; // 커플 의심군의 쌍
		for (String key : ring.keySet()) { // map 순회
			List<String> value = ring.get(key); // 이름 목록
			if (value.size() != 2) { // 이름이 2개가 아니면 넘어가기
				continue;
			}
			cnt++; // 커플 의심군 쌍 갱신
			sb.append(value.get(0)).append(" ").append(value.get(1)).append("\n"); // 이름 출력 저장
		}
		String tmp = Integer.toString(cnt) + "\n"; // 의심군 쌍 출력용
		sb.insert(0, tmp);
		System.out.println(sb); // 출력
		br.close();
	}
}
