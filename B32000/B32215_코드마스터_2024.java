import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 도훈이가 설치한 에디터의 수 + 선생님이 설치한 에디터의 수
// = (한 컴퓨터에 설치해야 하는 에디터의 수 * 도훈이가 설치한 컴퓨터의 수) + (별도의 노트북에 설치해야하는 에디터의 수)
public class B32215_코드마스터_2024 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken()); // 한 컴퓨터에 설치해야 하는 에디터
		int k = Integer.parseInt(st.nextToken()); // 도훈이가 설치한 컴퓨터의 수
		System.out.println(m * k + m); // 도훈이가 설치한 에디터의 수 + 선생님이 설치한 에디터의 수
		br.close();
	}
}