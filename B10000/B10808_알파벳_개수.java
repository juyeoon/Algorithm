import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// alpha 배열을 만들어서 a의 개수를 [0]에 ... z의 개수를 [25]에 넣기
public class B10808_알파벳_개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String s = br.readLine(); // 문자열
		int alpha[] = new int[26]; // 알파벳 개수 배열
		int leng = s.length(); // 문자열 길이
		for (int i = 0; i < leng; i++) {
			alpha[s.charAt(i) - 97]++; // 개수 ++
		}
		for (int i : alpha) { // sb에 배열 값 넣기
			sb.append(i).append(' ');
		}
		System.out.println(sb); // 출력
		br.close();
	}
}