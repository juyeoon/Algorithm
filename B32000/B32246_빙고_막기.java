import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32246
// N이 3 이상이면 첫번째 칸과 마지막 칸을 칠하고 가운데 줄은 '/'형태로 대각선에 칠하면 됨 => N칸
// N이 1이면 한 칸 칠하기 => N칸
// N이 2이면  첫번째 칸과 마지막 칸을 칠하면 '/' 대각션에는 색이 없기 때문에 한 칸을 더 칠해줘야 함 => 3칸
public class B32246_빙고_막기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(N == 2 ? 3 : N); // 2칸일 때만 다르게 출력
		br.close();
	}
}