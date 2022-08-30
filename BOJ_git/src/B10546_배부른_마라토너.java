import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

// map을 사용한 이유는 동명이인이 있을 수도 있기 때문에 일반적인 List를 사용하면 동명이인이 몇 명인지 알 수 없기 때문
public class B10546_배부른_마라토너 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 참가자 수
		Map<String, Integer> person = new HashMap<>(); // 참가자 저장
		for (int i = 0; i < N; i++) { // 참가자 리스트(동명이인 있음)
			String runner = br.readLine();
			person.put(runner, person.getOrDefault(runner, 0) + 1);
		}
		for (int i = 0; i < N - 1; i++) { // 완주자 리스트
			String runner = br.readLine();
			person.put(runner, person.get(runner) - 1);
		}
		for (String key : person.keySet()) { // 완주 못한 사람 sb에 입력
			if (person.get(key) == 1) {
				sb.append(key).append("\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();

	}
}