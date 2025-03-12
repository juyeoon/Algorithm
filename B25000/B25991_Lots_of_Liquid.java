import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 여러 정육면체의 한 변의 길이가 주어지고 안에 액체가 있을 때, 그 액체를 전부 넣을 수 있는 정육면체의 한 변의 최소 길이를 구하는 문제
// (한 변의 길이 ^ 3)의 합의 세제곱근을 출력
public class B25991_Lots_of_Liquid {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 정육면체의 개수
		String s[] = br.readLine().split(" ");
		double v = 0; // 액체의 총 부피
		for (int i = 0; i < n; i++) {
			double tmp = Double.parseDouble(s[i]); // 한 정육면체의 한 변의 길이
			v += tmp * tmp * tmp; // 부피 합 계산
		}
		System.out.println(Math.cbrt(v)); // 부피의 세제곱근 출력
		br.close();
	}
}