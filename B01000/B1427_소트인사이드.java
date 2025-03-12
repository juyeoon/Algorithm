import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 각 자리수를 배열에 넣고 오름차순으로 정렬 후, 뒤에서부터 출력
public class B1427_소트인사이드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		int num[] = new int[s.length()]; // 숫자(각 자리수) 배열
		for (int i = num.length - 1; i >= 0; i--) { // input
			num[i] = s.charAt(i) - '0';
		}
		Arrays.sort(num); // 오름차순 정렬
		for (int i = num.length - 1; i >= 0; i--) { // output(배열 뒤에서부터)
			sb.append(num[i]);
		}
		System.out.println(sb); // 출력
	}
}
