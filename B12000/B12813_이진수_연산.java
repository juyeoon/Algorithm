import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10만 길이의 이진수를 char 배열에 각 자리 수를 저장한 후 각각 char형으로 계산
public class B12813_이진수_연산 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char A[] = br.readLine().toCharArray(); // 이진수 A
		char B[] = br.readLine().toCharArray(); // 이진수 B
		int leng = A.length; // 이진수 길이(10만)
		for (int i = 0; i < leng; i++) { // A&B
			if (A[i] == '1' && B[i] == '1') { // 1&1=1
				sb.append(1);
			} else {
				sb.append(0);
			}
		}
		sb.append("\n");
		for (int i = 0; i < leng; i++) { // A|B
			if (A[i] == '0' && B[i] == '0') { // 0|0=0
				sb.append(0);
			} else {
				sb.append(1);
			}
		}
		sb.append("\n");
		for (int i = 0; i < leng; i++) { // A^B
			if ((A[i] == '0' && B[i] == '0') || (A[i] == '1' && B[i] == '1')) { // 0^0=0, 1^1=0
				sb.append(0);
			} else {
				sb.append(1);
			}
		}
		sb.append("\n");
		for (int i = 0; i < leng; i++) { // ~A
			if (A[i] == '0') { // ~0=1
				sb.append(1);
			} else {
				sb.append(0);
			}
		}
		sb.append("\n");
		for (int i = 0; i < leng; i++) { // ~B
			if (B[i] == '0') { // ~0=1
				sb.append(1);
			} else {
				sb.append(0);
			}
		}
		System.out.println(sb); // 출력
		br.close();
	}
}