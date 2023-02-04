import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 6 과목(모든 과목)의 합을 구한 후, 4 과목 중 최솟값과 2 과목 중 최솟값을 빼기
public class B11948_과목선택 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 모든 과목의 점수의 합
		int min1 = Integer.MAX_VALUE; // 물리, 화학, 생물, 지구과학 중 최소점
		int min2 = Integer.MAX_VALUE; // 역사, 지리 중 최소점
		for (int i = 0; i < 4; i++) { // 총점 구하기 / 물리, 화학, 생물, 지구과학 중 최소점 구하기
			int temp = Integer.parseInt(br.readLine());
			sum += temp; // 총점 갱신
			min1 = Math.min(min1, temp); // 최솟값 구하기
		}
		for (int i = 0; i < 2; i++) { // 총점 구하기 / 역사, 지리 중 최소점 구하기
			int temp = Integer.parseInt(br.readLine());
			sum += temp; // 총점 갱신
			min2 = Math.min(min2, temp); // 최솟값 구하기
		}
		System.out.println(sum - min1 - min2); // 선택 과목 총 점수 출력
		br.close();

	}
}