import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 몬스터의 방어율 수치(a)에서 방무 퍼센트(a의 b퍼센트)를 빼면 데미지 줄 수 있음(1)
public class B25238_가희와_방어율_무시 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = Integer.parseInt(st.nextToken()); // 몬스터의 방어율 수치 a
		int b = Integer.parseInt(st.nextToken()); // 유저의 방무 b
		System.out.println((a - (a * b / 100) < 100) ? "1" : "0"); // a에서 a의 b 퍼센트를 빼면 데미지 줄 수 있음
		br.close();
	}
}
