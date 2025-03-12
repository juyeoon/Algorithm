import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 가로 * 세로 출력
public class B27323_직사각형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
		br.close();
	}
}