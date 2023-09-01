import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 십이지를 A=>0, B=>1, ... , L=> 11로 생각하여 입력받은 연도의 십이지의 수와 십간의 수를 구한 후 십이지를 문자로 변환 후 출력
// 2013년은 앞이 5 뒤가 9
// 2013년과 N의 차이의 12와 10의 나머지로 매칭하여 구함
// 60년 주기로 돌아오기 때문에 (N - 2013) => (N - 2013) % 60
// 앞은 12년 주기이기 때문에 (tmp % 12)에 기준인 2013년의 5를 더한 후 다시 12로 나눈 나머지를 구함
// 앞은 0이하로 내려갈 수 있기 때문에 음수면 12를 더함
// 뒤는 10년 주기이기 때문에 (tmp % 10)에 기준인 2013년의 9를 더한 후 다시 10로 나눈 나머지를 구함
public class B7572_간지_干支 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()); // 연도
		int tmp = (N - 2013) % 60; // 2013년과의 차
		int front = (5 + (tmp % 12)) % 12; // 앞
		int back = (9 + (tmp % 10)) % 10; // 뒤
		if (front < 0) {
			front += 12;
		}
		sb.append((char) (front + 65)).append(back);
		System.out.println(sb); // 출력
		br.close();
	}
}