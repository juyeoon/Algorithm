import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 속도 = 거리 / 시간 = 회전수 * 지름 * PI
// 마일 = 인치 / 63360
// 시 = 초 / 3600
public class B2765_자전거_속도 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		int tc = 1; // 데이터 번호
		while (!s[1].equals("0")) { // 회전수가 0이면 종료
			sb.append("Trip #").append(tc++).append(": "); // 출력 양식
			double d = Double.parseDouble(s[0]) / 63360; // 지름(inch -> miles)
			int r = Integer.parseInt(s[1]); // 회전 수
			double t = Double.parseDouble(s[2]) / 3600; // 걸린 시간 (sec -> hour)
			double distance = r * d * Math.PI; // 총 거리(miles)
			sb.append(String.format("%.2f", distance)).append(" "); // 총 거리 출력
			sb.append(String.format("%.2f", distance / t)).append("\n"); // 평균 속도 출력(거리(miles)/시간(hour))
			s = br.readLine().split(" "); // 다음 데이터 가져오기
		}
		System.out.println(sb); // 출력
		br.close();
	}
}