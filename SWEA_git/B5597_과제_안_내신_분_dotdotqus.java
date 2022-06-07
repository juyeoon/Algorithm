import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1~30을 저장하는 배열(boolean)을 생성하여 제출한 사람을 true로 저장, false인 두 번호 출력
public class B5597_과제_안_내신_분_dotdotqus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean check[] = new boolean[31]; // 1~30 저장(0번 사용 X)
		for (int i = 0; i < 28; i++) {
			check[Integer.parseInt(br.readLine())] = true; // 제출한 사람을 true로
		}
		for (int i = 1; i <= 30; i++) {
			if(!check[i]) sb.append(i).append("\n"); // false인 번호 출력(오름차순)ㄹ
		}
		System.out.println(sb);
	}
}
