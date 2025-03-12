import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 학점의 합과 평점의 합을 구하기
// 평점 => 성적을 앞 문자 뒷 문자로 분리 후 각각이 의미하는 수를 합하고 그 값을 학점으로 나누기
public class B2755_이번학기_평점은_몇점 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 과목수
		int creditSum = 0; // 과목 학점 합
		double gradeSum = 0; // 평점 합
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			st.nextToken();
			int credit = Integer.parseInt(st.nextToken()); // 학점
			creditSum += credit; // 학점 합 갱신
			String gradeA = st.nextToken(); // 성적(알파벳)
			if (gradeA.equals("F")) { // F
				continue;
			}
			char grade1 = gradeA.charAt(0); // 성적 앞
			char grade2 = gradeA.charAt(1); // 성적 뒤
			double grade = 0; // 성적(숫자)
			if (grade1 == 'A') {
				grade += 4;
			} else if (grade1 == 'B') {
				grade += 3;
			} else if (grade1 == 'C') {
				grade += 2;
			} else if (grade1 == 'D') {
				grade += 1;
			}
			if (grade2 == '+') {
				grade += 0.3;
			} else if (grade2 == '-') {
				grade -= 0.3;
			}
			gradeSum += grade * credit; // 평점 합 갱신
		}
		System.out.println(String.format("%.2f", gradeSum / creditSum)); // 평균 평점 소수점 둘째짜리까지 출력
		br.close();
	}
}