import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/32905
// 입력된 모든 줄에 대해서 한 줄에 'A'가 딱 한개만 있어야만 "Yes"를 출력하는 문제
// 한 줄씩 확인
// indexOf("A")로 첫번째 'A' 등장 위치를 찾음
// 첫번째 위치가 -1이거나('A' 0개) 
// 첫번째 위치 +1로 문자열을 자르고 (substring(첫번째 위치 +1))
// 그 문자열에서 'indexOf("A")가 등장 했을 때 ('A' 2개 이상)
// "No" 출력
public class B32905_RACI {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 줄 개수
		int m = Integer.parseInt(st.nextToken()); // 한 줄의 문자 개수 (사용 X)
		boolean yes = true; // 모든 줄이 'A'가 1개일 때
		for (int i = 0; i < n; i++) {
			String s = br.readLine(); // 입력 줄
			int fristA = s.indexOf("A"); // 첫 번째 'A' 위치
			if (fristA == -1) { // 'A'가 0개
				yes = false;
				break;
			} else {
				s = s.substring(fristA + 1);
				if (s.indexOf("A") != -1) { // 'A'가 2개 이상
					yes = false;
					break;
				}
			}
		}
		System.out.println(yes ? "Yes" : "No"); // 출력
		br.close();
	}
}
