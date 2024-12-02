import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/20735
// 주어진 문자열에 대소문자 구분 없이 "pink"나 "rose"가 포함된 문자열의 개수를 찾는 문제
// 대소문자 구분이 없으므로 입력 문자열을 모두 소문자로 변경한 후
// String.indexOf("찾는 문자열")이 -1이 아니면 문자열이 존재
public class B20735_Fifty_Shades_of_Pink {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 확인할 문자열의 수
		int cnt = 0; // "pink" 또는 "rose"가 포함된 문자열의 수
		for (int i = 0; i < N; i++) {
			String s = br.readLine().toLowerCase(); // 입력 문자열을 소문자로 변경
			if (s.indexOf("pink") != -1 || s.indexOf("rose") != -1) { // "pink"나 "rose"가 하나라도 포함되어 있으면
				cnt++; // 카운트
			}
		}
		System.out.println(cnt == 0 ? "I must watch Star Wars with my daughter" : cnt); // 조건에 맞게 출력
		br.close();
	}
}
