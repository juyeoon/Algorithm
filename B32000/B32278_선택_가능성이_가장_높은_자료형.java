import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 정수 N이 long 범위를 넘지 않기 때문에 long 자료형으로 받은 뒤 각 자료형의 범위에 맞게 조건을 사용
public class B32278_선택_가능성이_가장_높은_자료형 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine()); // 정수 N
		if (-32768 <= N && N <= 32767) { // short 범위
			System.out.println("short");
		} else if (-2147483648 <= N && N <= 2147483647) { // int 범위
			System.out.println("int");
		} else { // long long 범위
			System.out.println("long long");
		}
		br.close();
	}
}