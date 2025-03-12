import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25932_Find_the_Twins {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()); // 데이터 세트 수
		for (int i = 0; i < n; i++) {
			String s = br.readLine(); // 등번호 10개
			String num[] = s.split(" "); // 등번호 배열
			boolean zack = false; // zack 존재 여부(true: 존재)
			boolean mack = false; // mack 존재 여부(true: 존재)
			for (int j = 0; j < 10; j++) {
				int tmp = Integer.parseInt(num[j]); // 등번호
				if (tmp == 18) { // 18이 있으면
					mack = true; // mack 있음
				} else if (tmp == 17) { // 17이 있으면
					zack = true; // zack 있음
				}
			}
			sb.append(s).append("\n"); // 입력 문자열 출력에 저장
			if (zack && mack) { // 둘 다 있음
				sb.append("both");
			} else if (zack && !mack) { // zack만 있음
				sb.append("zack");
			} else if (!zack && mack) { // mack만 있음
				sb.append("mack");
			} else { // 둘 다 없음
				sb.append("none");
			}
			sb.append("\n\n");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}