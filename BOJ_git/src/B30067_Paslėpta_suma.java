import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 9개의 정수가 있고 그 정수들의 합을 추가한 10개의 정수가 주어졌을 때 추가된 수를 찾는 문제
// 처음 9개의 정수를 sum이라고 하면 10개의 정수의 합은 sum+sum이므로 입력받은 정수를 전부 더한 후 /2 한 값을 출력
public class B30067_Paslėpta_suma {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0; // 입력받은 10개의 정수의 합
		for (int i = 0; i < 10; i++) { // sum 구하기
			sum += Integer.parseInt(br.readLine());
		}
		System.out.println(sum / 2); // 출력
		br.close();
	}
}