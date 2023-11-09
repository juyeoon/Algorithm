import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 양의 정수 -> String의 맨 앞 문자가 '-'가 아니고 '0'이 아닌 것
public class B14909_양수_개수_세기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int leng = s.length; // 입력 정수 개수
		int cnt = 0; // 양이 아닌 정수 개수
		for (int i = 0; i < leng; i++) {
			if (s[i].charAt(0) == '-' || s[i].charAt(0) == '0') { // 양의 정수가 아니면
				cnt++; // 카운트
			}
		}
		System.out.println(leng - cnt); // 전체 정수 개수 - 양이 아닌 정수 개수
		br.close();
	}
}