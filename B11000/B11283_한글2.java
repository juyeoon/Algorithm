import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//'가' => 44032
public class B11283_한글2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.readLine().charAt(0) - 44031);
	}
}
