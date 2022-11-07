import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 가장 긴 변이 다른 두 변의 합보다 크거나 같을 때 - Invalid
// 세 변이 같을 때 - Equilateral
// 세 변이 다 다를 때 - Scalene
// 그 외 - Isosceles
public class B5073_삼각형과_세_변 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String s = "";
		while (!(s = br.readLine()).equals("0 0 0")) {
			st = new StringTokenizer(s);
			int leg[] = new int[3]; // 세 변
			for (int i = 0; i < 3; i++) {
				leg[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(leg); // 크기 오름차순으로 정렬
			if (leg[2] >= leg[0] + leg[1]) { // 가장 긴 변이 다른 두 변의 합보다 크거나 같을 때
				sb.append("Invalid\n");
			} else if (leg[0] == leg[1] && leg[1] == leg[2]) { // 세 변이 같을 때
				sb.append("Equilateral\n");
			} else if (leg[0] != leg[1] && leg[1] != leg[2] && leg[2] != leg[0]) { // 세 변이 다 다를 때
				sb.append("Scalene\n");
			} else { // 그 외
				sb.append("Isosceles\n");
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}