import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/9226
// 조건에 맞게 분기하여 출력
public class B9226_도깨비말 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("#")) { // EOI
			char first = s.charAt(0); // 첫번째 문자
			if (first == 'a' || first == 'e' || first == 'i' || first == 'u' || first == 'o') { // 첫번째 문자가 모음이면
				sb.append(s).append("ay\n");
			} else { // 첫번째 문자가 자음
				char c[] = s.toCharArray(); // 문자열
				int firstVowel = -1; // 처음으로 나온 모음 위치
				for (int i = 0; i < c.length; i++) {
					if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'u' || c[i] == 'o') { // 모음이 나오면
						firstVowel = i; // 모음 위치 저장
						break;
					}
				}
				if (firstVowel == -1) { // 모음이 없으면
					sb.append(s).append("ay\n");
				} else { // 모음이 있으면
					sb.append(s.substring(firstVowel)).append(s.substring(0, firstVowel)).append("ay\n");
				}
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
