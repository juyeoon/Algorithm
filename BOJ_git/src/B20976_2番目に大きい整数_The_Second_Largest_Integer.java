import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 세 수를 오름차순으로 정렬 후 가운데 값 출력
public class B20976_2番目に大きい整数_The_Second_Largest_Integer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int num[] = new int[3]; // 입력 값
		for (int i = 0; i < 3; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 정렬
		System.out.println(num[1]); // 가운데 값 출력
		br.close();
	}
}