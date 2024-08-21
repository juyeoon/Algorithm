import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// N개의 악보를 0초부터 이어서 부를 때, 질문으로 시각(초)를 물어보면 그 때 부르는 악보의 번호를 출력하는 문제
// 시간당 부르는 악보를 배열의 형태(idx: 시간, val: 악보 번호)로 저장
public class B1392_노래_악보 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 악보의 수
		int Q = Integer.parseInt(st.nextToken()); // 질문의 개수
		int sheet[] = new int[N + 1]; // 악보들의 길이를 저장하는 배열(합을 구하기 위해)
		int sum = 0; // 악보들의 총 길이를 저장(시간별 부르는 악보를 저장하는 배열의 길이를 구하기 위해)
		for (int i = 1; i <= N; i++) { // sheet[] 채우기 및 합 구하기
			sheet[i] = Integer.parseInt(br.readLine());
			sum += sheet[i];
		}
		int second[] = new int[sum]; // 시간별 부르는 악보의 번호를 저장(index: 시간)
		int idx = 0; // second[]의 인덱스
		for (int i = 1; i <= N; i++) { // 악보수만큼 반복
			for (int j = 0; j < sheet[i]; j++) { // 악보의 길이 만큼 반복
				second[idx++] = i; // 악보의 길이만큼 지금 인덱스에 악보번호를 저장 후 인덱스 넘기기
			}
		}
		for (int i = 0; i < Q; i++) { // 질문에 대한 출력 저장
			sb.append(second[Integer.parseInt(br.readLine())]).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
