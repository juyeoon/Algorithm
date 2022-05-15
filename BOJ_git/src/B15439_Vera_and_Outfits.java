import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//15439 - Vera and Outfits
public class B15439_Vera_and_Outfits {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 의상과 바지 수
		System.out.println(N * N - N); // 의상과 바지가 같은 색이 아닐 때 만들 수 있는 경우의 수
	}
}
