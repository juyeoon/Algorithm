import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 입력 받은 수들을 long 배열에 넣은 후(정수 범위 때문에 long 배열 사용) 정렬 후 두 번째 값([1]) 출력
public class B31281_ЗЛАТНАТА_СРЕДА {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" "); // 입력값
		long num[] = new long[3];
		for (int i = 0; i < 3; i++) { // num[] 채우기
			num[i] = Long.parseLong(s[i]);
		}
		Arrays.sort(num); // 정렬
		System.out.println(num[1]); // 중간값 출력
		br.close();
	}
}