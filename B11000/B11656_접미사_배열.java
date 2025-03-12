import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 접미사 구하기 - String.substring(int) 사용
// 정렬 - Arrays.sort() 사용
public class B11656_접미사_배열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String S = br.readLine(); // 문자열 S
		String arr[] = new String[S.length()]; // 접미사 개수 크기로 배열 생성
		for (int i = 0; i < S.length(); i++) { // input arr
			arr[i] = S.substring(i);
		}
		Arrays.sort(arr); // 정렬
		for (String str : arr) { // 순서대로 sb에 추가
			sb.append(str).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
