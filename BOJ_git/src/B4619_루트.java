import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// a를 1부터 B까지 하나씩 증가시켜 가며 N의 제곱이 처음으로 B보다 크거나 같은 a를 찾음
// 그 a와 a-1을 각각 저장한 후 각각의 N의 제곱 값과 B의 차이가 더 작은 쪽을 출력
public class B4619_루트 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			st = new StringTokenizer(s, " ");
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int small = 0; // A^N이 B보다 작은 값을 가지는 A값
			int big = 0; // A^N이 B보다 크거나 같은 값을 가지는 A값
			for (int a = 1; a <= B; a++) { // A를 1씩 증가시키며 찾기
				if (B <= Math.pow(a, N)) { // a^N이 B보다 크거나 같은 값을 처음 가지면
					big = a; // B보다 크거나 같은 값을 저장하는 변수에는 a 저장
					small = a - 1; // 작은 값을 저장하는 변수에는 a-1 저장
					break;
				}
			}
			// `big`과 `small`의 N제곱과 B의 차이를 구했을 때 차이가 작은 쪽이 B에 가까운 A
			sb.append((B - Math.pow(small, N)) < (Math.pow(big, N) - B) ? small : big).append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
