import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/33178
// 추천한 학생의 수의 10% 만큼 무료로 강의를 수강할 수 있음
// 무료로 수강할 수 있는 강의 수 = 추천한 학생 수 / 10 (개)
public class B33178_Micromasters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 추천한 학생의 수
		System.out.println(N / 10);
		br.close();
	}
}
