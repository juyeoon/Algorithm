import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10156 - 과자
public class B10156_과자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		// 총 과자 가격 - 현재 동수가 가진 돈
		int answer = Integer.parseInt(s[0]) * Integer.parseInt(s[1]) - Integer.parseInt(s[2]); 
		System.out.println(answer <= 0 ? 0 : answer); // 동수가 가진 돈이 더 많거나 같으면 0, 그 외에는 더 받아야하는 돈
		br.close();
	}
}