import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/34380
// Blaster가 해당 터치다운 이후 달린 총 야드 수 
// = (펜스에서 엔드존 뒤까지 10야드 + 엔드존을 통과하는 10야드 + n야드를 더 달려 n번째 야드 라인에 도착 => 편도) * 2
public class B34380_Blaster_s_Dash {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); // 콜로라도 스쿨 오브 마인즈 풋볼 팀의 점수 (필요 x)
		int V = Integer.parseInt(st.nextToken()); // 상대 팀의 점수
		int n = Integer.parseInt(br.readLine()); // Blaster가 달려간 야드 라인
		int K = Integer.parseInt(br.readLine()); // 현재 켈빈(Kelvin) 단위의 기온
		System.out.println(n * 2 + 40); // 출력
		br.close();
	}
}
