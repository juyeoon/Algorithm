import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N(2이상)이 2^i 이상 2^(i+1) 미만이면 최종적으로 2^i가 남음 
public class B21756_지우개 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans = 0;
		if (N == 1) { // 1
			ans = 1;
		} else if (N < 4) { // 2~3
			ans = 2;
		} else if (N < 8) { // 4~7
			ans = 4;
		} else if (N < 16) { // 8~15
			ans = 8;
		} else if (N < 32) { // 16~31
			ans = 16;
		} else if (N < 64) { // 32~63
			ans = 32;
		} else { // 64~127
			ans = 64;
		}
		System.out.println(ans); // 출력
		br.close();
	}
}