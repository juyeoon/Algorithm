import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 0일 0시 0분을 기준으로 11일 11시 11분과 입력 받은 날짜를 분으로 계산
// (입력 받은 날짜 - 11일 11시 11분)이 음수이면 -1 출력 그외에는 뺀 값 출력
public class B5928_Contest_Timing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int D = Integer.parseInt(s[0]); // 날
		int H = Integer.parseInt(s[1]); // 시
		int M = Integer.parseInt(s[2]); // 분
		int pivot = 11 + 11 * 60 + 11 * 60 * 24; // 11일 11시 11분을 분으로
		int ans = M + H * 60 + D * 60 * 24 - pivot; // 입력 받은 날짜를 분으로 계산 후 pivot 빼기
		System.out.println(ans < 0 ? -1 : ans); // ans가 음수면 -1 아니면 ans 출력
		br.close();
	}
}