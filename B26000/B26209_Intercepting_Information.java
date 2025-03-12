import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열에 0과 1이 아닌 문자가 있으면 읽을 수 없음
public class B26209_Intercepting_Information {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c[] = br.readLine().toCharArray(); // 입력 문자열을 문자 단위로 나눔(공백 포함)
		boolean isBit = true; // 비트를 읽을 수 있는지 없는지 여부(true: 읽을 수 있음(S))
		for (int i = 0; i < 15; i += 2) { // 입력 문자열을 읽기(공백 뛰어넘기)
			if (c[i] != '0' && c[i] != '1') { // 0과 1이 아니면
				isBit = false; // 읽을 수 없음
				break; // 반복문 탈출
			}
		}
		System.out.println(isBit ? 'S' : 'F'); // 출력
		br.close();
	}
}