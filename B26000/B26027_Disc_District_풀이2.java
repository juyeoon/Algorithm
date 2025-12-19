import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/26027
// r^2 + 1은 r^2보다 최소로 증가한 값이므로 (1, r)는 원판 바깥에서 원과의 거리가 최소인 정수 좌표 중 하나
public class B26027_Disc_District_풀이2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		System.out.println(1 + " " + r);
		br.close();
	}
}
