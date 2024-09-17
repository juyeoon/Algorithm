import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 홍익이의 등수를 입력받고 입력받은 50개의 점수를 하나씩 확인하며 홍익이의 점수가 나타난 위치(등수)를 구한 후
// 등수에 맞는 학점 출력
public class B17826_나의_학점은 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int hong = Integer.parseInt(br.readLine()); // 홍익이의 학점
		StringTokenizer st = new StringTokenizer(s); // 학생들의 점수 50개
		int idx = 0; // 홍익이의 등수
		for (int i = 1; i <= 50; i++) {
			if (hong == Integer.parseInt(st.nextToken())) { // 홍익이의 점수와 같으면
				idx = i; // 홍익이의 등수를 찾음
				break;
			}
		}
		// 홍익이의 등수에 따른 출력
		if (idx <= 5) {
			System.out.println("A+");
		} else if (idx <= 15) {
			System.out.println("A0");
		} else if (idx <= 30) {
			System.out.println("B+");
		} else if (idx <= 35) {
			System.out.println("B0");
		} else if (idx <= 45) {
			System.out.println("C+");
		} else if (idx <= 48) {
			System.out.println("C0");
		} else {
			System.out.println("F");
		}
		br.close();
	}
}