import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/29308
// n명의 선수에 대해 [요구 급여, 이름, 국적]이 주어질 때
// 러시아 국적 선수 중 가장 높은 급여를 요구한 선수의 이름을 출력
public class B29308_Закат {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 선수의 수
		int maxSalary = Integer.MIN_VALUE; // 러시아 선수 중 가장 높은 급여
		String maxName = ""; // 가장 높은 급여를 요구한 러시아 선수의 이름
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int salary = Integer.parseInt(st.nextToken()); // 급여
			String name = st.nextToken(); // 선수 이름
			String nationality = st.nextToken(); // 국적
			if (nationality.equals("Russia")) { // 러시아 국적 선수만 비교 대상
				if (maxSalary < salary) { // 현재까지의 최대 급여보다 크면 갱신
					maxSalary = salary;
					maxName = name;
				}
			}
		}
		System.out.println(maxName); // 출력
		br.close();
	}
}
