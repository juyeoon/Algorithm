import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/6889
// n개의 형용사와 m개의 명사를 입력받아 모든 조합으로 "형용사 as 명사" 형태의 문장을 출력
public class B6889_Smile_with_Similes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 형용사 개수
		int m = Integer.parseInt(br.readLine()); // 명사 개수
		String[] adjectives = new String[n]; // 형용사 배열
		String[] nouns = new String[m]; // 명사 배열
		for (int i = 0; i < n; i++) { // adjectives[] 입력
			adjectives[i] = br.readLine();
		}
		for (int i = 0; i < m; i++) { // nouns[] 입력
			nouns[i] = br.readLine();
		}
		// 모든 형용사와 명사의 조합 출력
		for (String a : adjectives) {
			for (String nn : nouns) {
				sb.append(a).append(" as ").append(nn).append("\n");
			}
		}
		System.out.print(sb); // 출력
		br.close();
	}
}
