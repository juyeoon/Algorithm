import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력이 10000 이하이므로 9진수로 변환했을 때 5자리를 넘어가지 않음
// 9^4부터 9^0까지 나누고 몫을 저장한 후 몫과 나눈 값을 곱한 값을 빼는 작업을 반복
// 앞의 0만 빼기 위해서 boolean값 사용
public class B14491_9진수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 10진수 수
		boolean front0 = true; // false: 처음으로 0이 아닌 숫자가 나왔을 때
		for (int i = 4; i >= 0; i--) {
			int place = (int) Math.pow(9, i); // 나누는 값
			int value = N / place; // 몫(9진수 숫자)
			if (front0 && value != 0) { // front0 갱신
				front0 = false;
			}
			if (!front0) { // 0이 아닌 숫자거나 앞에 0이 아닌 숫자가 나왔을 때만 숫자 출력
				sb.append(value);
			}
			N -= place * value; // N값 갱신
		}
		System.out.println(sb); // 출력
		br.close();
	}
}