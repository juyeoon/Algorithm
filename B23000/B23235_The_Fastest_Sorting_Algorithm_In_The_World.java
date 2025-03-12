import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 입력 수에 상관없이 Case 번호를 하나씩 증가해서 출력 후 0이 입력되면 멈춤
public class B23235_The_Fastest_Sorting_Algorithm_In_The_World {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		int cnt = 1;
		while (!(s = br.readLine()).equals("0")) { // EOF
			sb.append("Case ").append(cnt++).append(": Sorting... done!\n"); // 몇번째 줄인지 출력
		}
		System.out.println(sb);
		br.close();
	}
}