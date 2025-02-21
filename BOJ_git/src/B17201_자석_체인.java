import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/17201
// 연결이 안 되는 두 경우 확인 후 하나라도 해당되면 연결 X
// 1) 배열에 ++가 있는 경우
// 2) 배열에 --가 있는 경우
public class B17201_자석_체인 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 자석의 개수
		String s = br.readLine(); // 자석의 배열
		boolean chain = true; // 자석이 연결되어 있는지 여부 (true: 연결되어 있음)
		if (s.indexOf("11") != -1) { // ++로 되어 있는 경우가 있으면 연결 X
			chain = false;
		} else if (s.indexOf("22") != -1) { // --로 되어 있는 경우가 있으면 연결 X
			chain = false;
		}
		System.out.println(chain ? "Yes" : "No"); // 출력
		br.close();
	}
}
