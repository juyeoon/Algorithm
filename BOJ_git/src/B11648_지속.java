import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String의 각 자릴 수로 바꾼 후에 곱하고 다시 String으로 저장 후 카운트
// 한자리 수가 되기 전까지 반복
public class B11648_지속 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // 처음 수
		int cnt = 0; // 단계
		while (s.length() > 1) { // 한자리 수가 되기 전까지 반복
			int num = 1; // 각자리를 곱한 수
			for (int i = 0; i < s.length(); i++) { // 자리 곱하기
				num *= (s.charAt(i) - '0');
			}
			s = Integer.toString(num);
			cnt++; // 단계++
		}
		System.out.println(cnt); // 출력
		br.close();
	}
}