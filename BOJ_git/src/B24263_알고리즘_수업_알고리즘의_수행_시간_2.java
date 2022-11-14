import java.io.*;

// 주어진 MenOfPassion 알고리즘의 시간 복잡도는 O(n)
// 따라서 수행 횟수 = n, 수행 시간은 항상 n에 비례
public class B24263_알고리즘_수업_알고리즘의_수행_시간_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Integer.parseInt(br.readLine()) + "\n1"); // n과 1 출력
		br.close();
	}
}