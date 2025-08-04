import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/31833
// 숫자형으로 하면 수가 너무 크기 때문에 문자열로 저장하여 비교
// 1. 길이가 짧은 수가 더 작은 수
// 2. 길이가 같으면 큰 자리부터 같은 자리의 숫자를 비교해서 작은 숫자가 있는 쪽이 더 작은 수
public class B31833_온데간데없을뿐더러 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 배열의 원소 개수
		String A = br.readLine().replaceAll(" ", ""); // 배열 A
		String B = br.readLine().replaceAll(" ", ""); // 배열 B
		String ans = A; // 정답 초기화 (A나 B 둘 다 정답이 되는 경우)
		// 길이가 짧으면 더 작은 수
		if (A.length() > B.length()) {
			ans = B;
		} else if (A.length() < B.length()) {
			ans = A;
		} else { // 길이가 같으면
			// 큰 자리수부터 같은 자리의 숫자를 비교해서 더 작은 숫자가 있는 쪽이 더 작은 수
			for (int i = 0; i < A.length(); i++) {
				if (A.charAt(i) > B.charAt(i)) {
					ans = B;
					break;
				} else if (A.charAt(i) < B.charAt(i)) {
					ans = A;
					break;
				}
			}
		}
		System.out.println(ans); // 출력
		br.close();
	}
}
