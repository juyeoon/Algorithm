import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 삼각형 성립 조건에 따라 가장 긴 변이 다른 두 변의 합보다 짧아야 함 => 세 입력 수 다 더하기
// 가장 긴 변이 다른 두 변의 합보다 같거나 긴 경우 => (가장 짧은 두 변의 길이) + (가장 짧은 두 변의 합 - 1)
public class B14215_세_막대 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int num[] = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 입력 정렬
		if (num[0] + num[1] > num[2]) { // 가장 긴 변이 다른 두 변의 합보다 짧은 경우
			System.out.println(num[0] + num[1] + num[2]); // 세 입력 수 다 더하기
		} else { // 그 외의 경우 => (가장 짧은 두 변의 길이) + (가장 짧은 두 변의 합 - 1)
			System.out.println((num[0] + num[1]) * 2 - 1);
		}
		br.readLine();
	}
}