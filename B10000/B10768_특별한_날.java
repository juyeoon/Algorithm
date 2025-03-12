import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 달을 기준으로 먼저 이전과 이후로 나눈 후 2월인 경우에 날로 이전과 이후, Special을 구분
public class B10768_특별한_날 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine()); // 달
		int D = Integer.parseInt(br.readLine()); // 일
		if (M < 2) { // 2월 전이면 이전
			sb.append("Before");
		} else if (M > 2) { // 2월 후면 이후
			sb.append("After");
		} else { // 2월이면
			if (D < 18) { // 18일 전이면 이전
				sb.append("Before");
			} else if (D > 18) { // 18일 후면 이후
				sb.append("After");
			} else { // 18일이면 Special
				sb.append("Special");
			}
		}
		System.out.println(sb); // 출력
		br.close();

	}
}