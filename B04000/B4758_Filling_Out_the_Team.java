import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/4758
// 주어진 값을 기반으로 선수가 어떤 표지션을 맡을 수 있는지 판별하는 문제
// 각 선수에 대해 조건을 만족하는 포지션을 공백으로 구분해 출력하고, 어떤 포지션도 만족하지 않으면 "No positions"을 출력
public class B4758_Filling_Out_the_Team {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0")) { // EOI
			StringTokenizer st = new StringTokenizer(s);
			double speed = Double.parseDouble(st.nextToken());
			double weight = Double.parseDouble(st.nextToken());
			double strength = Double.parseDouble(st.nextToken());
			boolean canPlay = false; // 포지션 가능 여부 플래그
			if (speed <= 4.5 && weight >= 150 && strength >= 200) { // Wide Receiver 조건 확인
				sb.append("Wide Receiver ");
				canPlay = true;
			}
			if (speed <= 6.0 && weight >= 300 && strength >= 500) { // Lineman 조건 확인
				sb.append("Lineman ");
				canPlay = true;
			}
			if (speed <= 5.0 && weight >= 200 && strength >= 300) { // Quarterback 조건 확인
				sb.append("Quarterback ");
				canPlay = true;
			}
			if (!canPlay) { // 어떤 포지션도 해당되지 않을 경우
				sb.append("No positions ");
			}
			sb.setLength(sb.length() - 1); // 마지막에 남는 공백 제거
			sb.append("\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}
