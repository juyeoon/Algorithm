import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11월 A일로부터 B주일 후는 (A + B * 7)일 
// 11월은 30일까지이므로 (A + B * 7)이 30을 넘는지 아닌지 확인
public class B27332_11月_November {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine()); // 11월 A일로부터
		int B = Integer.parseInt(br.readLine()); // B주일 후
		System.out.println(A + B * 7 > 30 ? 0 : 1); // 출력
		br.close();
	}
}