import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 입력값을 int 배열에 넣어 오름차순으로 정렬한 후
// [0]과 [1]의 합이 [2]이면 1 출력
// [0]과 [1]의 곱이 [2]이면 2 출력
// 그 외에는 3 출력
public class B25784_EasytoSolve_Expressions {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int[] num = new int[3]; // 입력값 배열
		for (int i = 0; i < 3; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순 정렬
		if (num[0] + num[1] == num[2]) { // 합
			System.out.println(1);
		} else if (num[0] * num[1] == num[2]) { // 곱
			System.out.println(2);
		} else { // 그 외
			System.out.println(3);
		}
		br.close();
	}
}