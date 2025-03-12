import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// if문으로 조건 분할
public class B27294_몇개고 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int T = Integer.parseInt(s[0]); // 시각
		int S = Integer.parseInt(s[1]); // 술 마심 여부
		if (S == 1 || T < 12 || T > 16) { // 술을 마셨거나 점심시간이 아니면
			System.out.println(280);
		} else { // 그 외의 경우
			System.out.println(320);
		}
		br.close();
	}
}