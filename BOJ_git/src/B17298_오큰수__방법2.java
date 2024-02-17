import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 스택을 이용(시간복잡도를 줄이기 위해)
// 풀이 2번 (현재 값에 대한 답 찾기)
// 자세한 풀이 : https://bouncy-freedom-637.notion.site/17298-294cda2b73e14eb6ba9779dc85cb7b83?pvs=4
public class B17298_오큰수__방법2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 입력 값의 개수
		String s[] = br.readLine().split(" ");
		Stack<Integer> stack = new Stack<>(); // (값 저장)
		int num[] = new int[N]; // 출력값 저장 (앞에서부터 순서대로 출력하기 위함)
		for (int i = N - 1; i >= 0; i--) { // 입력 값 뒤에서부터 앞으로 전부 확인
			int now = Integer.parseInt(s[i]); // 현재 값
			if (!stack.empty()) { // 스택이 비어있지 않을 때
				while (!stack.empty()) {
					if (stack.peek() > now) { // 맨 위의 값이 현재 값보다 클 때
						num[i] = stack.peek(); // 맨 위의 값이 현재 값에 대한 답
						stack.push(now); // 현재 값 스택에 저장
						break;
					}
					stack.pop(); // 맨 위의 값이 현재 값 이하일 때 맨 위의 값 삭제 (스택이 비거나 큰 값을 찾을 때까지 반복)
				}
			}
			if (stack.empty()) { // 스택이 비어있으면 현재 값보다 큰 값이 없음
				num[i] = -1;
				stack.push(now); // 현재 값 스택에 저장
			}
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