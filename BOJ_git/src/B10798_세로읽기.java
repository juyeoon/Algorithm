import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2차원 배열에 최대 글자 크기로 생성한 후 입력 문자열을 한 문자씩 저장
// 2차원 배열을 한 열씩 StringBuilder에 저장한 후 출력
// 단, char 배열의 초기값인 '\0'인 경우 저장하지 않음 
public class B10798_세로읽기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char c[][] = new char[5][15]; // 문자열 저장 배열
		for (int i = 0; i < 5; i++) { // input c[][]
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				c[i][j] = s.charAt(j);
			}
		}
		// input sb
		for (int j = 0; j < 15; j++) { // 열
			for (int i = 0; i < 5; i++) { // 행
				if (c[i][j] == '\0') { // 초기값이면 넘어가기
					continue;
				}
				sb.append(c[i][j]); // 문자 저장
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}