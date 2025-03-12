import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 임무 시작 시간에서 현재 시간을 빼기
// 뺐을 때 '시' 부분이 음수이면 '시' 부분에 +24, '분'과 '초' 부분에 (+60)*60하여 출력 
public class B1408_24 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int now[] = new int[3]; // 현재 시각
		for (int i = 0; i < 3; i++) { // input now[i]
			now[i] = Integer.parseInt(st.nextToken());
		}
		int start[] = new int[3]; // 임무 시작 시각
		st = new StringTokenizer(br.readLine(), ":");
		for (int i = 0; i < 3; i++) { // input start[]
			start[i] = Integer.parseInt(st.nextToken());
		}
		int remain[] = new int[3]; // 남은 시각
		if (start[2] - now[2] < 0) { // 초 계산
			start[1]--;
			start[2] += 60;
		}
		remain[2] = start[2] - now[2];
		if (start[1] - now[1] < 0) { // 분 계산
			start[0]--;
			start[1] += 60;
		}
		remain[1] = start[1] - now[1];
		remain[0] = start[0] - now[0]; // 시 계산
		if (remain[0] < 0) { // '시' 부분이 음수이면 남은 시각에 계산
			remain[0] += 24; // 시
			remain[1] = (remain[1] + 60) % 60; // 분
			remain[2] = (remain[2] + 60) % 60; // 초
		}
		System.out.println(String.format("%02d:%02d:%02d", remain[0], remain[1], remain[2])); // 출력
		br.readLine();
	}
}