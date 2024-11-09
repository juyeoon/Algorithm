import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 그리디 방식으로 가장 앞에 정렬되는 값은 최대한 2개씩 묶었을 때 한 묶음 당 1 2 출력
// 하나가 남으면(문어 수가 홀수면) 3(1은 이미 썼기 때문에 가능한 값은 3) 출력
public class B21313_문어 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 문어 개수
		for (int i = 0; i < N - 1; i += 2) { // 문어가 모자르지 않을 때까지 2개씩 묶어서 1 2 출력
			sb.append("1 2 ");
		}
		if (N % 2 == 1) { // 남은 문어가 있으면 3
			sb.append("3 ");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
