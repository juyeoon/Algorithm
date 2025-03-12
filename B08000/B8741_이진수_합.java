import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이진수로 나타냈을 때, k자리 이하인 모든 자연수의 합의 이진수는 앞에서부터 연속하여 1이 k개, 0이 k-1개로 이루어짐
public class B8741_이진수_합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine());
		for (int i = 0; i < k; i++) { // 1이 k개
			sb.append("1");
		}
		for (int i = 0; i < k - 1; i++) { // 0이 k-1개
			sb.append("0");
		}
		System.out.println(sb); // 출력
		br.close();
	}
}