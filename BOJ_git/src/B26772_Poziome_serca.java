import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 여러 행으로 이루어진 하트를 가로로 n개 출력하는 문제
// 하트를 한 줄씩 나눠서 연속으로 n개씩 출력 저장 & 개행을 반복
public class B26772_Poziome_serca {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 하트 개수
		String heart[] = { " @@@   @@@  ", "@   @ @   @ ", "@    @    @ ", "@         @ ", " @       @  ",
				"  @     @   ", "   @   @    ", "    @ @     ", "     @      " }; // 하트 모양을 한 행씩 저장한 배열
		for (int i = 0; i < 9; i++) { // 행
			for (int j = 0; j < N; j++) { // 하트 열
				sb.append(heart[i]);
			}
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}