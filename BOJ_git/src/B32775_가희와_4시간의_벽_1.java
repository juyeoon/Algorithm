import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/32775
// 항공기를 이용하여 이동한 시간 Fab가 철도를 이용하여 이동한 시간 Sab보다 적으면 항공기, 그 외에는 철도 이용
public class B32775_가희와_4시간의_벽_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Sab = Integer.parseInt(br.readLine()); // 항공기를 이용하여 이동한 시간
		int Fab = Integer.parseInt(br.readLine()); // 철도를 이용하여 이동한 시간
		System.out.println(Sab <= Fab ? "high speed rail" : "flight"); // 출력
		br.close();
	}
}
