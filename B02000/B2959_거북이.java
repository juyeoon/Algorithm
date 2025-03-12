import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 만들 수 있는 가장 큰 직사각형의 넓이는
// (입력 받은 수 중 가장 작은 두 수 중 작은 수) * (입력 받은 수 중 가장 큰 두 수 중 작은 수)
// = (첫 번째로 작은 수) * (세 번째로 작은 수)
public class B2959_거북이 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int num[] = new int[4]; // 입력 받은 네 수
		for (int i = 0; i < 4; i++) { // input num[]
			num[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(num); // 오름차순으로 정렬
		System.out.println(num[0] * num[2]); // (첫 번째로 작은 수) * (세 번째로 작은 수)
		br.close();
	}
}