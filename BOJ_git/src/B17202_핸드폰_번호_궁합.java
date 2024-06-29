import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// A의 번호와 B의 번호를 교차하여 배열에 저장한 후 
// 마지막으로 계산할 인덱스(i)를 하나씩 줄여가며
// 계산한 결과를 다시 배열에 저장하여 계산 결과가 2개가 될 때까지 반복
// 반복 종료 후 배열의 0번과 1번을 붙여서 출력
public class B17202_핸드폰_번호_궁합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] A = br.readLine().toCharArray(); // A의 번호
		char[] B = br.readLine().toCharArray(); // B의 번호
		int[] num = new int[16]; // 번호를 교차하여 저장한 배열
		for (int i = 0, j = 0; i < 16; i += 2, j++) { // num[] 채우기
			num[i] = A[j] - '0';
			num[i + 1] = B[j] - '0';
		}
		for (int i = 15; i > 1; i--) { // 마지막으로 계산할 인덱스
			for (int j = 0; j < i; j++) { // 0부터 i까지 계산하여 배열에 저장
				num[j] = (num[j] + num[j + 1]) % 10; // (일의 자리 수만 저장)
			}
		}
		System.out.println(num[0] + "" + num[1]); // 배열의 첫번째와 두번째 숫자를 붙여서 출력
		br.close();
	}
}