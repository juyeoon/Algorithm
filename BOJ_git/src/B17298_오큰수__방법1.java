import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

// 스택을 이용(시간복잡도를 줄이기 위해)
// 풀이 1번 (현재 값을 답으로 가지는 위치 찾기)
// 자세한 풀이 : https://bouncy-freedom-637.notion.site/17298-294cda2b73e14eb6ba9779dc85cb7b83?pvs=4
public class B17298_오큰수__방법1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 값의 개수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num[] = new int[N]; // 입력값 저장(초기값), 출력값 저장(마지막 값)
		for (int i = 0; i < N; i++) { // num[] 채우기
			num[i] = Integer.parseInt(st.nextToken());
		}
		Stack<Integer> stack = new Stack<>(); // (인덱스 저장)
		for (int idx = 0; idx < N; idx++) { // 입력값 처음부터 끝까지 확인
			while (!stack.isEmpty() && num[stack.peek()] < num[idx]) { // 스택이 비어있지 않고 맨 위의 인덱스에 해당하는 값이 현재 값보다 작을 때
				num[stack.pop()] = num[idx]; // 현재 값이 그 위치에 대한 답
			}
			stack.push(idx); // 현재 인덱스 넣기
		}
		while (!stack.isEmpty()) { // 입력값을 다 확인한 후 스택에 남은 위치들은 답이 -1
			num[stack.pop()] = -1;
		}
		for (int i : num) { // 출력 저장
			sb.append(i).append(" ");
		}
		bw.write(sb.toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}