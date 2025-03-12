import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이중 for문을 돌면서 w, b, g가 있으면 반복문을 탈출하여 출력
public class B30402_감마선을_맞은_컴퓨터 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cat = 0; // 고양이 종류 (1: 춘배, 2: 나비, 3: 영철)
		loop: for (int i = 0; i < 15; i++) { // 행
			String s[] = br.readLine().split(" ");
			for (int j = 0; j < 15; j++) { // 열
				char c = s[j].charAt(0);
				if (c == 'w') { // 춘배
					cat = 1;
					break loop;
				} else if (c == 'b') { // 나비
					cat = 2;
					break loop;
				} else if (c == 'g') { // 영철
					cat = 3;
					break loop;
				}
			}
		}
		System.out.println(cat == 1 ? "chunbae" : (cat == 2 ? "nabi" : "yeongcheol")); // 출력
		br.close();
	}
}