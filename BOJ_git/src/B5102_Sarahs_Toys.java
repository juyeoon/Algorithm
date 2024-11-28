import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/3181
// 방에 있는 인형만 짝 지어줌 (전체 수 - 밖의 수)
// 2개씩 짝 지어줄 수 있을 때 => 2로 나눈 몫 출력
// 2개씩 짝 지어줄 수 없을 때
// => 1개일 때 => 2개 그룹 X, 3개 그룹 X
// => 3개 이상 일 때 => 2개 그룹 = 2로 나눈 몫 - 1, 3개 그룹 1개(있음)
public class B5102_Sarahs_Toys {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			int remain = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()); // 방에 있는 인형 수
			if (remain == 1) { // 1개일 때는 짝을 지을 수 없음
				sb.append("0 0\n");
			} else if (remain % 2 == 1) { // 2개씩 짝 지어줄 수 없을 때
				sb.append(remain / 2 - 1).append(" 1\n"); // 한 개의 짝에 1개를 더 넣어 3개 그룹으로 만듦
			} else { // 2개씩 짝 지어줄 수 있을 때
				sb.append(remain / 2).append(" 0\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
