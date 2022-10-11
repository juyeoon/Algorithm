import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// String.contains()를 이용하여 이름에 FBI가 있는지 확인
// 있으면 StringBuilder에 추가
// StringBuilder의 길이가 0이면 FBI요원이 없는 것
public class B2857_FBI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 5; i++) { // 5명 확인
			String name = br.readLine(); // 첩보원명
			if (name.contains("FBI")) { // 이름에 FBI 포함
				sb.append(i).append(" "); // 몇 번째인지 출력
			}
		}
		if (sb.length() == 0) { // FBI 요원이 없으면
			sb.append("HE GOT AWAY!");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}