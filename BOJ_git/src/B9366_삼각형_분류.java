import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// 입력값을 오름차순으로 정렬 후 각 삼각형의 조건에 맞게 조건 분기
public class B9366_삼각형_분류 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()); // 테스트케이스
		for (int tc = 1; tc <= T; tc++) {
			sb.append("Case #").append(tc).append(": ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			int abc[] = new int[3]; // 삼각형 변의 길이
			for (int i = 0; i < 3; i++) { // abc[] 값 넣기
				abc[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(abc); // 오름차순 정렬
			if (abc[0] + abc[1] <= abc[2]) { // 삼각형 생성 조건
				sb.append("invalid!\n");
			} else if (abc[0] == abc[1] && abc[1] == abc[2]) { // 정삼각형 조건
				sb.append("equilateral\n");
			} else if (abc[0] == abc[1] || abc[1] == abc[2]) { // 이등변삼각형 조건
				sb.append("isosceles\n");
			} else { // 그 외
				sb.append("scalene\n");
			}
		}
		bw.write(sb.toString()); // 출력
		bw.flush();
		bw.close();
		br.close();
	}
}