import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// Stack에 카드를 뒤집을 구역의 카드를 배열에서 찾아 push 후 pop하여 구역에 뒤집어서 배열에 저장을 반복
public class B10804_카드_역배치 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int num[] = new int[21]; // 카드
		for (int i = 1; i < 21; i++) { // input num[]
			num[i] = i;
		}
		for (int i = 0; i < 10; i++) { // 10번 반복
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); // 구역 시작
			int b = Integer.parseInt(st.nextToken()); // 구역 끝
			Stack<Integer> tmp = new Stack<>(); // 뒤집을 카드 저장
			for (int j = a; j <= b; j++) { // Stack에 push
				tmp.push(num[j]);
			}
			for (int j = a; j <= b; j++) { // pop하여 배열에 뒤집어서 저장
				num[j] = tmp.pop();
			}
		}
		for (int i = 1; i <= 20; i++) { // 배열 출력
			sb.append(num[i]).append(" ");
		}
		System.out.println(sb); // 출력
		br.readLine();
	}
}