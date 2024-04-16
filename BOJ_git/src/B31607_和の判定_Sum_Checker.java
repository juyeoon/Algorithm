import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 세 값 중 하나의 값이 다른 두 값의 합인지 확인하는 문제
// 세 값을 입력받은 후 오름차순으로 정렬하여 작은 두 값의 합이 가장 큰 값과 같은지 확인
public class B31607_和の判定_Sum_Checker {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[3]; // 입력받은 세 수
		for (int i = 0; i < 3; i++) { // num[] 채우기
			num[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(num); // 오름차순 정렬
		System.out.println(num[0] + num[1] == num[2] ? 1 : 0); // 출력
		br.close();
	}
}